package com.laboratorna.transport_system.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "servicestation")
public class ServiceStation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long station_id;

    @ManyToOne
    @JoinColumn(name = "transport_company_id", referencedColumnName = "transport_company_id")
    private TransportCompany transport_company_id;

    private Long number_of_repair_boxes;

    private String address;
}
