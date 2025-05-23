package com.laboratorna.transport_system.repository;

import com.laboratorna.transport_system.entity.ServiceStation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceStationRepository extends JpaRepository<ServiceStation, Long> {
}
