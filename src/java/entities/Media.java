/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author risbochris
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Media implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "CODE_MEDIA")
    private String codeMedia;
    @Column(name = "AUTEUR")
    private String auteur;
    @Column(name = "TITRE")
    private String titre;
    @Column(name = "ANNEE")
    private Integer annee;
    @Column(name = "DESC_MEDIA")
    private Long descMedia;
    @Column(name = "NB_MEDIA")
    private Integer nbMedia;
    @ManyToOne
    @JoinColumn(name = "CODE_GENRE")
    private Genre genre;
    @ManyToOne
    @JoinColumn(name = "CODE_LOCAL")
    private Localisation local;

    
    public Long getId() {
        return id;
    }

    public String getCodeMedia() {
        return codeMedia;
    }

    public void setCodeMedia(String codeMedia) {
        this.codeMedia = codeMedia;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public Integer getNbMedia() {
        return nbMedia;
    }

    public void setNbMedia(Integer nbMedia) {
        this.nbMedia = nbMedia;
    }
    
    public Long getDescMedia() {
        return descMedia;
    }

    public void setDescMedia(Long descMedia) {
        this.descMedia = descMedia;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    
     public Localisation getLocal() {
        return local;
    }

    public void setLocal(Localisation local) {
        this.local = local;
    }
    
    
    
}
