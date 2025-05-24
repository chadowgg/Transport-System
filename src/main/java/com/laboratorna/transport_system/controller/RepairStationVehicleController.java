package com.laboratorna.transport_system.controller;

import com.laboratorna.transport_system.dto.RepairStationVehicleDTO;
import com.laboratorna.transport_system.service.RepairStationVehicleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/repairstationvehicle")
public class RepairStationVehicleController {
    private final RepairStationVehicleService repairStationVehicleService;

    public RepairStationVehicleController(RepairStationVehicleService repairStationVehicleService) {
        this.repairStationVehicleService = repairStationVehicleService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<RepairStationVehicleDTO> getRepairStationVehicleById(@PathVariable Long id) {
        return ResponseEntity.ok(repairStationVehicleService.getRepairStationVehicleById(id));
    }

    @GetMapping
    public ResponseEntity<List<RepairStationVehicleDTO>> getAllRepairStationVehicle() {
        return ResponseEntity.ok(repairStationVehicleService.getAllRepairStationVehicle());
    }
}
