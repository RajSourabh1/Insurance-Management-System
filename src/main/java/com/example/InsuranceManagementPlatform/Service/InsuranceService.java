package com.example.InsuranceManagementPlatform.Service;

import com.example.InsuranceManagementPlatform.Enums.PolicyType;
import com.example.InsuranceManagementPlatform.Models.Client;
import com.example.InsuranceManagementPlatform.Models.Insurance;
import com.example.InsuranceManagementPlatform.Repository.ClientRepository;
import com.example.InsuranceManagementPlatform.Repository.InsuranceRepository;
import com.example.InsuranceManagementPlatform.RequestDTO.InsuranceRequest;
import com.example.InsuranceManagementPlatform.RequestDTO.UpdateInsuranceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Service
public class InsuranceService {

    @Autowired
    InsuranceRepository insuranceRepository;

    @Autowired
    ClientRepository clientRepository;

    public List<Insurance> fetchAllInsurancePolicies(){
        try{
            return insuranceRepository.findAll();
        }catch (Exception e){
            return null;
        }
    }

    public Insurance fetchInsurance(int id){
        try{
            Insurance insurance = insuranceRepository.findById(id).get();
            return insurance;
        }catch (Exception e){
            return null;
        }
    }

    public String createInsurance(InsuranceRequest insuranceRequest) throws Exception {
        //System.out.println(insuranceRequest.getType());
        String type = insuranceRequest.getType();
        if(type.equalsIgnoreCase("health_insurance") || type.equalsIgnoreCase("life_insurance")
            || type.equalsIgnoreCase("home_insurance") || type.equalsIgnoreCase("vehicle_insurance")
            || type.equalsIgnoreCase("child_insurance")){

            Insurance insurance = new Insurance();

            insurance.setPremium(insurance.getPremium());
            insurance.setCoverageAmount(insurance.getCoverageAmount());
            insurance.setStartDate(new Date());

            //System.out.println();
            if(type.equalsIgnoreCase("health_insurance")){
                insurance.setType(PolicyType.Health_Insurance);
            }
            if(type.equalsIgnoreCase("life_insurance")){
                insurance.setType(PolicyType.Life_Insurance);
            }
            if(type.equalsIgnoreCase("home_insurance")){
                insurance.setType(PolicyType.Home_Insurance);
            }
            if(type.equalsIgnoreCase("vehicle_insurance")){
                insurance.setType(PolicyType.Vehicle_Insurance);
            }
            if(type.equalsIgnoreCase("child_insurance")){
                insurance.setType(PolicyType.Child_Insurance);
            }

            insurance.setEndDate(insuranceRequest.getEndDate());

            Client client = clientRepository.findById(insuranceRequest.getClientId()).get();
            insurance.getClients().add(client);

            client.getInsurances().add(insurance);
            clientRepository.save(client);
            return "successfully created";
        }else{
            throw new Exception("Policy not found");
        }
    }

    public String updateInsurance(int policyNumber, UpdateInsuranceRequest updateInsuranceRequest) throws Exception {
        try{
            Insurance insurance = insuranceRepository.findById(policyNumber).get();

            String type = updateInsuranceRequest.getType();
            if(type.equalsIgnoreCase("health_insurance") || type.equalsIgnoreCase("life_insurance")
                    || type.equalsIgnoreCase("home_insurance") || type.equalsIgnoreCase("vehicle_insurance")
                    || type.equalsIgnoreCase("child_insurance")){

                insurance.setPremium(updateInsuranceRequest.getPremium());
                insurance.setCoverageAmount(updateInsuranceRequest.getCoverageAmount());
                insurance.setStartDate(updateInsuranceRequest.getStartDate());

                //System.out.println();
                if(type.equalsIgnoreCase("health_insurance")){
                    insurance.setType(PolicyType.Health_Insurance);
                }
                if(type.equalsIgnoreCase("life_insurance")){
                    insurance.setType(PolicyType.Life_Insurance);
                }
                if(type.equalsIgnoreCase("home_insurance")){
                    insurance.setType(PolicyType.Home_Insurance);
                }
                if(type.equalsIgnoreCase("vehicle_insurance")){
                    insurance.setType(PolicyType.Vehicle_Insurance);
                }
                if(type.equalsIgnoreCase("child_insurance")){
                    insurance.setType(PolicyType.Child_Insurance);
                }

                insurance.setEndDate(updateInsuranceRequest.getEndDate());

               // Client client = clientRepository.findById(updateInsuranceRequest.getClientId()).get();
               // insurance.getClients().add(client);

               // client.getInsurances().add(insurance);
               // clientRepository.save(client);
                insuranceRepository.save(insurance);
                return "successfully updated";
            }else{
                throw new Exception("Policy not found");
            }
          }catch (Exception e) {
            throw new Exception("Insurance not found");
        }
    }

    public String deleteInsurance(int id){
        try{
            insuranceRepository.deleteById(id);
            return "Successfully deleted";
        }catch (Exception e){
            return "Not available a client of this id to delete";
        }
    }
}
