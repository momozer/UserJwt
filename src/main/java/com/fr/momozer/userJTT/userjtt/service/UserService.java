package com.fr.momozer.userJTT.userjtt.service;

import com.fr.momozer.userJTT.userjtt.model.Role;
import com.fr.momozer.userJTT.userjtt.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
