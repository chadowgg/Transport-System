package com.laboratorna.transport_system.service.impl;

import com.laboratorna.transport_system.dto.RepairStationVehicleDTO;
import com.laboratorna.transport_system.entity.RepairStationVehicle;
import com.laboratorna.transport_system.repository.RepairStationVehicleRepository;
import com.laboratorna.transport_system.service.RepairStationVehicleService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RepairStationVehicleServiceImpl implements RepairStationVehicleService {
    private final RepairStationVehicleRepository repairStationVehicleRepository;
    private final ModelMapper mapper;

    public RepairStationVehicleServiceImpl(RepairStationVehicleRepository repairStationVehicleRepository) {
        this.repairStationVehicleRepository = repairStationVehicleRepository;
        this.mapper = new ModelMapper();
    }

    @Override
    public RepairStationVehicleDTO getRepairStationVehicleById(Long id) {
        RepairStationVehicle repairStationVehicle = repairStationVehicleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Repair station vehicle not found"));
        return mapper.map(repairStationVehicle, RepairStationVehicleDTO.class);
    }

    @Override
    public List<RepairStationVehicleDTO> getAllRepairStationVehicle() {
        return repairStationVehicleRepository.findAll().stream()
                .map(repairStation -> mapper.map(repairStation, RepairStationVehicleDTO.class))
                .collect(Collectors.toList());
    }
}
