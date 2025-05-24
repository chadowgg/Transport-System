package com.laboratorna.transport_system.entity;

import com.laboratorna.transport_system.entity.embedded.DriverRouteId;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "driverroute")
public class DriverRoute {
    @EmbeddedId
    private DriverRouteId driver_route_id;

    @ManyToOne
    @MapsId("driver_id")
    @JoinColumn(name = "driver_id", referencedColumnName = "driver_id")
    private Driver driver_id;

    @ManyToOne
    @MapsId("route_id")
    @JoinColumn(name = "route_id", referencedColumnName = "route_id")
    private Route route_id;
}
