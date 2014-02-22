/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package anuResto.dao;

import anuresto.entities.Menu;
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
public class menuDAO {
    
    public void insertMenu(Menu m){

        String requete = "insert into menu (ID_Menu,ID_Restau,Nom_Menu,Descri_m,Prix_m) values (?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, m.getiDMenu());
            ps.setInt(2, m.getIDRestau().getiDRestau());
            ps.setString(3, m.getNomMenu());
            ps.setString(4, m.getDescrim());
            ps.setString(5, m.getPrixm());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


    public void updateMenu(Menu m){
        String requete = "update menu set  ID_Restau=?,Nom_Menu=?,Descri_m=?,Prix_m=?  where ID_Menu=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, m.getIDRestau().getiDRestau());
            ps.setString(2, m.getNomMenu());
            ps.setString(3, m.getDescrim());
            ps.setString(4, m.getPrixm());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void deleteMenu(String id){
        String requete = "delete from menu where ID_U=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, id);
            ps.executeUpdate();
            System.out.println("Menu mupprimée");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Menu findMenuById(String id){
    Menu menu = new Menu();
     String requete = "select * from menu where ID_U=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, id);
            ResultSet resultat = ps.executeQuery();
           // restaurantDAO restoDAO = new restaurantDAO();
            while (resultat.next())
            {
                //stock.setDepot(depotDAO.findDepotById(resultat.getInt(4)));
                menu.setNomMenu(resultat.getString(3));
                menu.setDescrim(resultat.getString(4));
                menu.setPrixm(resultat.getString(5));

            }
            return menu;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche du menu "+ex.getMessage());
            return null;
        }
    }


       public List<Menu> DisplayAllMenus (){

        List <Menu> listeS = new ArrayList<Menu>();
        String requete = "select * from menu";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Menu menu =new Menu();
                menu.setiDMenu(resultat.getInt(1));
                //menu.setTypeSpe(resultat.getString(2));
                menu.setNomMenu(resultat.getString(3));
                menu.setDescrim(resultat.getString(4));
                menu.setPrixm(resultat.getString(5));


                listeS.add(menu);
            }
            return listeS;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des menus "+ex.getMessage());
            return null;
        }
    }
    
}
