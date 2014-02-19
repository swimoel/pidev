/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package anuresto.entities;

import java.io.Serializable;
import java.util.Collection;

/**
 *
 * @author Ahmed
 */
public class Spetialite implements Serializable {
    private String iDSpe;
    private String typeSpe;
    private String descriSpe;
    private Collection<Restaurant> restaurantCollection;

    public Spetialite() {
    }

    public Spetialite(String iDSpe) {
        this.iDSpe = iDSpe;
    }

    public Spetialite(String iDSpe, String typeSpe, String descriSpe) {
        this.iDSpe = iDSpe;
        this.typeSpe = typeSpe;
        this.descriSpe = descriSpe;
    }

    public String getIDSpe() {
        return iDSpe;
    }

    public void setIDSpe(String iDSpe) {
        this.iDSpe = iDSpe;
    }

    public String getTypeSpe() {
        return typeSpe;
    }

    public void setTypeSpe(String typeSpe) {
        this.typeSpe = typeSpe;
    }

    public String getDescriSpe() {
        return descriSpe;
    }

    public void setDescriSpe(String descriSpe) {
        this.descriSpe = descriSpe;
    }

    public Collection<Restaurant> getRestaurantCollection() {
        return restaurantCollection;
    }

    public void setRestaurantCollection(Collection<Restaurant> restaurantCollection) {
        this.restaurantCollection = restaurantCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDSpe != null ? iDSpe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Spetialite)) {
            return false;
        }
        Spetialite other = (Spetialite) object;
        if ((this.iDSpe == null && other.iDSpe != null) || (this.iDSpe != null && !this.iDSpe.equals(other.iDSpe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "anuresto.entities.Spetialite[ iDSpe=" + iDSpe + " ]";
    }
    
}
