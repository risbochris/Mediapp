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

/**
 *
 * @author risbochris
 */
@Entity
public class Genre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CODE_GENRE")
    private Long codeGenre;
    @Column(name = "LIB_GENRE")
    private String libGenre;

    private Genre() {
    }

    
    public Genre(String genre) {
        this.libGenre=genre;
    }

    public Long getCodeGenre() {
        return codeGenre;
    }

    public String getLibGenre() {
        return libGenre;
    }

    public void setLibGenre(String libGenre) {
        this.libGenre = libGenre;
    }

    
}
