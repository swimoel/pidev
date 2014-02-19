/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package anuresto.entities;

import java.util.Date;

/**
 *
 * @author Ahmed
 */
 
public class Commentaire  {
    private String iDComm;
    private Date dateComm;
    private Date heureComm;
    private String textComment;
    private Restaurant iDRestau;
    private Client idC;

    public Commentaire() {
    }

    public Commentaire(String iDComm) {
        this.iDComm = iDComm;
    }

    public Commentaire(String iDComm, Date dateComm, Date heureComm, String textComment) {
        this.iDComm = iDComm;
        this.dateComm = dateComm;
        this.heureComm = heureComm;
        this.textComment = textComment;
    }

    public String getIDComm() {
        return iDComm;
    }

    public void setIDComm(String iDComm) {
        this.iDComm = iDComm;
    }

    public Date getDateComm() {
        return dateComm;
    }

    public void setDateComm(Date dateComm) {
        this.dateComm = dateComm;
    }

    public Date getHeureComm() {
        return heureComm;
    }

    public void setHeureComm(Date heureComm) {
        this.heureComm = heureComm;
    }

    public String getTextComment() {
        return textComment;
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }

    public Restaurant getIDRestau() {
        return iDRestau;
    }

    public void setIDRestau(Restaurant iDRestau) {
        this.iDRestau = iDRestau;
    }

    public Client getIdC() {
        return idC;
    }

    public void setIdC(Client idC) {
        this.idC = idC;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDComm != null ? iDComm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Commentaire)) {
            return false;
        }
        Commentaire other = (Commentaire) object;
        if ((this.iDComm == null && other.iDComm != null) || (this.iDComm != null && !this.iDComm.equals(other.iDComm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "anuresto.entities.Commentaire[ iDComm=" + iDComm + " ]";
    }
    
}
