package org.online.springocms.services;
import org.online.springocms.models.User;
import org.online.springocms.services.interfaces.UserServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
public class UserService implements UserServiceInterface{
    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getByUserId(int id) {
        return null;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public List<User> getByFirstname(String surname) {
        return null;
    }
}
