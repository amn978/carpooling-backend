package com.carpooling.carpoolingsystem.repository;

import com.carpooling.carpoolingsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // You can add custom methods here like:
    User findByEmail(String email);
}
