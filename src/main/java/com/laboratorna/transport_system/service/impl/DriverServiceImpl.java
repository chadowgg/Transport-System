package com.laboratorna.transport_system.service.impl;

import com.laboratorna.transport_system.dto.DriverDTO;
import com.laboratorna.transport_system.repository.DriverRepository;
import com.laboratorna.transport_system.service.DriverService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import com.laboratorna.transport_system.entity.Driver;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DriverServiceImpl implements DriverService {
    private final DriverRepository driverRepository;
    private final ModelMapper mapper;

    public DriverServiceImpl(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
        this.mapper = new ModelMapper(); // можна @Bean зробити
    }

    @Override
    public DriverDTO createDriver(DriverDTO dto) {
        Driver driver = mapper.map(dto, Driver.class);
        driver = driverRepository.save(driver);
        return mapper.map(driver, DriverDTO.class);
    }

    @Override
    public DriverDTO getDriverById(Long id) {
        Driver driver = driverRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Driver not found"));
        return mapper.map(driver, DriverDTO.class);
    }

    @Override
    public List<DriverDTO> getAllDrivers() {
        return driverRepository.findAll().stream()
                .map(driver -> mapper.map(driver, DriverDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteDriver(Long id) {
        driverRepository.deleteById(id);
    }
}
