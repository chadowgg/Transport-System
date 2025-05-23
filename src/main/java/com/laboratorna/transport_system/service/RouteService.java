package com.laboratorna.transport_system.service;

import com.laboratorna.transport_system.dto.RouteDTO;
import com.laboratorna.transport_system.dto.ServiceStationDTO;

import java.util.List;

public interface RouteService {
    RouteDTO createRoute(RouteDTO routeDTO);
    RouteDTO getRouteById(Long id);
    List<RouteDTO> getAllRoutes();
    void deleteRoute(Long id);
}
