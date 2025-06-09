package com.laboratorna.transport_system.service;

import com.laboratorna.transport_system.dto.DriverVehicleDTO;

import java.util.List;

public interface DriverVehicleService {
    DriverVehicleDTO createDriverVehicle(DriverVehicleDTO dto);
    DriverVehicleDTO getDriverVehicleById(Long id);
    List<DriverVehicleDTO> getAllDriverVehicle();
    void deleteDriverVehicle(Long id);
}
