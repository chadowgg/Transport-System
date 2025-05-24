package com.laboratorna.transport_system.controller;

import com.laboratorna.transport_system.dto.DriverRouteDTO;
import com.laboratorna.transport_system.service.DriverRouteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/driverroute")
public class DriverRouteController {
    private final DriverRouteService driverRouteService;

    public DriverRouteController(DriverRouteService driverRouteService) {
        this.driverRouteService = driverRouteService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<DriverRouteDTO> getByIds(@PathVariable Long id) {
        return ResponseEntity.ok(driverRouteService.getDriverRouteById(id));
    }

    @GetMapping
    public ResponseEntity<List<DriverRouteDTO>> getAllDrivers() {
        return ResponseEntity.ok(driverRouteService.getAllDriverRoute());
    }
}
