package com.example.demo.controller;

import com.example.demo.model.Flight;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/flights") // Маршрут для всіх методів цього контролера
public class FlightController {

    private static final List<Flight> flights = new ArrayList<>();

    // Ініціалізація початкових рейсів
    static {
        flights.add(new Flight(1L, "Kyiv", "Odessa", LocalDateTime.now(), LocalDateTime.now().plusHours(1), 100.0, "UA123", LocalDateTime.now()));
        flights.add(new Flight(2L, "Lviv", "Kharkiv", LocalDateTime.now(), LocalDateTime.now().plusHours(2), 200.0, "UA124", LocalDateTime.now()));
    }

    // Отримання всіх рейсів
    @GetMapping
    public List<Flight> getAllFlights() {
        return flights;
    }

    // Створення нового рейсу
    @PostMapping
    public ResponseEntity<Flight> createFlight(@RequestBody Flight flight) {
        flight.setId((long) (flights.size() + 1));
        flight.setCreationDate(LocalDateTime.now());
        flights.add(flight);
        return ResponseEntity.status(HttpStatus.CREATED).body(flight);
    }

    // Видалення рейсу за ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFlight(@PathVariable Long id) {
        boolean removed = flights.removeIf(flight -> flight.getId().equals(id));
        return removed ? ResponseEntity.noContent().build() : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
