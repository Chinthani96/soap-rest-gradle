package com.soapservice.soaprestgradle.controller;

import com.soapservice.soaprestgradle.service.NumberClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {

    @Autowired
    NumberClient numberClient;

    @GetMapping(value = "/dollars", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getDollars(@RequestParam(name = "number") int number) {
        com.dataaccess.webservicesserver.NumberToDollarsResponse dollars = numberClient.getDollars(number);
        return dollars.getNumberToDollarsResult();
    }
}