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
public class BilanR  {
    private String iDBilan;
    private String iDReserv;
    private Date dateR;
    private Float totalGain;
    private Restaurant iDRestau;
    private Client idC;

    public BilanR() {
    }

    public BilanR(String iDBilan) {
        this.iDBilan = iDBilan;
    }

    public BilanR(String iDBilan, String iDReserv, Date dateR) {
        this.iDBilan = iDBilan;
        this.iDReserv = iDReserv;
        this.dateR = dateR;
    }

    public String getIDBilan() {
        return iDBilan;
    }

    public void setIDBilan(String iDBilan) {
        this.iDBilan = iDBilan;
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

    public Float getTotalGain() {
        return totalGain;
    }

    public void setTotalGain(Float totalGain) {
        this.totalGain = totalGain;
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
        hash += (iDBilan != null ? iDBilan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BilanR)) {
            return false;
        }
        BilanR other = (BilanR) object;
        if ((this.iDBilan == null && other.iDBilan != null) || (this.iDBilan != null && !this.iDBilan.equals(other.iDBilan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "anuresto.entities.BilanR[ iDBilan=" + iDBilan + " ]";
    }
    
}
