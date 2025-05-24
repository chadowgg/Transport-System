package com.laboratorna.transport_system.entity;

import com.laboratorna.transport_system.entity.embedded.DriverVehicleId;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "drivervehicle")
public class DriverVehicle {
    @EmbeddedId
    private DriverVehicleId driver_vehicle_Id;

    @ManyToOne
    @MapsId("driver_id")
    @JoinColumn(name = "driver_id", referencedColumnName = "driver_id")
    private Driver driver_id;

    @ManyToOne
    @MapsId("vehicle_id")
    @JoinColumn(name = "vehicle_id", referencedColumnName = "vehicle_id")
    private Vehicle vehicle_id;

}
