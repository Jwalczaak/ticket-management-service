package com.tm.ticketmanagementservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TicketController {

    @GetMapping("/welcome")
    public String Welcome(){
    String  welcomeMSg = "Welcome to springboot planet!";
    return  welcomeMSg;
    }
}
