/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bheklilr.bookie.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author Adam
 */
@Configuration
public class BeanConfig {
    /*
    * This method creates a Bean of type BCryptPasswordEncoder
    * THis bean will be available for auto-wiring. This does not require the 
    * TypeClass to have any annotations, and you can read properties values
    * from config files for dynamic configuration of these beans. 
    * 
    * Useful for datasources, or creating Mock versions of beans for unit tests. 
    * Also great for creating client objects for interacting with services if the 
    * @Service annotation is not to your liking.
    */
    @Bean
    public BCryptPasswordEncoder bcryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
