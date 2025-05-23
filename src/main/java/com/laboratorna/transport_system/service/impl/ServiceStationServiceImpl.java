package com.laboratorna.transport_system.service.impl;

import com.laboratorna.transport_system.dto.ServiceStationDTO;
import com.laboratorna.transport_system.entity.ServiceStation;
import com.laboratorna.transport_system.repository.ServiceStationRepository;
import com.laboratorna.transport_system.service.ServiceStationService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceStationServiceImpl implements ServiceStationService {
    private final ServiceStationRepository serviceStationRepository;
    private final ModelMapper mapper;

    ServiceStationServiceImpl(ServiceStationRepository serviceStationRepository) {
        this.serviceStationRepository = serviceStationRepository;
        mapper = new ModelMapper();
    }

    @Override
    public ServiceStationDTO createServiceStation(ServiceStationDTO dto) {
        ServiceStation serviceStation = mapper.map(dto, ServiceStation.class);
        serviceStation = serviceStationRepository.save(serviceStation);
        return mapper.map(serviceStation, ServiceStationDTO.class);
    }

    @Override
    public ServiceStationDTO getServiceStationById(Long id) {
        ServiceStation serviceStation = serviceStationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Service station not found"));
        return mapper.map(serviceStation, ServiceStationDTO.class);
    }

    @Override
    public List<ServiceStationDTO> getAllServiceStation() {
        return serviceStationRepository.findAll().stream()
                .map(station -> mapper.map(station, ServiceStationDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteServiceStation(Long id) {
        serviceStationRepository.deleteById(id);
    }
}
