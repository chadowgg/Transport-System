package com.laboratorna.transport_system.service;

import com.laboratorna.transport_system.dto.TransportCompanyDTO;

import java.util.List;

public interface TransportCompanyService {
    TransportCompanyDTO createCompany(TransportCompanyDTO dto);
    TransportCompanyDTO getCompanyById(Long id);
    List<TransportCompanyDTO> getAllCompany();
    void deleteCompany(Long id);
}
