package com.laboratorna.transport_system.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "transportcompany")
public class TransportCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transport_company_id;

    private String name_company;

    private String address;
}
