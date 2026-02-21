package com.eg.userms.service;

import com.eg.userms.exception.UserException;
import com.eg.userms.model.User;
import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById(Long id) throws UserException;
    List<User> getAllusers();
    void deleteUser(Long id) throws UserException;
    User updateUser(Long id, User user) throws UserException;
}
