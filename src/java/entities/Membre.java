/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author risbochris
 */
@Entity
public class Membre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "NOM_MEMBRE")
    private String nomMembre;
    @Column(name = "PRENOM_MEMBRE")
    private String prenomMembre;
    @Column(name = "ADRESSE_MEMBRE")
    private String adresseMembre;
    @Column(name = "MAIL_MEMBRE")
    private String mailMembre;
    @OneToMany(mappedBy = "membre")
    private List<Emprunt> emprunts;

    public Long getId() {
        return id;
    }
       

    public String getNomMembre() {
        return nomMembre;
    }

    public void setNomMembre(String nomMembre) {
        this.nomMembre = nomMembre;
    }

    public String getPrenomMembre() {
        return prenomMembre;
    }

    public void setPrenomMembre(String prenomMembre) {
        this.prenomMembre = prenomMembre;
    }

    public String getAdresseMembre() {
        return adresseMembre;
    }

    public void setAdresseMembre(String adresseMembre) {
        this.adresseMembre = adresseMembre;
    }

    public String getMailMembre() {
        return mailMembre;
    }

    public void setMailMembre(String mailMembre) {
        this.mailMembre = mailMembre;
    }
    
    public List<Emprunt> getEmprunts() {
        return emprunts;
    }

    public void setEmprunts(List<Emprunt> emprunts) {
        this.emprunts = emprunts;
    }
    
    public void addEmprunt(Emprunt emp){
        this.emprunts.add(emp);
    }
    
    public void removeEmprunt(Emprunt emp){
        this.emprunts.remove(emp);
    }
    
}
