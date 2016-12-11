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
public class Librarian implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "NOM_USER")
    private String nomUser;
    @Column(name = "PRENOM_USER")
    private String prenomUser;
    @Column(name = "ADRESSE_USER")
    private String adresseUser;
    @Column(name = "MAIL_USER")
    private String mailUser;
    @Column(name = "PWD_USER")
    private String pwdUser;

    private Librarian() {
    }
    
    
    

    public Librarian(String nom, String prenom, String adresse, String email, String password) {
        this.nomUser=nom;
        this.prenomUser=prenom;
        this.adresseUser=adresse;
        this.mailUser=email;
        this.pwdUser=password;
        
    }

    public Long getId() {
        return id;
    }

    public String getNomUser() {
        return nomUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public String getPrenomUser() {
        return prenomUser;
    }

    public void setPrenomUser(String prenomUser) {
        this.prenomUser = prenomUser;
    }

    public String getAdresseUser() {
        return adresseUser;
    }

    public void setAdresseUser(String adresseUser) {
        this.adresseUser = adresseUser;
    }

    public String getMailUser() {
        return mailUser;
    }

    public void setMailUser(String mailUser) {
        this.mailUser = mailUser;
    }

    public String getPwdUser() {
        return pwdUser;
    }

    public void setPwdUser(String pwdUser) {
        this.pwdUser = pwdUser;
    }
    
    
    
    
}
