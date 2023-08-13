package com.tm.ticketmanagementservice.services;

import com.tm.ticketmanagementservice.models.Users;
import com.tm.ticketmanagementservice.repositories.UsersRepository;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    public Optional<Users> getCurrentUser(String username) {
        return usersRepository.findByUsername(username);
    }


}
