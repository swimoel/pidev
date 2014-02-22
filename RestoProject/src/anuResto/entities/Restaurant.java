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
public class Restaurant  {

    private Integer iDRestau;
    private Integer idR;
    private String nomR;
    private Date rangR;
    private String descriR;
    private String lienImage;
    private int budget;
    private String numtel;
    private Ambiance iDAmb;
    private Spetialite iDSpe;

    public Restaurant() {
    }

    public Restaurant(Integer iDRestau, Integer idR, String nomR, Date rangR, String descriR, String lienImage, int budget, String numtel, Ambiance iDAmb, Spetialite iDSpe) {
        this.iDRestau = iDRestau;
        this.idR = idR;
        this.nomR = nomR;
        this.rangR = rangR;
        this.descriR = descriR;
        this.lienImage = lienImage;
        this.budget = budget;
        this.numtel = numtel;
        this.iDAmb = iDAmb;
        this.iDSpe = iDSpe;
    }

    public Integer getiDRestau() {
        return iDRestau;
    }

    public void setiDRestau(Integer iDRestau) {
        this.iDRestau = iDRestau;
    }

    public Integer getIdR() {
        return idR;
    }

    public void setIdR(Integer idR) {
        this.idR = idR;
    }

    public Ambiance getiDAmb() {
        return iDAmb;
    }

    public void setiDAmb(Ambiance iDAmb) {
        this.iDAmb = iDAmb;
    }

    public Spetialite getiDSpe() {
        return iDSpe;
    }

    public void setiDSpe(Spetialite iDSpe) {
        this.iDSpe = iDSpe;
    }



    public String getNomR() {
        return nomR;
    }

    public void setNomR(String nomR) {
        this.nomR = nomR;
    }

    public Date getRangR() {
        return rangR;
    }

    public void setRangR(Date rangR) {
        this.rangR = rangR;
    }

    public String getDescriR() {
        return descriR;
    }

    public void setDescriR(String descriR) {
        this.descriR = descriR;
    }

    public String getLienImage() {
        return lienImage;
    }

    public void setLienImage(String lienImage) {
        this.lienImage = lienImage;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getNumtel() {
        return numtel;
    }

    public void setNumtel(String numtel) {
        this.numtel = numtel;
    }



    public Ambiance getIDAmb() {
        return iDAmb;
    }

    public void setIDAmb(Ambiance iDAmb) {
        this.iDAmb = iDAmb;
    }

    public Spetialite getIDSpe() {
        return iDSpe;
    }

    public void setIDSpe(Spetialite iDSpe) {
        this.iDSpe = iDSpe;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDRestau != null ? iDRestau.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Restaurant)) {
            return false;
        }
        Restaurant other = (Restaurant) object;
        if ((this.iDRestau == null && other.iDRestau != null) || (this.iDRestau != null && !this.iDRestau.equals(other.iDRestau))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "anuresto.entities.Restaurant[ iDRestau=" + iDRestau + " ]";
    }
    
}
