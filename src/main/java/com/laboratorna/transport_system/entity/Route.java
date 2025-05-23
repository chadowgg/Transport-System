package com.laboratorna.transport_system.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "route")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long route_id;

    @ManyToOne
    @JoinColumn(name = "transport_company_id", referencedColumnName = "transport_company_id")
    TransportCompany transport_company_id;

    private Long route_number;

    private String starting_point;

    private String end_point;

    private Long route_length_kilometers;
}
