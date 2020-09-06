package com.techsamples.rest.microservices.controller;

import com.techsamples.rest.microservices.controller.entity.MicroservicesSamplesMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroservicesSamplesController {
    @GetMapping(path = "/message")
    public MicroservicesSamplesMessage message() {
        return new MicroservicesSamplesMessage("Microservices Samples");
    }

}
