package com.laboratorna.transport_system.repository;

import com.laboratorna.transport_system.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
