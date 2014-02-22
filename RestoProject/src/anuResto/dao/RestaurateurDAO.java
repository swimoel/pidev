/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package anuResto.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import anuResto.util.MyConnection;
import anuresto.entities.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SWIMO
 */
public class RestaurateurDAO {
     public void insertRestaurateur(Restaurateur r){

        String requete = "insert into restaurateur (Nom,Prenom,CIN,Tel,Addresse,Ville,Mail) values (?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, r.getNom());
            ps.setString(2, r.getPrenom());
            ps.setString(3, r.getCin());
            ps.setString(4, r.getTel());
            ps.setString(5, r.getAddresse());
            ps.setString(6, r.getVille());
            ps.setString(7, r.getMail());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
     public void updateRestaurateur(Restaurateur r){
        String requete = "update restaurateur set Nom=?,Prenom=?,CIN=?,Tel=?,Addresse=?,Ville=?,Mail=? where ID_R=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, r.getNom());
            ps.setString(2, r.getPrenom());
            ps.setString(3, r.getCin());
            ps.setString(4, r.getTel());
            ps.setString(5, r.getAddresse());
            ps.setString(6, r.getVille());
            ps.setString(7, r.getMail());
            ps.setInt(8,r.getIdR());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
     public void deleteRestaurateur(int id){
        String requete = "delete from Restaurateur where ID_R=?";
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


    public Restaurateur findrestaurateurById(int id){
    Restaurateur r = new Restaurateur();
     String requete = "select * from Restaurateur where ID_R=?";
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

    public Restaurateur findrestaurateurByname(String name){
    Restaurateur r = new Restaurateur();
     String requete = "select * from Restaurateur where Nom = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, name);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                r.setIdR(resultat.getInt(1));
               
                r.setNom(resultat.getString(2));
              
            }
            return r;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }
     public List<Restaurateur> DisplayAllrestaurateur (){


        List<Restaurateur> listerestaurateure = new ArrayList<Restaurateur>();

        String requete = "select * from restaurateure";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Restaurateur r =new Restaurateur();
                r.setIdR(resultat.getInt(1));
                r.setNom(resultat.getString(2));
                r.setPrenom(resultat.getString(3));
                 r.setCin(resultat.getString(4));
                  r.setTel(resultat.getString(5));
                   r.setAddresse(resultat.getString(6));
                    r.setVille(resultat.getString(7));
                     r.setMail(resultat.getString(8));
                      
                

                listerestaurateure.add(r);
            }
            return listerestaurateure;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }

    
}
