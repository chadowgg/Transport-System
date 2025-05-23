package com.laboratorna.transport_system.service.impl;

import com.laboratorna.transport_system.dto.RouteDTO;
import com.laboratorna.transport_system.dto.ServiceStationDTO;
import com.laboratorna.transport_system.entity.Route;
import com.laboratorna.transport_system.entity.ServiceStation;
import com.laboratorna.transport_system.repository.RouteRepository;
import com.laboratorna.transport_system.service.RouteService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RouteImpl implements RouteService {
    private RouteRepository routeRepository;
    private ModelMapper mapper;

    public RouteImpl(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
        mapper = new ModelMapper();
    }

    @Override
    public RouteDTO createRoute(RouteDTO dto) {
        Route route = mapper.map(dto, Route.class);
        route = routeRepository.save(route);
        return mapper.map(route, RouteDTO.class);
    }

    @Override
    public RouteDTO getRouteById(Long id) {
        Route route = routeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Service station not found"));
        return mapper.map(route, RouteDTO.class);
    }

    @Override
    public List<RouteDTO> getAllRoutes() {
        return routeRepository.findAll().stream()
                .map(route -> mapper.map(route, RouteDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteRoute(Long id) {
        routeRepository.deleteById(id);
    }
}
