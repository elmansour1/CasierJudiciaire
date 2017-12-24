/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faouzi.casierjudiciaire.data;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author elmansour
 */
@Entity
public class Delit implements Serializable{

    private static final long serialVersionUID = 0L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //@Temporal(TemporalType.DATE)
    private Date date_condanation;
    private String cours_d_appel;
//    private String nature_infraction;
   // @Temporal(TemporalType.DATE)
    private Date date_commission_infraction;
   // @Temporal(TemporalType.DATE)
    private Date mandat;
    private String nature_mandat;
    private String observation_condanation;
   @ManyToOne
   @JoinColumn(name = "personne_id")
    private Personne personne;
   //@Column(name = "nature_infraction")
    private String typeDelit;

   // private Casier  casier;

    public  Delit(){

    }

    public Delit(Date date_condanation, String cours_d_appel, Date date_commission_infraction, Date mandat, String nature_mandat, String observation_condanation, Personne personne, String typeDelit) {
        this.date_condanation = date_condanation;
        this.cours_d_appel = cours_d_appel;
//        this.nature_infraction = nature_infraction;
        this.date_commission_infraction = date_commission_infraction;
        this.mandat = mandat;
        this.nature_mandat = nature_mandat;
        this.observation_condanation = observation_condanation;
        this.personne = personne;
        this.typeDelit = typeDelit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate_condanation() {
        return date_condanation;
    }

    public void setDate_condanation(Date date_condanation) {
        this.date_condanation = date_condanation;
    }

    public String getCours_d_appel() {
        return cours_d_appel;
    }

    public void setCours_d_appel(String cours_d_appel) {
        this.cours_d_appel = cours_d_appel;
    }

//    public String getNature_infraction() {
//        return nature_infraction;
//    }
//
//    public void setNature_infraction(String nature_infraction) {
//        this.nature_infraction = nature_infraction;
//    }

    public Date getDate_commission_infraction() {
        return date_commission_infraction;
    }

    public void setDate_commission_infraction(Date date_commission_infraction) {
        this.date_commission_infraction = date_commission_infraction;
    }

    public Date getMandat() {
        return mandat;
    }

    public void setMandat(Date mandat) {
        this.mandat = mandat;
    }

    public String getNature_mandat() {
        return nature_mandat;
    }

    public void setNature_mandat(String nature_mandat) {
        this.nature_mandat = nature_mandat;
    }

    public String getObservation_condanation() {
        return observation_condanation;
    }

    public void setObservation_condanation(String observation_condanation) {
        this.observation_condanation = observation_condanation;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public String getTypeDelit() {
        return typeDelit;
    }

    public void setTypeDelit(String typeDelit) {
        this.typeDelit = typeDelit;
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.date_condanation);
        hash = 11 * hash + Objects.hashCode(this.cours_d_appel);
//        hash = 11 * hash + Objects.hashCode(this.nature_infraction);
        hash = 11 * hash + Objects.hashCode(this.date_commission_infraction);
        hash = 11 * hash + Objects.hashCode(this.mandat);
        hash = 11 * hash + Objects.hashCode(this.nature_mandat);
        hash = 11 * hash + Objects.hashCode(this.observation_condanation);
        hash = 11 * hash + Objects.hashCode(this.personne);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Delit other = (Delit) obj;
        if (!Objects.equals(this.cours_d_appel, other.cours_d_appel)) {
            return false;
        }
        if (!Objects.equals(this.nature_mandat, other.nature_mandat)) {
            return false;
        }
        if (!Objects.equals(this.observation_condanation, other.observation_condanation)) {
            return false;
        }
        if (!Objects.equals(this.date_condanation, other.date_condanation)) {
            return false;
        }
        if (!Objects.equals(this.date_commission_infraction, other.date_commission_infraction)) {
            return false;
        }
        if (!Objects.equals(this.mandat, other.mandat)) {
            return false;
        }
        if (!Objects.equals(this.personne, other.personne)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Delit{" + "id=" + id + ", date_condanation=" + date_condanation + ", cours_d_appel=" + cours_d_appel  + ", date_commission_infraction=" + date_commission_infraction + ", mandat=" + mandat + ", nature_mandat=" + nature_mandat + ", observation_condanation=" + observation_condanation + ", personne=" + personne + ", typeDelit=" + typeDelit + '}';
    }




}
