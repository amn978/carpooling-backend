package com.carpooling.carpoolingsystem.controller;

import com.carpooling.carpoolingsystem.model.Ride;
import com.carpooling.carpoolingsystem.model.User;
import com.carpooling.carpoolingsystem.repository.RideRepository;
import com.carpooling.carpoolingsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rides")
public class RideController {

    @Autowired
    private RideRepository rideRepository;

    @Autowired
    private UserRepository userRepository;

    // ✅ Create a ride
    @PostMapping("/create")
    public Ride createRide(@RequestBody Ride ride, @RequestParam Long driverId) {
        Optional<User> userOptional = userRepository.findById(driverId);
        if (userOptional.isPresent()) {
            ride.setDriver(userOptional.get());
            return rideRepository.save(ride);
        }
        throw new RuntimeException("Driver not found");
    }

    // ✅ Get all rides
    @GetMapping("/all")
    public List<Ride> getAllRides() {
        return rideRepository.findAll();
    }
}
