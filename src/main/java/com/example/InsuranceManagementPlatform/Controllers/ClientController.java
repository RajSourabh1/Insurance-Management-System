package com.example.InsuranceManagementPlatform.Controllers;

import com.example.InsuranceManagementPlatform.Models.Client;
import com.example.InsuranceManagementPlatform.RequestDTO.ClientRequest;
import com.example.InsuranceManagementPlatform.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping
    public List<Client> fetchAllClients(){
        return clientService.fetchAllClients();
    }

    @GetMapping("/{id}")
    public Client fetchClient(@PathVariable("id")int id){
        return clientService.fetchClient(id);
    }

    @PostMapping
    public String createClient(@RequestBody()ClientRequest clientRequest){
       return clientService.createClient(clientRequest);
    }

    @PutMapping("/{id}")
    public String updateClient(@PathVariable("id")int id,@RequestBody() ClientRequest clientRequest){
       return clientService.updateClient(id,clientRequest);
    }

    @DeleteMapping("/{id}")
    public String deleteClient(@PathVariable("id")int id){
       return clientService.deleteClient(id);
    }
}
