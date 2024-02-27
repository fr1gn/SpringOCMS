package org.online.springocms.services.interfaces;
import org.online.springocms.models.User;

import java.util.List;


public interface UserServiceInterface {
    List<User> getAll();
    User getByUserId(int id);
    User create(User user);
    List<User> getByFirstname(String surname);
}
