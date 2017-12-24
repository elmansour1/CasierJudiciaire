/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faouzi.casierjudiciaire.data;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author elmansour
 */
@Entity
public class Casier implements Serializable{

    private static final long serialVersionUID = 0L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "personne_id")
    private Personne personne;
    @ManyToMany
    private List<Delit> delit;
    
    public Casier(){
        
    }
    public Casier(Personne personne, List<Delit> delit) {
        this.personne = personne;
        this.delit = delit;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public List<Delit> getDelit() {
        return delit;
    }

    public void setDelit(List<Delit> delit) {
        this.delit = delit;
    }

    @Override
    public String toString() {
        return "Casier{" + "id=" + id + ", personne=" + personne + ", delit=" + delit + '}';
    }
    
    
    
}
