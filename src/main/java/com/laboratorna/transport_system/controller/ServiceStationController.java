package com.laboratorna.transport_system.controller;

import com.laboratorna.transport_system.dto.ServiceStationDTO;
import com.laboratorna.transport_system.service.ServiceStationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/servicestation")
public class ServiceStationController {
    private final ServiceStationService serviceStationService;

    public ServiceStationController(ServiceStationService serviceStationService) {
        this.serviceStationService = serviceStationService;
    }

    @PostMapping
    public ResponseEntity<ServiceStationDTO> createServiceStation(@RequestBody ServiceStationDTO serviceStationDTO) {
        return ResponseEntity.ok(serviceStationService.createServiceStation(serviceStationDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServiceStationDTO> getServiceStationById(@PathVariable Long id) {
        return ResponseEntity.ok(serviceStationService.getServiceStationById(id));
    }

    @GetMapping
    public ResponseEntity<List<ServiceStationDTO>> getAllServiceStation() {
        return ResponseEntity.ok(serviceStationService.getAllServiceStation());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteServiceStation(@PathVariable Long id) {
        serviceStationService.deleteServiceStation(id);
        return ResponseEntity.noContent().build();
    }
}
