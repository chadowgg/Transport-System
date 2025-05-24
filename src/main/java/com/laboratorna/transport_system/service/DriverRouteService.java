package com.laboratorna.transport_system.service;

import com.laboratorna.transport_system.dto.DriverDTO;
import com.laboratorna.transport_system.dto.DriverRouteDTO;
import com.laboratorna.transport_system.entity.embedded.DriverRouteId;

import java.util.List;

public interface DriverRouteService {
    DriverRouteDTO getDriverRouteById(Long id);
    List<DriverRouteDTO> getAllDriverRoute();
}
