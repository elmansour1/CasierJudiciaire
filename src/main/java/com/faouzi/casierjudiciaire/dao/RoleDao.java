/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faouzi.casierjudiciaire.dao;

import com.faouzi.casierjudiciaire.data.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author elmansour
 */
public interface RoleDao extends JpaRepository<Role, String>{
    
}
