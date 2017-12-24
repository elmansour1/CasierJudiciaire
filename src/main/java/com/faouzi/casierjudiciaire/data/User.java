/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faouzi.casierjudiciaire.data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author elmansour
 */
@Entity
@Table(name = "users")
public class User implements Serializable{

    private static final long serialVersionUID = 0L;
    @Id
    private String username;
    private String password;
    private boolean actived;
    @ManyToMany
    @JoinTable(name = "USERS_ROLES")
    private List<Role> role;

    public User(){
        
    }
    public User(String username, String password, boolean actived) {
        this.username = username;
        this.password = password;
        this.actived = actived;
//        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActived() {
        return actived;
    }

    public void setActived(boolean actived) {
        this.actived = actived;
    }

    public List<Role> getRole() {
        return role;
    }

    public void setRole(List<Role> role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + ", actived=" + actived + ", role=" + role + '}';
    }
    
}
