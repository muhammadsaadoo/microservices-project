package com.trustify.auth_service.repositories;

import com.trustify.auth_service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthRepo extends JpaRepository<User,Long> {

    Optional<User> findByEmail(String email);
}
