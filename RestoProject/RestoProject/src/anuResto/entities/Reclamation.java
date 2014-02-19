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
public class Reclamation {

    private String iDRec;
    private String sujet;
    private Date dateRec;
    private Date heureRec;
    private String textRec;
    private Client idC;

    public Reclamation() {
    }

    public Reclamation(String iDRec) {
        this.iDRec = iDRec;
    }

    public Reclamation(String iDRec, String sujet, Date dateRec, Date heureRec, String textRec) {
        this.iDRec = iDRec;
        this.sujet = sujet;
        this.dateRec = dateRec;
        this.heureRec = heureRec;
        this.textRec = textRec;
    }

    public String getIDRec() {
        return iDRec;
    }

    public void setIDRec(String iDRec) {
        this.iDRec = iDRec;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public Date getDateRec() {
        return dateRec;
    }

    public void setDateRec(Date dateRec) {
        this.dateRec = dateRec;
    }

    public Date getHeureRec() {
        return heureRec;
    }

    public void setHeureRec(Date heureRec) {
        this.heureRec = heureRec;
    }

    public String getTextRec() {
        return textRec;
    }

    public void setTextRec(String textRec) {
        this.textRec = textRec;
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
        hash += (iDRec != null ? iDRec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reclamation)) {
            return false;
        }
        Reclamation other = (Reclamation) object;
        if ((this.iDRec == null && other.iDRec != null) || (this.iDRec != null && !this.iDRec.equals(other.iDRec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "anuresto.entities.Reclamation[ iDRec=" + iDRec + " ]";
    }
    
}
