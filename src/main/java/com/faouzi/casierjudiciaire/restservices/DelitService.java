/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faouzi.casierjudiciaire.restservices;

import com.faouzi.casierjudiciaire.dao.DelitDao;
import com.faouzi.casierjudiciaire.dao.UserDao;
import com.faouzi.casierjudiciaire.data.Casier;
import com.faouzi.casierjudiciaire.data.Delit;
import com.faouzi.casierjudiciaire.data.User;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Page;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.context.SecurityContext;
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
@CrossOrigin("*")
public class DelitService {
    @Inject
    private DelitDao delitDao;
    @Autowired
    private UserDao userDao;
    
    @Secured(value = {"ROLE_ADMIN","ROLE_USER"})
    @RequestMapping(value = "/delits", method = RequestMethod.GET)
    public Page<Object[]> getAllDelits(){
        return delitDao.findTout(new PageRequest(0, 10));
    }
    
    @Secured(value = {"ROLE_ADMIN"})
     @RequestMapping(value = "/delits", method = RequestMethod.POST)
    public Delit saveDelit(@RequestBody Delit delit){
        
        return delitDao.save(delit);
    }
    
    @Secured(value = {"ROLE_ADMIN"})
    @RequestMapping(value = "/delits/{id}", method = RequestMethod.PUT)
    public Delit updateDelit(@RequestBody Delit delit, @PathVariable Long id){
        return delitDao.saveAndFlush(delit);
    }
    
    @Secured(value = {"ROLE_ADMIN","ROLE_USER"})
    @RequestMapping(value = "/delits/{id}", method = RequestMethod.GET)
    public Delit findDelitById(@PathVariable Long id){
        return delitDao.findOne(id);
    }
    
    @Secured(value = {"ROLE_ADMIN"})
    @RequestMapping(value = "/delits/{id}", method = RequestMethod.DELETE)
    public void deleteDelit(@PathVariable Long id){
        delitDao.delete(id);
    }
    
     @RequestMapping(value = "/getUserAuthenticated", method = RequestMethod.GET)
    public Page<User> getUserAuthenticated(HttpServletRequest httpServletRequest){
        HttpSession httpSession = httpServletRequest.getSession();
        SecurityContext securityContext = (SecurityContext) httpSession.getAttribute("SPRING_SECURITY_CONTEXT");
        String username = securityContext.getAuthentication().getName();
        List<String>  roles = new ArrayList<String>();
        String roless = securityContext.getAuthentication().getAuthorities().toString();
        System.out.println(roless);
        //System.out.println("Principal="+username);
        //Long idUser = Long.parseLong(username);
        return userDao.findByUsername(username, new PageRequest(0, 10));
    }
}
