package com.example.InsuranceManagementPlatform.Service;

import com.example.InsuranceManagementPlatform.Converter.ClientConvertor;
import com.example.InsuranceManagementPlatform.Models.Client;
import com.example.InsuranceManagementPlatform.Repository.ClientRepository;
import com.example.InsuranceManagementPlatform.RequestDTO.ClientRequest;
import com.example.InsuranceManagementPlatform.ResponseDto.ClientResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<ClientResponse> fetchAllClients(){
       try{
           List<Client> list = clientRepository.findAll();
           List<ClientResponse> ans = new ArrayList<>();

           for(Client client:list){
               ClientResponse clientResponse = ClientConvertor.EntityToDto(client);
               ans.add(clientResponse);
           }

           return ans;
       }catch (Exception e){
           return null;
       }
    }

    public ClientResponse fetchClient(int id){

        try{
            Client client = clientRepository.findById(id).get();
            ClientResponse clientResponse = ClientConvertor.EntityToDto(client);
            return clientResponse;
        }catch (Exception e){
            return null;
        }
    }

    public String createClient(ClientRequest clientRequest){
        try{
            Client client = ClientConvertor.DtoToEntity(clientRequest);
            clientRepository.save(client);
            return "Successfully created";
        }catch (Exception e){
            return "Not created";
        }
    }

    public String updateClient(int id,ClientRequest clientRequest){
        Client client = clientRepository.findById(id).get();
        Client client1 = ClientConvertor.DtoToEntity(client,clientRequest);
        clientRepository.save(client1);
        return "successfully updated";
    }

    public String deleteClient(int id){
        try{
            clientRepository.deleteById(id);
            return "Successfully deleted";
        }catch (Exception e){
            return "Not available a client of this id to delete";
        }
    }

}
