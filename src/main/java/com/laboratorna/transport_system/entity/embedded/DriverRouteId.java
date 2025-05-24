package com.laboratorna.transport_system.entity.embedded;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class DriverRouteId implements Serializable {
    private Long driver_id;

    private Long route_id;
}