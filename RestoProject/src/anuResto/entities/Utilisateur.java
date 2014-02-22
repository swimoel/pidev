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
public class Utilisateur  {
    private Integer idU;
    private String login;
    private String password;
    private Integer typeU;

    public Utilisateur() {
    }

    public Utilisateur(Integer idU, String login, String password, Integer typeU) {
        this.idU = idU;
        this.login = login;
        this.password = password;
        this.typeU = typeU;
    }

    public Integer getIdU() {
        return idU;
    }

    public void setIdU(Integer idU) {
        this.idU = idU;
    }



    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getTypeU() {
        return typeU;
    }

    public void setTypeU(Integer typeU) {
        this.typeU = typeU;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idU != null ? idU.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.idU == null && other.idU != null) || (this.idU != null && !this.idU.equals(other.idU))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "anuresto.Utilisateur[ idU=" + idU + " ]";
    }
    
}
