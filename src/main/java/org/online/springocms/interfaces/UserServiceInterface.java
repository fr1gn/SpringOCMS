package org.online.springocms.interfaces;
import org.online.springocms.models.User;



public interface UserServiceInterface {
    List<User> getAll();
    User getByUserId(int id);
    User create(User user);
    List<User> getByFirstname(String surname);
}