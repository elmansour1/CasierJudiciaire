/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faouzi.casierjudiciaire.restservices;

import com.faouzi.casierjudiciaire.dao.PersonneDao;
import com.faouzi.casierjudiciaire.data.Personne;
import java.util.List;
import javax.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;
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
public class PersonneService {
    @Autowired
    private PersonneDao personneDao;
    @Secured(value = {"ROLE_ADMIN","ROLE_USER"})
    @RequestMapping(method = RequestMethod.GET, value = "/personnes")
    public List<Personne> getAllPersonne(){
        return personneDao.findAll();
    }
    
    @Secured(value = {"ROLE_ADMIN"})
    @RequestMapping(value = "/personnes", method = RequestMethod.POST)
    public Personne savePersonne(@RequestBody Personne personne){
        return personneDao.save(personne);
    }
    
    @Secured(value = {"ROLE_ADMIN"})
    @RequestMapping(value = "/personnes/{id}", method = RequestMethod.PUT)
    public Personne updatePersonne(@RequestBody Personne personne, @PathVariable Long id){
        return personneDao.saveAndFlush(personne);
    }
    
    @Secured(value = {"ROLE_ADMIN","ROLE_USER"})
    @RequestMapping(value = "/personnes/{id}", method = RequestMethod.GET)
    public Personne findPersonneById(@PathVariable Long id){
        return personneDao.findOne(id);
    }
    
    @Secured(value = {"ROLE_ADMIN"})
    @RequestMapping(value = "/personnes/{id}", method = RequestMethod.DELETE)
    public void deletePersonne(@PathVariable Long id){
        personneDao.delete(id);
    }
    
    
}
