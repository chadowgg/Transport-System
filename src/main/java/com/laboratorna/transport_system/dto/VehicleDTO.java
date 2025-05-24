package com.laboratorna.transport_system.dto;

import com.laboratorna.transport_system.entity.TransportCompany;
import com.laboratorna.transport_system.entity.enums.TypeTransport;
import lombok.Data;

@Data
public class VehicleDTO {
    private Long vehicle_id;

    private TransportCompany transport_company_id;

    private String license_plate;

    private String brand;

    private String model;

    private Long year_graduation;

    private Long run;

    private TypeTransport type_transport;
}
