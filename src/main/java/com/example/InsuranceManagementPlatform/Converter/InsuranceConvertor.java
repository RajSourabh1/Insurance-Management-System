package com.example.InsuranceManagementPlatform.Converter;

import com.example.InsuranceManagementPlatform.Models.Client;
import com.example.InsuranceManagementPlatform.Models.Insurance;
import com.example.InsuranceManagementPlatform.ResponseDto.ClientResponse;
import com.example.InsuranceManagementPlatform.ResponseDto.InsuranceResponse;

public class InsuranceConvertor {

    public static InsuranceResponse EntityToDto(Insurance insurance){
        InsuranceResponse insuranceResponse = InsuranceResponse.builder()
                .type(String.valueOf(insurance.getType()))
                .coverageAmount(insurance.getCoverageAmount())
                .premium(insurance.getPremium())
                .startDate(insurance.getStartDate())
                .endDate(insurance.getEndDate()).build();

        return insuranceResponse;
    }
}
