package com.techsamples.rest.microservices.controller.entity;

public class MicroservicesSamplesMessage {
    private String message;

    public MicroservicesSamplesMessage(String message) {
        this.message = message;
    }
    //this getter is very important for json parser to parse java bean to json
    public String getMessage() {
        return message;
    }
}
