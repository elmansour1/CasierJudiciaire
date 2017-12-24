/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faouzi.casierjudiciaire.restservices;

import com.faouzi.casierjudiciaire.dao.CasierDao;
import com.faouzi.casierjudiciaire.data.Casier;
import com.faouzi.casierjudiciaire.data.Delit;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
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
@CrossOrigin("*")
public class CasierService {
    @Inject
    private CasierDao casierDao;
    @Secured(value = {"ROLE_ADMIN","ROLE_USER"})
    @RequestMapping(value = "/casiers", method = RequestMethod.GET)
    public List<Casier> getAllCasiers(){
        return casierDao.findAll();
    }
    
    @Secured(value = {"ROLE_ADMIN"})
     @RequestMapping(value = "/casiers", method = RequestMethod.POST)
    public Casier saveCasier(@RequestBody Casier casier, Delit delit){
//        List<Delit> list = new ArrayList<>();
//        list.add(delit);
        return casierDao.save(casier);
    }
    
    @Secured(value = {"ROLE_ADMIN"})
    @RequestMapping(value = "/casiers/{id}", method = RequestMethod.PUT)
    public Casier updateCasier(@RequestBody Casier casier, @PathVariable Long id){
        return casierDao.saveAndFlush(casier);
    }
    
    @Secured(value = {"ROLE_ADMIN","ROLE_USER"})
    @RequestMapping(value = "/casiers/{id}", method = RequestMethod.GET)
    public Casier findCasierById(@PathVariable Long id){
        return casierDao.findOne(id);
    }
    
    @Secured(value = {"ROLE_ADMIN"})
    @RequestMapping(value = "/casiers/{id}", method = RequestMethod.DELETE)
    public void deleteCasier(@PathVariable Long id){
        casierDao.delete(id);
    }
    
}
