package com.laboratorna.transport_system.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "mechanics")
public class Mechanics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mechanic_id;

    @ManyToOne
    @JoinColumn(name = "station_id", referencedColumnName = "station_id")
    private ServiceStation station_id;

    private String mechanic_name;
}
