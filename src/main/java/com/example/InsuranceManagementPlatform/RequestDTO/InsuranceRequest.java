package com.example.InsuranceManagementPlatform.RequestDTO;

import com.example.InsuranceManagementPlatform.Enums.PolicyType;
import lombok.Data;

import java.util.Date;

@Data
public class InsuranceRequest {

    private String Type;

    private int coverageAmount;

    private int premium;

    private Date endDate;

    private int clientId;
}
