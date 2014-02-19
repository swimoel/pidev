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

    private String idE;
    private float noteE;

    public Evaluation() {
    }

    public Evaluation(String idE) {
        this.idE = idE;
    }

    public Evaluation(String idE, float noteE) {
        this.idE = idE;
        this.noteE = noteE;
    }

    public String getIdE() {
        return idE;
    }

    public void setIdE(String idE) {
        this.idE = idE;
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
