package com.laboratorna.transport_system.service;

import com.laboratorna.transport_system.dto.DriverDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DriverService {
    DriverDTO createDriver(DriverDTO dto);
    DriverDTO getDriverById(Long id);
    List<DriverDTO> getAllDrivers();
    void deleteDriver(Long id);
}
