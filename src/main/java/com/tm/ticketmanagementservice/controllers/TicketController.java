package com.tm.ticketmanagementservice.controllers;


import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.web.bind.annotation.*;
        import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class TicketController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }



}