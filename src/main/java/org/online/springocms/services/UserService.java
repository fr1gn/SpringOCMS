package org.online.springocms.services;
import org.online.springocms.models.User;

import org.online.springocms.services.interfaces.UserServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
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
    public User getUserById(int userId) {
        return repo.getUserById(userId);
    }

    @Override
    public User createUser(User user) {
        User createdUser = repo.createUser(user);

        return createdUser;
    }
}
