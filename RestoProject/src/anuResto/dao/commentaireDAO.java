/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package anuResto.dao;

import anuresto.entities.Commentaire;
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
public class commentaireDAO {
    
    public void insertCommentaire(Commentaire c){

        String requete = "insert into commentaire (ID_Comm,ID_C,ID_Restau ,Date_Comm ,Heure_Comm ,Text_Comment) values (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, c.getiDComm());
            ps.setInt(2, c.getIdC().getIdC());
            ps.setInt(3, c.getIDRestau().getiDRestau());
            ps.setString(4, c.getDateComm().toString());
            ps.setString(5, c.getHeureComm().toString());
            ps.setString(6, c.getTextComment());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


    public void updateCommentaire(Commentaire c){
        String requete = "update commentaire set Type_Spe=?,Descri_Spe=? where ID_Spe=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
//            ps.setString(1, s.getTypeSpe());
  //          ps.setString(2, s.getDescriSpe());
    //        ps.setInt(3, s.getiDSpe());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void deleteCommentaire(String id){
        String requete = "delete from commentaire where ID_U=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, id);
            ps.executeUpdate();
            System.out.println("Commentaire supprimée");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Commentaire findCommentaireById(String id){
    Commentaire commentaire = new Commentaire();
     String requete = "select * from commentaire where ID_U=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                //commentaire.setRestau(resultat.getString(2));
                //commentaire.setDescriSpe(resultat.getString(3));
            }
            return commentaire;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche du commentaire "+ex.getMessage());
            return null;
        }
    }


       public List<Commentaire> DisplayAllCommentaires (){

        List <Commentaire> listeS = new ArrayList<Commentaire>();
        String requete = "select * from commentaire";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Commentaire commentaire =new Commentaire();
//                commentaire.setiDSpe(resultat.getInt(1));
  //              commentaire.setTypeSpe(resultat.getString(2));
    //            commentaire.setDescriSpe(resultat.getString(3));


                listeS.add(commentaire);
            }
            return listeS;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des commentaires "+ex.getMessage());
            return null;
        }
    }
    
}
