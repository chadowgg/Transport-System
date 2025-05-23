package com.laboratorna.transport_system.service;

import com.laboratorna.transport_system.dto.ServiceStationDTO;

import java.util.List;

public interface ServiceStationService {
    ServiceStationDTO createServiceStation(ServiceStationDTO serviceStationDTO);
    ServiceStationDTO getServiceStationById(Long id);
    List<ServiceStationDTO> getAllServiceStation();
    void deleteServiceStation(Long id);
}
