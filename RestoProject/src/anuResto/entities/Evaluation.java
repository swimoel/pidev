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
public class Evaluation  {

    private Integer idE;
    private Integer idc;
    private float noteE;
    private Integer idrestau;

    public Evaluation() {
    }

    public Evaluation(Integer idE, float noteE,Integer idrestau,Integer idc ) {
        this.idE = idE;
        this.idc = idc;
        this.noteE = noteE;
        this.idrestau=idrestau;
    }

    public Integer getIdE() {
        return idE;
    }

    public void setIdE(Integer idE) {
        this.idE = idE;
    }
     public Integer getIdc() {
        return idc;
    }

    public void setIdc(Integer idc) {
        this.idE = idc;
    }
     public Integer getIdrestau() {
        return idrestau;
    }

    public void setIdrestau(Integer idrestau) {
        this.idrestau = idrestau;
    }

   

    public float getNoteE() {
        return noteE;
    }

    public void setNoteE(float noteE) {
        this.noteE = noteE;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idE != null ? idE.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evaluation)) {
            return false;
        }
        Evaluation other = (Evaluation) object;
        if ((this.idE == null && other.idE != null) || (this.idE != null && !this.idE.equals(other.idE))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "anuresto.Evaluation[ idE=" + idE + " ]";
    }
    
}
