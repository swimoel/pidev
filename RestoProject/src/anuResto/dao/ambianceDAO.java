/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package anuResto.dao;

import anuresto.entities.Ambiance;
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
public class ambianceDAO {
    
    public void insertAmbiance(Ambiance a){

        String requete = "insert into ambiance (ID_Amb,Type_Ambe,Descri_Ambe) values (?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, a.getIDAmb());
            ps.setString(2, a.getTypeAmbe());
            ps.setString(3, a.getDescriAmbe());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


    public void updateAmbiance(Ambiance a){
        String requete = "update ambiance set Type_Spe=?,Descri_Spe=? where ID_Ambe=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, a.getTypeAmbe());
            ps.setString(2, a.getDescriAmbe());
            ps.setInt(3, a.getIDAmb());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void deleteAmbiance(String id){
        String requete = "delete from ambiance where ID_Amb=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, id);
            ps.executeUpdate();
            System.out.println("Ambiance supprimée");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Ambiance findAmbianceById(String id){
    Ambiance ambiance = new Ambiance();
     String requete = "select * from ambiance where ID_Amb=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                ambiance.setTypeAmbe(resultat.getString(2));
                ambiance.setDescriAmbe(resultat.getString(3));
            }
            return ambiance;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche du ambiance "+ex.getMessage());
            return null;
        }
    }


       public List<Ambiance> DisplayAllAmbiances (){

        List <Ambiance> listeA = new ArrayList<Ambiance>();
        String requete = "select * from ambiance";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Ambiance ambiance =new Ambiance();
                ambiance.setIDAmb(resultat.getInt(1));
                ambiance.setTypeAmbe(resultat.getString(2));
                ambiance.setDescriAmbe(resultat.getString(3));


                listeA.add(ambiance);
            }
            return listeA;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des ambiances "+ex.getMessage());
            return null;
        }
    }
    
}
