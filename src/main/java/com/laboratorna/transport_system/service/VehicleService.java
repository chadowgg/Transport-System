package com.laboratorna.transport_system.service;

import com.laboratorna.transport_system.dto.VehicleDTO;

import java.util.List;

public interface VehicleService {
    VehicleDTO createVehicle(VehicleDTO dto);
    VehicleDTO getVehicleById(Long id);
    List<VehicleDTO> getAllVehicles();
    void deleteVehicle(Long id);
}
