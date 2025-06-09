package com.laboratorna.transport_system.service;

import com.laboratorna.transport_system.dto.DriverRouteDTO;
import java.util.List;

public interface DriverRouteService {
    DriverRouteDTO createDriverRoute(DriverRouteDTO dto);
    DriverRouteDTO getDriverRouteById(Long id);
    List<DriverRouteDTO> getAllDriverRoute();
    void deleteDriverRoute(Long id);
}
