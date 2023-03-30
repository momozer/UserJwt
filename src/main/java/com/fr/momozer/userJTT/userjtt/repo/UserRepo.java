package com.fr.momozer.userJTT.userjtt.repo;

import com.fr.momozer.userJTT.userjtt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
