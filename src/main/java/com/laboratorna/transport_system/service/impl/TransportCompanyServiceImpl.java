package com.laboratorna.transport_system.service.impl;

import com.laboratorna.transport_system.controller.TransportCompanyController;
import com.laboratorna.transport_system.dto.DriverDTO;
import com.laboratorna.transport_system.dto.TransportCompanyDTO;
import com.laboratorna.transport_system.entity.Driver;
import com.laboratorna.transport_system.entity.TransportCompany;
import com.laboratorna.transport_system.repository.TransportCompanyRepository;
import com.laboratorna.transport_system.service.TransportCompanyService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransportCompanyServiceImpl implements TransportCompanyService {

    private final TransportCompanyRepository transportCompanyRepository;
    private final ModelMapper mapper;

    public TransportCompanyServiceImpl(TransportCompanyRepository transportCompanyRepository) {
        this.transportCompanyRepository = transportCompanyRepository;
        mapper = new ModelMapper();
    }

    @Override
    public TransportCompanyDTO createCompany(TransportCompanyDTO dto) {
        TransportCompany transportCompany = mapper.map(dto, TransportCompany.class);
        transportCompany = transportCompanyRepository.save(transportCompany);
        return mapper.map(transportCompany, TransportCompanyDTO.class);
    }

    @Override
    public TransportCompanyDTO getCompanyById(Long id) {
        TransportCompany transportCompany = transportCompanyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transport company not found"));
        return mapper.map(transportCompany, TransportCompanyDTO.class);
    }

    @Override
    public List<TransportCompanyDTO> getAllCompany() {
        return transportCompanyRepository.findAll().stream()
                .map(transportCompany -> mapper.map(transportCompany, TransportCompanyDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteCompany(Long id) {
        transportCompanyRepository.deleteById(id);
    }
}
