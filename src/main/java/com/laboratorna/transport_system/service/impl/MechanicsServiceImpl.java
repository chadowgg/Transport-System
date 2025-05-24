package com.laboratorna.transport_system.service.impl;

import com.laboratorna.transport_system.dto.DriverDTO;
import com.laboratorna.transport_system.dto.MechanicsDTO;
import com.laboratorna.transport_system.entity.Driver;
import com.laboratorna.transport_system.entity.Mechanics;
import com.laboratorna.transport_system.repository.MechanicsRepository;
import com.laboratorna.transport_system.service.MechanicsService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MechanicsServiceImpl implements MechanicsService {
    private MechanicsRepository mechanicsRepository;
    private ModelMapper mapper;

    public MechanicsServiceImpl(MechanicsRepository mechanicsRepository) {
        this.mechanicsRepository = mechanicsRepository;
        this.mapper = new ModelMapper();
    }

    @Override
    public MechanicsDTO createMechanic(MechanicsDTO dto) {
        Mechanics mechanics = mapper.map(dto, Mechanics.class);
        mechanics = mechanicsRepository.save(mechanics);
        return mapper.map(mechanics, MechanicsDTO.class);
    }

    @Override
    public MechanicsDTO getMechanicById(Long id) {
        Mechanics mechanics = mechanicsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Mechanic not found"));
        return mapper.map(mechanics, MechanicsDTO.class);
    }

    @Override
    public List<MechanicsDTO> getAllMechanics() {
        return mechanicsRepository.findAll().stream()
                .map(mechanics -> mapper.map(mechanics, MechanicsDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteMechanic(Long id) {
        mechanicsRepository.deleteById(id);
    }
}
