package com.example.InsuranceManagementPlatform.RequestDTO;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UpdateInsuranceRequest {

    private String Type;

    private int coverageAmount;

    private int premium;

    private LocalDate startDate;

    private LocalDate endDate;
}
