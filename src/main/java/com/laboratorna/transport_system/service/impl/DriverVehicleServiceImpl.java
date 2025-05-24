package com.laboratorna.transport_system.service.impl;

import com.laboratorna.transport_system.dto.DriverVehicleDTO;
import com.laboratorna.transport_system.entity.DriverVehicle;
import com.laboratorna.transport_system.repository.DriverVehicleRepository;
import com.laboratorna.transport_system.service.DriverVehicleService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DriverVehicleServiceImpl implements DriverVehicleService {
    private final DriverVehicleRepository driverVehicleRepository;
    private final ModelMapper mapper;

    public DriverVehicleServiceImpl(DriverVehicleRepository driverVehicleRepository) {
        this.driverVehicleRepository = driverVehicleRepository;
        this.mapper = new ModelMapper();
    }

    @Override
    public DriverVehicleDTO getDriverVehicleById(Long id) {
        DriverVehicle driverVehicle = driverVehicleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("DriverRoute not found"));
        return mapper.map(driverVehicle, DriverVehicleDTO.class);
    }

    @Override
    public List<DriverVehicleDTO> getAllDriverVehicle() {
        return driverVehicleRepository.findAll().stream()
                .map(vehicle -> mapper.map(vehicle, DriverVehicleDTO.class))
                .collect(Collectors.toList());
    }
}
