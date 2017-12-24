/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faouzi.casierjudiciaire.dao;

import com.faouzi.casierjudiciaire.data.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author elmansour
 */
public interface UserDao extends JpaRepository<User, String>{
    @Query("select u.username from User u where u.username =:x")
    public Page<User> findByUsername(@Param("x") String username, Pageable pageable);
    
}
