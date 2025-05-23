package com.laboratorna.transport_system.dto;

import com.laboratorna.transport_system.entity.TransportCompany;
import com.laboratorna.transport_system.entity.enums.CategoryRights;
import lombok.Data;

@Data
public class DriverDTO {
    private Long driver_id;
    private TransportCompany transport_company_id;
    private String last_name;
    private String first_name;

    private Integer work_experience;

    private CategoryRights category_of_rights;
}
