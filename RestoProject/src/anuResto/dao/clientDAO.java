/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package anuResto.dao;

import anuresto.entities.Client;
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
public class clientDAO {
    
    public void insertClient(Client c){

        String requete = "insert into client (ID_C,Nom,Prenom,CIN,Tel,Addresse,Ville,Mail) values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, c.getIdC());
            ps.setString(2, c.getNom());
            ps.setString(3, c.getPrenom());
            ps.setString(4, c.getCin());
            ps.setString(5, c.getTel());
            ps.setString(6, c.getAddresse());
            ps.setString(7, c.getVille());
            ps.setString(8, c.getMail());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


    public void updateClient(Client c){
        String requete = "update client set Nom=?,Prenom=? ,CIN=?,Tel=?,Addresse=?,Ville=?,Mail=? where ID_C=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, c.getNom());
            ps.setString(2, c.getPrenom());
            ps.setString(3, c.getCin());
            ps.setString(4, c.getTel());
            ps.setString(5, c.getAddresse());
            ps.setString(6, c.getVille());
            ps.setString(7, c.getMail());
            ps.setInt(8, c.getIdC());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void deleteClient(String id){
        String requete = "delete from client where ID_C=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, id);
            ps.executeUpdate();
            System.out.println("Client mupprimée");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Client findClientById(String id){
    Client client = new Client();
     String requete = "select * from client where ID_C=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                client.setNom(resultat.getString(2));
                client.setPrenom(resultat.getString(3));
                client.setTel(resultat.getString(4));
                client.setAddresse(resultat.getString(5));
                client.setVille(resultat.getString(6));
                client.setMail(resultat.getString(7));
                
                
            }
            return client;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche du client "+ex.getMessage());
            return null;
        }
    }


       public List<Client> DisplayAllClients (){

        List <Client> listeS = new ArrayList<Client>();
        String requete = "select * from client";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
        Client client =new Client();
            while(resultat.next()){
                client.setIdC(resultat.getInt(1));
                client.setNom(resultat.getString(2));
                client.setPrenom(resultat.getString(3));
                client.setTel(resultat.getString(4));
                client.setAddresse(resultat.getString(5));
                client.setVille(resultat.getString(6));
                client.setMail(resultat.getString(7));


                listeS.add(client);
            }
            return listeS;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des clients "+ex.getMessage());
            return null;
        }
    }
    
}
