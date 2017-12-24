/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faouzi.casierjudiciaire.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author elmansour
 */
@Controller
public class WebController{
    
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    
    @RequestMapping("/logout")
    public String logout(){
        return "login";
    }
}
