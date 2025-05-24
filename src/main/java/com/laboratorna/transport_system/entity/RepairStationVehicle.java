package com.laboratorna.transport_system.entity;

import com.laboratorna.transport_system.entity.embedded.RepairStationVehicleId;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "repairstationvehicle")
public class RepairStationVehicle {
    @EmbeddedId
    private RepairStationVehicleId repair_station_vehicle_id;

    @ManyToOne
    @MapsId("station_id")
    @JoinColumn(name = "station_id", referencedColumnName = "station_id")
    private ServiceStation station_id;

    @ManyToOne
    @MapsId("vehicle_id")
    @JoinColumn(name = "vehicle_id", referencedColumnName = "vehicle_id")
    private Vehicle vehicle_id;
}
