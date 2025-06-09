package com.laboratorna.transport_system.service;

import com.laboratorna.transport_system.dto.RepairStationVehicleDTO;

import java.util.List;

public interface RepairStationVehicleService {
    RepairStationVehicleDTO createRepairStationVehicle(RepairStationVehicleDTO dto);
    RepairStationVehicleDTO getRepairStationVehicleById(Long id);
    List<RepairStationVehicleDTO> getAllRepairStationVehicle();
    void deleteRepairStationVehicle(Long id);
}
