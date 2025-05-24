package com.laboratorna.transport_system.entity.embedded;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Embeddable
public class DriverRouteId implements Serializable {
    private Long driver_id;

    private Long route_id;

    public DriverRouteId(Long driver_id, Long route_id) {
        this.driver_id = driver_id;
        this.route_id = route_id;
    }
}
