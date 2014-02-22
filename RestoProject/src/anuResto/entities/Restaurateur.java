/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package anuresto.entities;


/**
 *
 * @author Ahmed
 */
public class Restaurateur  {

    private Integer idR;
    private String nom;
    private String prenom;
    private String cin;
    private String tel;
    private String addresse;
    private String ville;
    private String mail;

    public Restaurateur() {
    }

    public Restaurateur(Integer idR, String nom, String prenom, String cin, String tel, String addresse, String ville, String mail) {
        this.idR = idR;
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.tel = tel;
        this.addresse = addresse;
        this.ville = ville;
        this.mail = mail;
    }

    public Integer getIdR() {
        return idR;
    }

    public void setIdR(Integer idR) {
        this.idR = idR;
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idR != null ? idR.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Restaurateur)) {
            return false;
        }
        Restaurateur other = (Restaurateur) object;
        if ((this.idR == null && other.idR != null) || (this.idR != null && !this.idR.equals(other.idR))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "anuresto.entities.Restaurateur[ idR=" + idR + " ]";
    }
    
}
