/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author risbochris
 */
@Entity
@PrimaryKeyJoinColumn(name="CODE_MEDIA")
public class Livre extends Media {

    @Column(name = "NB_PAGES")
    private Integer nbPages;

    
    public Livre(String ref, String titre, String auteur, int annee, String genre, String local,String desc) {
        super(ref, titre,auteur,annee,genre,local,desc);
    }

    public Integer getNbPages() {
        return nbPages;
    }

    public void setNbPages(Integer nbPages) {
        this.nbPages = nbPages;
    }

    
    
}
