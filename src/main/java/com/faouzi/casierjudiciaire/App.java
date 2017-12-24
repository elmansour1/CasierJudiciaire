/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faouzi.casierjudiciaire;

import com.faouzi.casierjudiciaire.dao.CasierDao;
import com.faouzi.casierjudiciaire.dao.DelitDao;
import com.faouzi.casierjudiciaire.dao.PersonneDao;
import com.faouzi.casierjudiciaire.data.Casier;
import com.faouzi.casierjudiciaire.data.Delit;
import com.faouzi.casierjudiciaire.data.Personne;
import com.faouzi.casierjudiciaire.data.TypeDelit;
import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author elmansour
 */
@SpringBootApplication
public class App implements CommandLineRunner{
    @Autowired
    private PersonneDao personneDao;
    @Autowired
    private DelitDao delitDao;
    @Autowired
    private CasierDao casierDao;
    
    
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
//        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//        Personne p = new Personne("toto", "tonton", "tata", df.parse("12/12/2017"), "Maroua", "Maroua", "celibataire","etudiant","camerounais");
//        personneDao.save(p);
//        
//        //p.toString();
//        Delit delit = new Delit(df.parse("12/12/2017"),"Maroua",  df.parse("07/12/2017"), df.parse("18/12/2017"),"nature mandat", "suivant....", p, TypeDelit.contraventions);
//        delitDao.save(delit);
//        List<Delit> list =new ArrayList<>() ;
//        list.add(delit);
//        Casier casier = new Casier(p, list);
//        casierDao.save(casier);
//        System.out.println("");
//        System.out.println("");
//       // BasisLibrary.consoleOutput(p.toString());
//        System.out.println("");
//        System.out.println("");
//       // BasisLibrary.consoleOutput(delit.toString());
//        System.out.println("");
//        System.out.println("");
//        //BasisLibrary.consoleOutput(casier.toString());
    }
    
}
