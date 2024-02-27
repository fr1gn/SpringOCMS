package org.online.springocms.services.interfaces;
import org.online.springocms.models.User;

import java.util.List;


public interface UserServiceInterface {
    List<User> getAll();
    User getByUserId(int id);
    User create(User user);
    List<User> getAllUsers();

    User getUserById(int id);

    User createUser(User user);

    List<User> getUsersByFirstName(String firstname);

    List<User> getByFirstname(String surname);
}
