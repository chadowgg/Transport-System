package com.laboratorna.transport_system.controller;

import com.laboratorna.transport_system.dto.RouteDTO;
import com.laboratorna.transport_system.service.RouteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/routes")
public class RouteController {
    private final RouteService routeService;

    public RouteController(RouteService routeService) {
        this.routeService = routeService;
    }

    @PostMapping
    public ResponseEntity<RouteDTO> createDriver(@RequestBody RouteDTO routeDTO) {
        return ResponseEntity.ok(routeService.createRoute(routeDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<RouteDTO> getDriver(@PathVariable Long id) {
        return ResponseEntity.ok(routeService.getRouteById(id));
    }

    @GetMapping
    public ResponseEntity<List<RouteDTO>> getAllDrivers() {
        return ResponseEntity.ok(routeService.getAllRoutes());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDriver(@PathVariable Long id) {
        routeService.deleteRoute(id);
        return ResponseEntity.noContent().build();
    }
}
