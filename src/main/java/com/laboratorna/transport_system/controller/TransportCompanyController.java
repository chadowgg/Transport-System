package com.laboratorna.transport_system.controller;

import com.laboratorna.transport_system.dto.TransportCompanyDTO;
import com.laboratorna.transport_system.service.TransportCompanyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/company")
public class TransportCompanyController {
    private final TransportCompanyService transportCompanyService;

    public TransportCompanyController(TransportCompanyService transportCompanyService) {
        this.transportCompanyService = transportCompanyService;
    }


    @PostMapping
    public ResponseEntity<TransportCompanyDTO> createCompany(@RequestBody TransportCompanyDTO transportCompanyDTO) {
        return ResponseEntity.ok(transportCompanyService.createCompany(transportCompanyDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<TransportCompanyDTO> getCompanyById(@PathVariable Long id) {
        return ResponseEntity.ok(transportCompanyService.getCompanyById(id));
    }

    @GetMapping
    public ResponseEntity<List<TransportCompanyDTO>> getAllCompany() {
        return ResponseEntity.ok(transportCompanyService.getAllCompanies());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TransportCompanyDTO> deleteCompany(@PathVariable Long id) {
        transportCompanyService.deleteCompany(id);
        return ResponseEntity.noContent().build();
    }
}
