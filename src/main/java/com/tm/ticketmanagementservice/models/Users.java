package com.tm.ticketmanagementservice.models;

import com.tm.ticketmanagementservice.enums.Gender;
import jakarta.persistence.*;

@Entity
@Table(name ="users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
    private String surname;
    private String name;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    public Long getId(){
        return id;
    }

    public String getUsername(){
        return username;
    }

}
