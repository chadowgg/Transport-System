package com.laboratorna.transport_system.service.impl;

import com.laboratorna.transport_system.dto.DriverRouteDTO;
import com.laboratorna.transport_system.entity.DriverRoute;
import com.laboratorna.transport_system.repository.DriverRouteRepository;
import com.laboratorna.transport_system.service.DriverRouteService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DriverRouteServiceImpl implements DriverRouteService {
    private final DriverRouteRepository driverRouteRepository;
    private final ModelMapper mapper;

    public DriverRouteServiceImpl(DriverRouteRepository driverRouteRepository) {
        this.driverRouteRepository = driverRouteRepository;
        this.mapper = new ModelMapper();
    }

    @Override
    public DriverRouteDTO getDriverRouteById(Long id) {
        DriverRoute driverRoute = driverRouteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("DriverRoute not found"));
        return mapper.map(driverRoute, DriverRouteDTO.class);
    }

    @Override
    public List<DriverRouteDTO> getAllDriverRoute() {
        return driverRouteRepository.findAll().stream()
                .map(route -> mapper.map(route, DriverRouteDTO.class))
                .collect(Collectors.toList());
    }
}
