package com.example.InsuranceManagementPlatform.RequestDTO;

import lombok.Data;

@Data
public class ClientRequest {

    private String name;

    private String dateOfBirth;

    private String address;

    private String contactInformation;
}
