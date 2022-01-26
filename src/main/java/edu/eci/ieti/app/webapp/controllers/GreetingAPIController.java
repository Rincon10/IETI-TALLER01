package edu.eci.ieti.app.webapp.controllers;

import edu.eci.ieti.app.webapp.model.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Iván Camilo Rincón Saavedra
 * @version 1.0 1/26/2022
 * @project App
 */
@RestController
@RequestMapping(value = "/")
@CrossOrigin( origins = "*" )
public class GreetingAPIController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method = RequestMethod.GET, path = "greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}
