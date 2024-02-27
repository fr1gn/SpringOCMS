package org.online.springocms.repositories;
import org.online.springocms.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface UserRepositoryInterface extends JpaRepository<User, Integer> {
    boolean createUser(User user);
    User getUser(int userId);
    List<User> getAllUsers();

    List<User> getAll();

    User create(User user);
}
