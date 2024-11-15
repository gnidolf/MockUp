package com.example.MockUp.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory; 

@RestController
public class MainController {

    private Logger log = LoggerFactory.getLogger(MainController.class);

    ObjectMapper mapper = new ObjectMapper();

    @PostMapping(
        value = "/test",
        producers = MediaType.APPLICATION_JSON_VALUE,
        consumers = MediaType.APPLICATION_JSON_VALUE
    )
    public Object postValue() {

        try {
            String id = RequestDTO.getid();
            char firstDigit.charAt()
        } catch {

        }
    }
}