/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faouzi.casierjudiciaire.restservices;

import com.faouzi.casierjudiciaire.dao.RoleDao;
import com.faouzi.casierjudiciaire.dao.UserDao;
import com.faouzi.casierjudiciaire.data.Role;
import com.faouzi.casierjudiciaire.data.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author elmansour
 */
@RestController
@Secured(value = {"ROLE_ADMIN"})
@CrossOrigin("*")
public class UserService {
     @Autowired
     private UserDao userDao;
     @Autowired
     private RoleDao roleDao;
    
    @RequestMapping(value = "/addUser")
    public User saveUser(User user){
        return userDao.save(user);
    }
    
    @RequestMapping(value = "/updateUsers/{usermane}")
    public User updateUser(User user, String username){
        return userDao.saveAndFlush(user);
    }
    
    @RequestMapping(value = "/users")
    public List<User> getAllUsers(){
        return userDao.findAll();
    }
    
    @RequestMapping(value = "/users/{username}")
    public Page<User> findUserByUsername(String username){
        return userDao.findByUsername(username, new PageRequest(0, 10));
    }
    
    @RequestMapping(value = "/users/{usermane}", method = RequestMethod.DELETE)
    public void deleteUser(String username){
        userDao.delete(username);
    }
    
    @RequestMapping(value = "/addRole")
    public Role SaveRole(Role role){
        return roleDao.save(role);
    }
    
    @RequestMapping(value = "/findRoles", method = RequestMethod.GET)
    public List<Role> getAllRoles(){
        return roleDao.findAll();
    }
    
    @RequestMapping(value = "/addRoleToUser")
    public User addRoleToUser(String username, String role){
        User user = userDao.findOne(username);
        Role role1 = roleDao.findOne(role);
        user.getRole().add(role1);
        return userDao.save(user);
    }
}
