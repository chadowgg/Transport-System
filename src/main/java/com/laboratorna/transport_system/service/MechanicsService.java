package com.laboratorna.transport_system.service;

import com.laboratorna.transport_system.dto.DriverDTO;
import com.laboratorna.transport_system.dto.MechanicsDTO;

import java.util.List;

public interface MechanicsService {
    MechanicsDTO createMechanic(MechanicsDTO dto);
    MechanicsDTO getMechanicById(Long id);
    List<MechanicsDTO> getAllMechanics();
    void deleteMechanic(Long id);
}
