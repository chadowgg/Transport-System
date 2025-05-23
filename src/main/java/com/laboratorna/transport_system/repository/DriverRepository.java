package com.laboratorna.transport_system.repository;

import com.laboratorna.transport_system.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Long> {
}
