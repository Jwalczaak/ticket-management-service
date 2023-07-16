package com.tm.ticketmanagementservice.controllers;

        import org.springframework.web.bind.annotation.*;
@RestController
public class TicketController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}