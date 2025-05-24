package com.laboratorna.transport_system.dto;

import com.laboratorna.transport_system.entity.ServiceStation;
import com.laboratorna.transport_system.entity.Vehicle;
import com.laboratorna.transport_system.entity.embedded.RepairStationVehicleId;
import lombok.Data;

@Data
public class RepairStationVehicleDTO {
    private RepairStationVehicleId repairStationVehicleId;

    private ServiceStation station_id;

    private Vehicle vehicle_id;
}
