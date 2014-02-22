/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package anuResto.dao;

import anuresto.entities.Spetialite;
import anuResto.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ahmed
 */
public class spetialiteDAO {
    
    public void insertSpetialite(Spetialite s){

        String requete = "insert into spetialite (ID_Spe,Type_Spe,Descri_Spe) values (?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, s.getiDSpe());
            ps.setString(2, s.getTypeSpe());
            ps.setString(3, s.getDescriSpe());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


    public void updateSpetialite(Spetialite s){
        String requete = "update spetialite set Type_Spe=?,Descri_Spe=? where ID_Spe=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, s.getTypeSpe());
            ps.setString(2, s.getDescriSpe());
            ps.setInt(3, s.getiDSpe());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void deleteSpetialite(String id){
        String requete = "delete from spetialite where ID_U=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, id);
            ps.executeUpdate();
            System.out.println("Spetialite supprimée");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Spetialite findSpetialiteById(String id){
    Spetialite spetialite = new Spetialite();
     String requete = "select * from spetialite where ID_U=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                spetialite.setTypeSpe(resultat.getString(2));
                spetialite.setDescriSpe(resultat.getString(3));
            }
            return spetialite;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche du spetialite "+ex.getMessage());
            return null;
        }
    }


       public List<Spetialite> DisplayAllSpetialites (){

        List <Spetialite> listeS = new ArrayList<Spetialite>();
        String requete = "select * from spetialite";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Spetialite spetialite =new Spetialite();
                spetialite.setiDSpe(resultat.getInt(1));
                spetialite.setTypeSpe(resultat.getString(2));
                spetialite.setDescriSpe(resultat.getString(3));


                listeS.add(spetialite);
            }
            return listeS;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des spetialites "+ex.getMessage());
            return null;
        }
    }
    
}
