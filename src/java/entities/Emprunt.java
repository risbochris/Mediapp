/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author risbochris
 */
@Entity
public class Emprunt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CODE_EMPRUNT")
    private Long codeEmprunt;
    @Column(name = "DATE_EMPRUNT")
    private Timestamp dataEmprunt;
    @Column(name = "DATE_RETOUR")
    private Timestamp dataRetour;
    @Column(name = "ETAT_EMPRUNT")
    private boolean etatEmprunt;
    @ManyToOne
    @JoinColumn(name = "CODE_MEMBRE")
    private Membre membre;
    @ManyToOne
    @JoinColumn(name = "CODE_MEDIA")
    private Media media;



    public Long getCodeEmprunt() {
        return codeEmprunt;
    }

    public void setCodeEmprunt(Long codeEmprunt) {
        this.codeEmprunt = codeEmprunt;
    }

    public Timestamp getDataEmprunt() {
        return dataEmprunt;
    }

    public void setDataEmprunt(Timestamp dataEmprunt) {
        this.dataEmprunt = dataEmprunt;
    }

    public Timestamp getDataRetour() {
        return dataRetour;
    }

    public void setDataRetour(Timestamp dataRetour) {
        this.dataRetour = dataRetour;
    }

    public boolean isEtatEmprunt() {
        return etatEmprunt;
    }

    public void setEtatEmprunt(boolean etatEmprunt) {
        this.etatEmprunt = etatEmprunt;
    }
    
        public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    
}
