package com.example.demo.model;

import java.time.LocalDateTime;

public class Flight {
    private Long id;
    private String departure;
    private String arrival;
    private LocalDateTime departureDateTime;
    private LocalDateTime arrivalDateTime;
    private double price;
    private String flightNumber;
    private LocalDateTime creationDate;

    // Конструктор з параметрами
    public Flight(Long id, String departure, String arrival, LocalDateTime departureDateTime,
                  LocalDateTime arrivalDateTime, double price, String flightNumber, LocalDateTime creationDate) {
        this.id = id;
        this.departure = departure;
        this.arrival = arrival;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.price = price;
        this.flightNumber = flightNumber;
        this.creationDate = creationDate;
    }

    // Конструктор за замовчуванням
    public Flight() {}

    // Геттери та сеттери
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDeparture() { return departure; }
    public void setDeparture(String departure) { this.departure = departure; }

    public String getArrival() { return arrival; }
    public void setArrival(String arrival) { this.arrival = arrival; }

    public LocalDateTime getDepartureDateTime() { return departureDateTime; }
    public void setDepartureDateTime(LocalDateTime departureDateTime) { this.departureDateTime = departureDateTime; }

    public LocalDateTime getArrivalDateTime() { return arrivalDateTime; }
    public void setArrivalDateTime(LocalDateTime arrivalDateTime) { this.arrivalDateTime = arrivalDateTime; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getFlightNumber() { return flightNumber; }
    public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }

    public LocalDateTime getCreationDate() { return creationDate; }
    public void setCreationDate(LocalDateTime creationDate) { this.creationDate = creationDate; }
}
