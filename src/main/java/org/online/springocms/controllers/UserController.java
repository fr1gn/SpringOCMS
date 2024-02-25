package org.online.springocms.controllers;
import org.online.springocms.models.User;
import org.online.springocms.repositories.UserRepositoryInterface;
import org.online.springocms.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
@RestController
@RequestMapping("users")
public class UserController {

    private final UserRepositoryInterface service;

    public UserController(UserRepositoryInterface service) {
        this.service = service;
}
    @GetMapping("hello")
    public String sayHello() {
        return "Hello World";
    }
    @GetMapping("/")
    public List<User> getAll(){

    }
    @GetMapping("/{user_id}")
    public ResponseEntity<User> getByUserId(@PathVariable("user_id") int id){
        User user = service.getById(id);
        if(user == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); //404

        return new ResponseEntity<>(user, HttpStatus.OK); //200
    }

    @PostMapping("/")
    public ResponseEntity<User> create(@RequestBody User user){
        User createdUser = service.create(user);
        if(createdUser == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @GetMapping("/surname/{user_surname}")
    public List<User> getAllByLastName(@PathVariable("user_FirstName") String FirstName){
        return Collections.singletonList(service.getById(Integer.valueOf(FirstName)));
    }

}