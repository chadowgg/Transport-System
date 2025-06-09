package com.laboratorna.transport_system.controller;

import com.laboratorna.transport_system.dto.RepairStationVehicleDTO;
import com.laboratorna.transport_system.service.RepairStationVehicleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/repairstationvehicle")
public class RepairStationVehicleController {
    private final RepairStationVehicleService repairStationVehicleService;

    public RepairStationVehicleController(RepairStationVehicleService repairStationVehicleService) {
        this.repairStationVehicleService = repairStationVehicleService;
    }

    @PostMapping
    public ResponseEntity<RepairStationVehicleDTO> createRepairStationVehicle(RepairStationVehicleDTO dto) {
        return ResponseEntity.ok(repairStationVehicleService.createRepairStationVehicle(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<RepairStationVehicleDTO> getRepairStationVehicleById(@PathVariable Long id) {
        return ResponseEntity.ok(repairStationVehicleService.getRepairStationVehicleById(id));
    }

    @GetMapping
    public ResponseEntity<List<RepairStationVehicleDTO>> getAllRepairStationVehicle() {
        return ResponseEntity.ok(repairStationVehicleService.getAllRepairStationVehicle());
    }

    @DeleteMapping
    public ResponseEntity<Void> createRepairStationVehicle(Long id) {
        repairStationVehicleService.deleteRepairStationVehicle(id);
        return ResponseEntity.noContent().build();
    }
}
