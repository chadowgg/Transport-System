package com.laboratorna.transport_system.repository;

import com.laboratorna.transport_system.entity.DriverRoute;
import com.laboratorna.transport_system.entity.embedded.DriverRouteId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRouteRepository extends JpaRepository<DriverRoute, Long> {
}
