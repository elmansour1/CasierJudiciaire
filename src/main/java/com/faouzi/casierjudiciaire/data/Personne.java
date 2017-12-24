/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faouzi.casierjudiciaire.data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author elmansour
 */
@Entity
public class Personne implements Serializable{
    
    private static final long serialVersionUID = 0L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom_prenom;
    private String nom_pere;
    private String nom_mere;
    //@Temporal(TemporalType.DATE)
    private Date date_naissance;
    private String lieu_naissance;
    private String domicile;
    private String statut_matrimoniale;
    private String profession;
    private String nationalite;
    //private Delit delit;
    
    public Personne(){
        
    }
    public Personne(String nom_prenom, String nom_pere, String nom_mere, Date date_naissance, String lieu_naissance, String domicile, String statut_matrimoniale, String profession, String nationalite) {
        this.nom_prenom = nom_prenom;
        this.nom_pere = nom_pere;
        this.nom_mere = nom_mere;
        this.date_naissance = date_naissance;
        this.lieu_naissance = lieu_naissance;
        this.domicile = domicile;
        this.statut_matrimoniale = statut_matrimoniale;
        this.profession = profession;
        this.nationalite = nationalite;
    }

    public Personne(String nom_prenom, String nom_pere) {
        this.nom_prenom = nom_prenom;
        this.nom_pere = nom_pere;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom_prenom() {
        return nom_prenom;
    }

    public void setNom_prenom(String nom_prenom) {
        this.nom_prenom = nom_prenom;
    }

    public String getNom_pere() {
        return nom_pere;
    }

    public void setNom_pere(String nom_pere) {
        this.nom_pere = nom_pere;
    }

    public String getNom_mere() {
        return nom_mere;
    }

    public void setNom_mere(String nom_mere) {
        this.nom_mere = nom_mere;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getLieu_naissance() {
        return lieu_naissance;
    }

    public void setLieu_naissance(String lieu_naissance) {
        this.lieu_naissance = lieu_naissance;
    }

    public String getDomicile() {
        return domicile;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }

    public String getStatut_matrimoniale() {
        return statut_matrimoniale;
    }

    public void setStatut_matrimoniale(String statut_matrimoniale) {
        this.statut_matrimoniale = statut_matrimoniale;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

//    public Delit getDelit() {
//        return delit;
//    }
//
//    public void setDelit(Delit delit) {
//        this.delit = delit;
//    }

    @Override
    public String toString() {
        return "Personne{" + "nom_prenom=" + nom_prenom + ", nom_pere=" + nom_pere + ", nom_mere=" + nom_mere + ", date_naissance=" + date_naissance + ", lieu_naissance=" + lieu_naissance + ", domicile=" + domicile + ", statut_matrimoniale=" + statut_matrimoniale + ", profession=" + profession + ", nationalite=" + nationalite + '}';
    }
    
    
    
}
