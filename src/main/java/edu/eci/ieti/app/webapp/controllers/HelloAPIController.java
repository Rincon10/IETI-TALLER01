package edu.eci.ieti.app.webapp.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Iván Camilo Rincón Saavedra
 * @version 1.0 1/26/2022
 * @project App
 */

@RestController
@RequestMapping(value = "/")
@CrossOrigin( origins = "*" )
public class HelloAPIController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
