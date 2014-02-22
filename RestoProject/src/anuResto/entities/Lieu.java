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
public class Lieu  {
    private Integer iDRegion;
    private String nomRegion;
    private String adresse;
    private String mapResto;
    private Restaurant iDRestau;

    public Lieu() {
    }

    public Lieu(Integer iDRegion, String nomRegion, String adresse, String mapResto, Restaurant iDRestau) {
        this.iDRegion = iDRegion;
        this.nomRegion = nomRegion;
        this.adresse = adresse;
        this.mapResto = mapResto;
        this.iDRestau = iDRestau;
    }

    public Integer getiDRegion() {
        return iDRegion;
    }

    public void setiDRegion(Integer iDRegion) {
        this.iDRegion = iDRegion;
    }

    public Restaurant getiDRestau() {
        return iDRestau;
    }

    public void setiDRestau(Restaurant iDRestau) {
        this.iDRestau = iDRestau;
    }



    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMapResto() {
        return mapResto;
    }

    public void setMapResto(String mapResto) {
        this.mapResto = mapResto;
    }

    public Restaurant getIDRestau() {
        return iDRestau;
    }

    public void setIDRestau(Restaurant iDRestau) {
        this.iDRestau = iDRestau;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDRegion != null ? iDRegion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lieu)) {
            return false;
        }
        Lieu other = (Lieu) object;
        if ((this.iDRegion == null && other.iDRegion != null) || (this.iDRegion != null && !this.iDRegion.equals(other.iDRegion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "anuresto.entities.Lieu[ iDRegion=" + iDRegion + " ]";
    }
    
}
