/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package anuResto.dao;

import anuResto.util.MyConnection;
import anuresto.entities.Restaurateur;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import anuResto.util.MyConnection;
import anuresto.entities.*;

/**
 *
 * @author SWIMO
 */
public class EvalDAO {
    
    public void insertnote(Evaluation e){

        String requete = "insert into restaurateur (ID_E,ID_C,ID_Restau,Note_E) values (?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, e.getIdE());
            ps.setInt(2, e.getIdc());
            ps.setInt(3, e.getIdrestau());
            ps.setFloat(4, e.getNoteE());
           
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
     public void updatenote(Evaluation e){
        String requete = "update evaluation set ID_C=?,ID_Restau=?,Note_E=? where ID_E=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
         ps.setInt(1, e.getIdc());
            ps.setInt(2, e.getIdrestau());
            ps.setFloat(3, e.getNoteE());
            ps.setInt(4,e.getIdE());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
     public void deletenote(int id){
        String requete = "delete from evaluation where ID_E=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("restaurateur supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Restaurateur findnoteById(int id){
    Restaurateur r = new Restaurateur();
     String requete = "select * from evaluation where ID_E=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            
            while (resultat.next())
            {
                r.setIdR(resultat.getInt(1));
                
            }
            return r;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du note "+ex.getMessage());
            return null;
        }
    }

   
     public List<Evaluation> DisplayAllrestaurateur (){


        List<Evaluation> listnote = new ArrayList<Evaluation>();

        String requete = "select * from evaluation";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Evaluation e =new Evaluation();
                e.setIdE(resultat.getInt(1));
                e.setIdc(resultat.getInt(2));
                e.setIdrestau(resultat.getInt(3));
                e.setNoteE(resultat.getInt(4));
                
                      
                

                listnote.add(e);
            }
            return listnote;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }
    
}
