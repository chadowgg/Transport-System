package com.laboratorna.transport_system.controller;

import com.laboratorna.transport_system.dto.MechanicsDTO;
import com.laboratorna.transport_system.service.MechanicsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mechanics")
public class MechanicsController {
    private final MechanicsService mechanicsService;

    public MechanicsController(MechanicsService mechanicsService) {
        this.mechanicsService = mechanicsService;
    }

    @PostMapping
    public ResponseEntity<MechanicsDTO> createDriver(@RequestBody MechanicsDTO mechanicsDTO) {
        return ResponseEntity.ok(mechanicsService.createMechanic(mechanicsDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<MechanicsDTO> getDriver(@PathVariable Long id) {
        return ResponseEntity.ok(mechanicsService.getMechanicById(id));
    }

    @GetMapping
    public ResponseEntity<List<MechanicsDTO>> getAllDrivers() {
        return ResponseEntity.ok(mechanicsService.getAllMechanics());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDriver(@PathVariable Long id) {
        mechanicsService.deleteMechanic(id);
        return ResponseEntity.noContent().build();
    }
}
