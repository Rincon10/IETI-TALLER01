package edu.eci.ieti.app.webapp.model;

/**
 * @author Iván Camilo Rincón Saavedra
 * @version 1.0 1/26/2022
 * @project App
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}