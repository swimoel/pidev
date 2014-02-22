/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package anuResto.dao;

import anuresto.entities.Utilisateur;
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
public class utilisateurDAO {
    
    public void insertUtilisateur(Utilisateur u){

        String requete = "insert into utilisateur (ID_U,Login,Password,Type_U) values (?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, u.getIdU());
            ps.setString(2, u.getLogin());
            ps.setString(3, u.getPassword());
            ps.setInt(4, u.getTypeU());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


    public void updateUtilisateur(Utilisateur u){
        String requete = "update utilisateur set Login=?,Password=?,Type_U=? where ID_U=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, u.getLogin());
            ps.setString(2, u.getPassword());
            ps.setInt(3, u.getTypeU());
            ps.setInt(4, u.getIdU());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void deleteUtilisateur(String id){
        String requete = "delete from utilisateur where ID_U=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, id);
            ps.executeUpdate();
            System.out.println("Utilisateur supprimée");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Utilisateur findUtilisateurById(String id){
    Utilisateur utilisateur = new Utilisateur();
     String requete = "select * from utilisateur where ID_U=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                utilisateur.setLogin(resultat.getString(2));
                utilisateur.setPassword(resultat.getString(3));
                utilisateur.setTypeU(resultat.getInt(4));
            }
            return utilisateur;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche du utilisateur "+ex.getMessage());
            return null;
        }
    }


       public List<Utilisateur> DisplayAllUtilisateurs (){

        List <Utilisateur> listeU = new ArrayList<Utilisateur>();
        String requete = "select * from utilisateur";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Utilisateur utilisateur =new Utilisateur();
                utilisateur.setIdU(resultat.getInt(1));
                utilisateur.setLogin(resultat.getString(2));
                utilisateur.setTypeU(resultat.getInt(3));


                listeU.add(utilisateur);
            }
            return listeU;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des utilisateurs "+ex.getMessage());
            return null;
        }
    }

    
}
