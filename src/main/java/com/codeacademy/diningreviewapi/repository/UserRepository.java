package com.codeacademy.diningreviewapi.repository;

import com.codeacademy.diningreviewapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUserByDisplayName(String displayName);
    boolean existsByDisplayName (String displayName);

}
