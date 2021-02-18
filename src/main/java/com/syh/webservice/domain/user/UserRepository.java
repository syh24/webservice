package com.syh.webservice.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository {

    Optional<User> findByEmail(String email);
}
