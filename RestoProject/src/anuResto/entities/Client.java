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
public class Client {
    private Integer idC;
    private String nom;
    private String prenom;
    private String cin;
    private String tel;
    private String addresse;
    private String ville;
    private String mail;

    public Client() {
    }

    public Client(Integer idC, String nom, String prenom, String cin, String tel, String addresse, String ville, String mail) {
        this.idC = idC;
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.tel = tel;
        this.addresse = addresse;
        this.ville = ville;
        this.mail = mail;
    }


    public Integer getIdC() {
        return idC;
    }
    
        public void setIdC(Integer idC) {
        this.idC = idC;
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
        hash += (getIdC() != null ? getIdC().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.getIdC() == null && other.getIdC() != null) || (this.getIdC() != null && !this.idC.equals(other.idC))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "anuresto.entities.Client[ idC=" + getIdC() + " ]";
    }


    
}
