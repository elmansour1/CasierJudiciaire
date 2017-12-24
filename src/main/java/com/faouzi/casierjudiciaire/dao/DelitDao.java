/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faouzi.casierjudiciaire.dao;

import com.faouzi.casierjudiciaire.data.Delit;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Page;
/**
 *
 * @author elmansour
 */
public interface DelitDao extends JpaRepository<Delit, Long>{
    @Query("SELECT d.id, d.date_condanation, d.cours_d_appel, d.date_commission_infraction, d.mandat, d.nature_mandat, d.observation_condanation, d.personne.nom_prenom, d.typeDelit FROM Delit d")
    public Page<Object[]> findTout(Pageable pageable);
}
