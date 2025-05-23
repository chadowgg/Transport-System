package com.laboratorna.transport_system.dto;

import com.laboratorna.transport_system.entity.TransportCompany;
import lombok.Data;

@Data
public class ServiceStationDTO {
    private Long station_id;

    private TransportCompany transport_company_id;

    private Long number_of_repair_boxes;

    private String address;
}
