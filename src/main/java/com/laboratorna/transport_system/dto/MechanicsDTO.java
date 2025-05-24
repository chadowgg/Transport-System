package com.laboratorna.transport_system.dto;

import com.laboratorna.transport_system.entity.ServiceStation;
import lombok.Data;

@Data
public class MechanicsDTO {
    private Long mechanic_id;

    private ServiceStation station_id;

    private String mechanic_name;
}
