package com.laboratorna.transport_system.dto;

import com.laboratorna.transport_system.entity.Driver;
import com.laboratorna.transport_system.entity.Route;
import com.laboratorna.transport_system.entity.embedded.DriverRouteId;
import lombok.Data;

@Data
public class DriverRouteDTO {
    private DriverRouteId driver_route_id;

    private Driver driver_id;

    private Route route_id;
}
