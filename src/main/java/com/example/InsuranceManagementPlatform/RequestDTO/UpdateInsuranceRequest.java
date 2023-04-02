package com.example.InsuranceManagementPlatform.RequestDTO;

import lombok.Data;

import java.util.Date;

@Data
public class UpdateInsuranceRequest {

    private String Type;

    private int coverageAmount;

    private int premium;

    private Date startDate;

    private Date endDate;

    private int clientId;
}
