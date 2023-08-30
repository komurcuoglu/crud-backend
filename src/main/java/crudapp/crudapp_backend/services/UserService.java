package crudapp.crudapp_backend.services;

import crudapp.crudapp_backend.crud.dao.UserDao;
import crudapp.crudapp_backend.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService {


    public User addUser(User user);
    public List<User> getUsers();
    public User getUser(long userId);
    public User updateUser(User user);
    public User deleteUser(long userId);

}
