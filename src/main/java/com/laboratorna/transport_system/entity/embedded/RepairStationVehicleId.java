package com.laboratorna.transport_system.entity.embedded;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class RepairStationVehicleId implements Serializable {
    private Long station_id;

    private Long vehicle_id;
}