package org.online.springocms.services;
import org.online.springocms.models.User;
import org.online.springocms.repositories.UserRepositoryInterface;
import org.online.springocms.services.interfaces.UserServiceInterface;

import java.util.List;
public class UserService implements UserServiceInterface{
    private final UserRepositoryInterface repo;
    public UserService(UserRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<User> getAll() {
        return repo.getAllUsers();
    }

    @Override
    public User getByUserId(int id) {
        return repo.getUserById(id);
    }

    @Override
    public User create(User user) {
        User createdUser = repo.createUser(user);

        return createdUser;
    }

    @Override
    public List<User> getByFirstname(String firstname) {
        return repo.getUsersByFirstName(firstname);
    }
}
