/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anuResto.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import anuresto.entities.*;
import anuResto.util.MyConnection;
import java.sql.PreparedStatement;
import static java.util.Collections.list;

/**
 *
 * @author SWIMO
 */
public class RestaurantDAO {
     public void insertResto(Restaurant r){

        String requete = "insert into restaurant (ID_R,Nom_R,Rang_R,Descri_R,Lien_Image,Budget,Num_tel,ID_Spe,ID_Amb) values (?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, r.getIdR());
            ps.setString(2, r.getNomR());
           ps.setString(3, r.getRangR().toString());
            ps.setString(4, r.getDescriR());
            ps.setString(5, r.getLienImage());
            ps.setInt(6, r.getBudget());
            ps.setString(7, r.getNumtel());
            ps.setString(8, r.getIDSpe().getTypeSpe());
            ps.setString(9, r.getIDAmb().getDescriAmbe());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
     public void updateRestaurateur(Restaurant r){
        String requete = "update restaurant set ID_R=?,Nom_R=?,Rang_R=?,Descri_R=?,Lien_Image=?,Budget=?,Num_tel=?,ID_Spe=?,ID_Amb=? where ID_Restau=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, r.getIdR());
            ps.setString(2, r.getNomR());
           ps.setString(3, r.getRangR().toString());
            ps.setString(4, r.getDescriR());
            ps.setString(5, r.getLienImage());
            ps.setInt(6, r.getBudget());
            ps.setString(7, r.getNumtel());
            ps.setString(8, r.getIDSpe().getTypeSpe());
            ps.setString(9, r.getIDAmb().getDescriAmbe());
            ps.setInt(10,r.getiDRestau());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
     public void deleteRestaurant(int id){
        String requete = "delete from Restaurant where ID_Restau=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("restaurant supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Restaurant findrestoById(int id){
    Restaurant r = new Restaurant();
     String requete = "select * from Restaurant where ID_Restau=?";
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
            System.out.println("erreur lors de la recherche du restaurateure "+ex.getMessage());
            return null;
        }
    }

    public Restaurant findrestoByname(String name){
    Restaurant r = new Restaurant();
     String requete = "select * from Restaurant where Nom_R = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, name);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                r.setIdR(resultat.getInt(1));
               
                r.setNomR(resultat.getString(2));
              
            }
            return r;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }

    public List<Restaurant> listerresto() {

        List<Restaurant> listeresto = new ArrayList<Restaurant>();

        String requete = "select * from restaurant ";
        try {
            Statement statement = MyConnection.getInstance()
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Restaurant rest = new Restaurant();
                rest.setNomR(resultat.getString(3));
                listeresto.add(rest);
            }
            return listeresto;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des resto " + ex.getMessage());
            return null;
        }
    }

    public List<Restaurant> detailleresto() {

      
List<Restaurant> det = new ArrayList<Restaurant>();


        String requete = "select * from restaurant r ,spetialite s,lieu l,ambiance a "
                + "where r.`ID_Spe`=s.`ID_Spe`  "
                + "and r.`ID_Amb`=a.`ID_Amb`  "
                + "and r.`ID_R`=l.`ID_Region` "
                + "and r.ID_Restau=1;";
              
        try {
            Statement statement = MyConnection.getInstance()
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Restaurant rest = new Restaurant();
                spetialiteDAO sd=new  spetialiteDAO();
                ambianceDAO ab= new ambianceDAO();
                rest.setiDRestau(resultat.getInt(1));
                rest.setIdR(resultat.getInt(2));
                rest.setNomR(resultat.getString(3));
                rest.setRangR(resultat.getDate(4));
                rest.setDescriR(resultat.getString(5));
                rest.setLienImage(resultat.getString(6));
                rest.setBudget(resultat.getInt(7));
                rest.setNumtel(resultat.getString(8));
                rest.setiDSpe( sd.findSpetialiteById(resultat.getString(9)));
                rest.setIDAmb(ab.findAmbianceById(resultat.getString(10)));
                rest.setiDRestau(resultat.getInt(11));
                det.add(rest);
               
            }
return det;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots " + ex.getMessage());
        }
         return null;
    }

}
