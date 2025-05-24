package com.laboratorna.transport_system.service;

import com.laboratorna.transport_system.dto.DriverVehicleDTO;

import java.util.List;

public interface DriverVehicleService {
    DriverVehicleDTO getDriverVehicleById(Long id);
    List<DriverVehicleDTO> getAllDriverVehicle();
}
