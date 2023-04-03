package com.example.InsuranceManagementPlatform.ResponseDto;

import com.example.InsuranceManagementPlatform.Enums.ClaimStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClaimResponse {

    private String description;

    private Date claimDate;

    private String claimStatus;
}
