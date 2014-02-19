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
public class Ambiance  {
    private String iDAmb;
    private String typeAmbe;
    private String descriAmbe;

    public Ambiance() {
    }

    public Ambiance(String iDAmb) {
        this.iDAmb = iDAmb;
    }

    public Ambiance(String iDAmb, String typeAmbe, String descriAmbe) {
        this.iDAmb = iDAmb;
        this.typeAmbe = typeAmbe;
        this.descriAmbe = descriAmbe;
    }

    public String getIDAmb() {
        return iDAmb;
    }

    public void setIDAmb(String iDAmb) {
        this.iDAmb = iDAmb;
    }

    public String getTypeAmbe() {
        return typeAmbe;
    }

    public void setTypeAmbe(String typeAmbe) {
        this.typeAmbe = typeAmbe;
    }

    public String getDescriAmbe() {
        return descriAmbe;
    }

    public void setDescriAmbe(String descriAmbe) {
        this.descriAmbe = descriAmbe;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDAmb != null ? iDAmb.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ambiance)) {
            return false;
        }
        Ambiance other = (Ambiance) object;
        if ((this.iDAmb == null && other.iDAmb != null) || (this.iDAmb != null && !this.iDAmb.equals(other.iDAmb))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "anuresto.entities.Ambiance[ iDAmb=" + iDAmb + " ]";
    }
    
}
