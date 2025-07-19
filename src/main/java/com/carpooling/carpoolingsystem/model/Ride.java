package com.carpooling.carpoolingsystem.model;

import jakarta.persistence.*;

@Entity
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String source;
    private String destination;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private User driver; // ✅ Add this

    // ✅ Constructors
    public Ride() {}

    public Ride(String source, String destination, User driver) {
        this.source = source;
        this.destination = destination;
        this.driver = driver;
    }

    // ✅ Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public User getDriver() {
        return driver;
    }

    public void setDriver(User driver) {
        this.driver = driver;
    }
}
