package com.example.InsuranceManagementPlatform.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientResponse {

    private String name;

    private String dateOfBirth;

    private String address;

    private String contactInformation;
}
