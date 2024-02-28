package org.online.springocms.services;

import org.online.springocms.models.User;
import org.online.springocms.repositories.UserRepositoryInterface;
import org.online.springocms.services.interfaces.UserServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements UserServiceInterface{
    private final UserRepositoryInterface repo;
    public UserService(UserRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<User> getAll() {
        return repo.findAll();
    }

    @Override
    public User getUserById(int userId) {
        return repo.findById(userId).orElse(null);
    }

    @Override
    public User createUser(User user) {
        User createdUser = repo.save(user);

        return createdUser;
    }
}
