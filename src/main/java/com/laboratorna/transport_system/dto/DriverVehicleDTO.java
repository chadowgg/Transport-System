package com.laboratorna.transport_system.dto;

import com.laboratorna.transport_system.entity.Driver;
import com.laboratorna.transport_system.entity.Vehicle;
import com.laboratorna.transport_system.entity.embedded.DriverVehicleId;

import lombok.Data;

@Data
public class DriverVehicleDTO {
    private DriverVehicleId driver_vehicle_Id;

    private Driver driver_id;

    private Vehicle vehicle_id;
}
