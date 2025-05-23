package com.laboratorna.transport_system.dto;

import com.laboratorna.transport_system.entity.TransportCompany;
import lombok.Data;

@Data
public class RouteDTO {
    private Long route_id;

    TransportCompany transport_company_id;

    private Long route_number;

    private String starting_point;

    private String end_point;

    private Long route_length_kilometers;
}
