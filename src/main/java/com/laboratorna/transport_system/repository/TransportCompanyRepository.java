package com.laboratorna.transport_system.repository;

import com.laboratorna.transport_system.entity.TransportCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransportCompanyRepository extends JpaRepository<TransportCompany, Long> {
}
