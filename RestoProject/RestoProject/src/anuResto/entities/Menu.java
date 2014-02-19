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
public class Menu  {
    private String iDMenu;
    private String nomMenu;
    private String descrim;
    private String prixm;
    private Restaurant iDRestau;

    public Menu() {
    }

    public Menu(String iDMenu) {
        this.iDMenu = iDMenu;
    }

    public Menu(String iDMenu, String nomMenu, String descrim, String prixm) {
        this.iDMenu = iDMenu;
        this.nomMenu = nomMenu;
        this.descrim = descrim;
        this.prixm = prixm;
    }

    public String getIDMenu() {
        return iDMenu;
    }

    public void setIDMenu(String iDMenu) {
        this.iDMenu = iDMenu;
    }

    public String getNomMenu() {
        return nomMenu;
    }

    public void setNomMenu(String nomMenu) {
        this.nomMenu = nomMenu;
    }

    public String getDescrim() {
        return descrim;
    }

    public void setDescrim(String descrim) {
        this.descrim = descrim;
    }

    public String getPrixm() {
        return prixm;
    }

    public void setPrixm(String prixm) {
        this.prixm = prixm;
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
        hash += (iDMenu != null ? iDMenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.iDMenu == null && other.iDMenu != null) || (this.iDMenu != null && !this.iDMenu.equals(other.iDMenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "anuresto.entities.Menu[ iDMenu=" + iDMenu + " ]";
    }
    
}
