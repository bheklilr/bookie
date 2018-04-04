/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bheklilr.bookie.session;

import java.util.Calendar;
import org.springframework.stereotype.Component;

/**
 *
 * @author Adam
 * Do not initialize this class. Don't write a constructor (yet...)
 * Use @Autowired Thing thing;
 * Injected beans come in after the constructor. If you need them earlier,
 *   use a method with @PostConstruct
 *   Beans are only autowirable from a Spring-Managed object. 
 *           (like @Controller, @Service, @RestController)
 * 
 */
@Component(value="session")
public class Thing {
    //This object will be scoped to a given HTTP Session.
    /*
    Possible Use-Cases - 
          Browsing history for forward/backward navigation
          States shared accross a given 'flow' (i.e. purchasing something)
          Recent Search Queries, 
          Pre-populate forms with data in session 
    */
    // Sessions will eventually expire, and fall out of scope. 
    private String sessionString;
    private Calendar someDate;

    public String getSessionString() {
        return sessionString;
    }

    public void setSessionString(String sessionString) {
        this.sessionString = sessionString;
    }

    public Calendar getSomeDate() {
        return someDate;
    }

    public void setSomeDate(Calendar someDate) {
        this.someDate = someDate;
    }
    
    
}
