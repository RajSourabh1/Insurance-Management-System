package com.example.InsuranceManagementPlatform.Converter;

import com.example.InsuranceManagementPlatform.Models.Claim;
import com.example.InsuranceManagementPlatform.Models.Insurance;
import com.example.InsuranceManagementPlatform.ResponseDto.ClaimResponse;
import com.example.InsuranceManagementPlatform.ResponseDto.InsuranceResponse;

public class ClaimConvertor {

    public static ClaimResponse EntityToDto(Claim claim){
        ClaimResponse claimResponse = ClaimResponse.builder()
                .description(claim.getDescription())
                .claimDate(claim.getClaimDate())
                .claimStatus(String.valueOf(claim.getClaimStatus())).build();

        return claimResponse;
    }
}
