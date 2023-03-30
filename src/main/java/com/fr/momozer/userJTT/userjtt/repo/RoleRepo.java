package com.fr.momozer.userJTT.userjtt.repo;

import com.fr.momozer.userJTT.userjtt.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
