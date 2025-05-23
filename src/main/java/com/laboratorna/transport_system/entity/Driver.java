package com.laboratorna.transport_system.entity;

import com.laboratorna.transport_system.entity.enums.CategoryRights;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "driver")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long driver_id;

    @ManyToOne
    @JoinColumn(name = "transport_company_id", referencedColumnName = "transport_company_id")
    private TransportCompany transport_company_id;

    private String last_name;
    private String first_name;

    private Integer work_experience;

    @Enumerated(EnumType.STRING)
    @Column(name = "category_of_rights")
    private CategoryRights category_of_rights;
}
