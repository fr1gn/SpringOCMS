package org.online.springocms.services;
import org.online.springocms.models.User;

import org.online.springocms.services.interfaces.UserServiceInterface;

import java.util.List;
public class UserService implements UserServiceInterface{
    private final UserServiceInterface repo;
    public UserService(UserServiceInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<User> getAll() {
        return repo.getAll();
    }

    @Override
    public User getUserById(int id) {
        return repo.getUserById(id);
    }

    @Override
    public User createUser(User user) {
        User createdUser = repo.createUser(user);

        return createdUser;
    }
    @Override
    public List<User> getUsersByFirstname(String firstname) {
        return repo.getUsersByFirstName(firstname);
    }
}
