package com.example.InsuranceManagementPlatform.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InsuranceResponse {

    private String type;

    private int coverageAmount;

    private int premium;

    private LocalDate endDate;

    private LocalDate startDate;
}
