package com.example.InsuranceManagementPlatform.RequestDTO;

import com.example.InsuranceManagementPlatform.Enums.PolicyType;
import lombok.Data;

import java.time.LocalDate;

@Data
public class InsuranceRequest {

    private String type;

    private int coverageAmount;

    private int premium;

    private LocalDate endDate;

    private LocalDate startDate;

    private int clientId;
}
