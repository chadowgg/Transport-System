package com.laboratorna.transport_system.entity;

import com.fasterxml.jackson.databind.annotation.EnumNaming;
import com.laboratorna.transport_system.entity.enums.TypeTransport;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicle_id;

    @ManyToOne
    @JoinColumn(name = "transport_company_id", referencedColumnName = "transport_company_id")
    private TransportCompany transport_company_id;

    private String license_plate;

    private String brand;

    private String model;

    private Long year_graduation;

    private Long run;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_transport")
    private TypeTransport type_transport;
}
