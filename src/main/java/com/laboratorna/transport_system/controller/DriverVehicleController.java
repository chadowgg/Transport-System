package com.laboratorna.transport_system.controller;

import com.laboratorna.transport_system.dto.DriverVehicleDTO;
import com.laboratorna.transport_system.service.DriverVehicleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/drivervehicle")
public class DriverVehicleController {
    private final DriverVehicleService driverVehicleService;

    public DriverVehicleController(DriverVehicleService driverVehicleService) {
        this.driverVehicleService = driverVehicleService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<DriverVehicleDTO> getByIds(@PathVariable Long id) {
        return ResponseEntity.ok(driverVehicleService.getDriverVehicleById(id));
    }

    @GetMapping
    public ResponseEntity<List<DriverVehicleDTO>> getAllDrivers() {
        return ResponseEntity.ok(driverVehicleService.getAllDriverVehicle());
    }
}
