package com.tm.ticketmanagementservice.models;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // Default constructor (required by JPA)


    // Optional: Override toString for logging purposes

}

