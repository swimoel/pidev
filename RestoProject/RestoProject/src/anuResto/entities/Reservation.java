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
public class Reservation  {
    private String iDReserv;
    private Date dateR;
    private Date heureR;
    private int nbPerso;
    private int nbTable;
    private Float prix;
    private Menu iDMenu;
    private Restaurant iDRestau;
    private Client idC;

    public Reservation() {
    }

    public Reservation(String iDReserv) {
        this.iDReserv = iDReserv;
    }

    public Reservation(String iDReserv, Date dateR, Date heureR, int nbPerso, int nbTable) {
        this.iDReserv = iDReserv;
        this.dateR = dateR;
        this.heureR = heureR;
        this.nbPerso = nbPerso;
        this.nbTable = nbTable;
    }

    public String getIDReserv() {
        return iDReserv;
    }

    public void setIDReserv(String iDReserv) {
        this.iDReserv = iDReserv;
    }

    public Date getDateR() {
        return dateR;
    }

    public void setDateR(Date dateR) {
        this.dateR = dateR;
    }

    public Date getHeureR() {
        return heureR;
    }

    public void setHeureR(Date heureR) {
        this.heureR = heureR;
    }

    public int getNbPerso() {
        return nbPerso;
    }

    public void setNbPerso(int nbPerso) {
        this.nbPerso = nbPerso;
    }

    public int getNbTable() {
        return nbTable;
    }

    public void setNbTable(int nbTable) {
        this.nbTable = nbTable;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public Menu getIDMenu() {
        return iDMenu;
    }

    public void setIDMenu(Menu iDMenu) {
        this.iDMenu = iDMenu;
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
        hash += (iDReserv != null ? iDReserv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservation)) {
            return false;
        }
        Reservation other = (Reservation) object;
        if ((this.iDReserv == null && other.iDReserv != null) || (this.iDReserv != null && !this.iDReserv.equals(other.iDReserv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "anuresto.entities.Reservation[ iDReserv=" + iDReserv + " ]";
    }
    
}
