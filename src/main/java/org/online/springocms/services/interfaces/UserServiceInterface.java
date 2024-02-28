package org.online.springocms.services.interfaces;
import org.online.springocms.models.User;

import java.util.List;


public interface UserServiceInterface {
    List<User> getAll();


    User getUserById(int userId);

    User createUser(User user);

}
