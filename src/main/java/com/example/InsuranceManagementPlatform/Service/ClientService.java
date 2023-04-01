package com.example.InsuranceManagementPlatform.Service;

import com.example.InsuranceManagementPlatform.Converter.ClientConvertor;
import com.example.InsuranceManagementPlatform.Models.Client;
import com.example.InsuranceManagementPlatform.Repository.ClientRepository;
import com.example.InsuranceManagementPlatform.RequestDTO.ClientRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<Client> fetchAllClients(){
       try{
           return clientRepository.findAll();
       }catch (Exception e){
           return null;
       }
    }

    public Client fetchClient(int id){
        try{
            Client client = clientRepository.findById(id).get();
            return client;
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

    public String updateClient(Client client){
        clientRepository.save(client);
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
