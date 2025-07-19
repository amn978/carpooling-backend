package com.carpooling.carpoolingsystem.repository;

import com.carpooling.carpoolingsystem.model.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRepository extends JpaRepository<Ride, Long> {
}
