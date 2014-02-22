/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package anuResto.dao;

/**
 *
 * @author SWIMO
 */
import anuResto.util.MyConnection;
import anuresto.entities.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class ReclamationDAO {
    
     public void insertreclamation(Reclamation r){

        String requete = "insert into reclamation (ID_C,Sujet,Date_Rec,Heure_Rec,Text_Rec) values (?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, r.getIdC().getIdC());
            ps.setString(2, r.getSujet());
            ps.setString(3, r.getDateRec().toString());
            ps.setString(4, r.getHeureRec().toString());
            ps.setString(5, r.getTextRec());
           
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
     public void updaterec(Reclamation r){
        String requete = "update reclamation set ID_C=?,Sujet=?,Date_Rec=?,Heure_Rec=?,Text_Rec=? where ID_Rec=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ps.setInt(1, r.getIdC().getIdC());
            ps.setString(2, r.getSujet());
            ps.setString(3, r.getDateRec().toString());
            ps.setString(4, r.getHeureRec().toString());
            ps.setString(5, r.getTextRec());
             ps.setInt(6,r.getiDRec());
           
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
     public void deletrec(int id){
        String requete = "delete from reclamation where ID_Rec=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("reclamation supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Reclamation findrecById(int id){
    Reclamation r = new Reclamation();
     String requete = "select * from reclamation where ID_Rec=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            
            while (resultat.next())
            {
                r.setiDRec(resultat.getInt(1));
                
            }
            return r;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du note "+ex.getMessage());
            return null;
        }
    }

   
     public List<Reclamation> DisplayAllrestaurateur (){


        List<Reclamation> listrec = new ArrayList<Reclamation>();

        String requete = "select * from evaluation";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Reclamation r =new Reclamation();
                clientDAO cd=new clientDAO();
                r.setIdC(cd.findClientById(resultat.getString(1)));
                r.setSujet(resultat.getString(2));
                r.setDateRec(resultat.getDate(3));
                r.setHeureRec(resultat.getDate(4));
                r.setTextRec(resultat.getString(5));
                
                
                      
                

                listrec.add(r);
            }
            return listrec;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }
    
}
