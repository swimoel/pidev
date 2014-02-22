/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restoproject;
import anuResto.util.MyConnection;
import anuresto.entities.Utilisateur;
import anuResto.dao.utilisateurDAO;

/**
 *
 * @author Ahmed
 */
public class RestoProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Utilisateur u = new Utilisateur(1, "bb", "cc", 2);
        utilisateurDAO utDAO = new utilisateurDAO();
        utDAO.insertUtilisateur(u);
        // TODO code application logic here
    }
    
}
