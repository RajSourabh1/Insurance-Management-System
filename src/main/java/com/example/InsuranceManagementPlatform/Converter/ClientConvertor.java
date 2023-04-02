package com.example.InsuranceManagementPlatform.Converter;

import com.example.InsuranceManagementPlatform.Models.Client;
import com.example.InsuranceManagementPlatform.RequestDTO.ClientRequest;

public class ClientConvertor {

    public static Client DtoToEntity(ClientRequest clientRequest){
        Client client = Client.builder()
                .name(clientRequest.getName())
                .address(clientRequest.getAddress())
                .dateOfBirth(clientRequest.getDateOfBirth())
                .contactInformation(clientRequest.getContactInformation()).build();

        return client;
    }
    public static Client DtoToEntity(Client client,ClientRequest clientRequest){

        client.setName(clientRequest.getName());
        client.setAddress(clientRequest.getAddress());
        client.setDateOfBirth(clientRequest.getDateOfBirth());
        client.setContactInformation(clientRequest.getContactInformation());

        return client;
    }
}
