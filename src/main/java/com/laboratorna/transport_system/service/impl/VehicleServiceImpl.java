package com.laboratorna.transport_system.service.impl;

import com.laboratorna.transport_system.dto.VehicleDTO;
import com.laboratorna.transport_system.entity.Vehicle;
import com.laboratorna.transport_system.repository.VehicleRepository;
import com.laboratorna.transport_system.service.VehicleService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VehicleServiceImpl implements VehicleService {
    private final VehicleRepository vehicleRepository;
    private final ModelMapper mapper;

    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
        mapper = new ModelMapper();
    }

    @Override
    public VehicleDTO createVehicle(VehicleDTO dto) {
        Vehicle vehicle = mapper.map(dto, Vehicle.class);
        vehicle = vehicleRepository.save(vehicle);
        return mapper.map(vehicle, VehicleDTO.class);
    }

    @Override
    public VehicleDTO getVehicleById(Long id) {
        Vehicle vehicle = vehicleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Vehicle not found"));
        return mapper.map(vehicle, VehicleDTO.class);
    }

    @Override
    public List<VehicleDTO> getAllVehicles() {
        return vehicleRepository.findAll().stream()
                .map(vehicle -> mapper.map(vehicle, VehicleDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteVehicle(Long id) {
        vehicleRepository.deleteById(id);
    }
}
