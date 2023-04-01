package com.example.InsuranceManagementPlatform.Controllers;

import com.example.InsuranceManagementPlatform.Models.Client;
import com.example.InsuranceManagementPlatform.Models.Insurance;
import com.example.InsuranceManagementPlatform.RequestDTO.ClientRequest;
import com.example.InsuranceManagementPlatform.RequestDTO.InsuranceRequest;
import com.example.InsuranceManagementPlatform.Service.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/policies")
public class InsuranceController {

    @Autowired
    InsuranceService insuranceService;

    @GetMapping
    public List<Insurance> fetchAllInsurancePolicies(){
        return insuranceService.fetchAllInsurancePolicies();
    }

    @GetMapping("/{id}")
    public Insurance fetchInsurance(@PathVariable("id")int id){
        return insuranceService.fetchInsurance(id);
    }

    @PostMapping
    public String createInsurance(@RequestBody() InsuranceRequest insuranceRequest) throws Exception {
        return insuranceService.createInsurance(insuranceRequest);
    }

    // updating policy end date;
    @PutMapping("/{id}")
    public String updateInsurance(@RequestParam int policyNumber, @RequestParam Date endDate){
        return insuranceService.updateInsurance(policyNumber,endDate);
    }

    @DeleteMapping("{/id}")
    public String deleteInsurance(@PathVariable("id")int id){
        return insuranceService.deleteInsurance(id);
    }
}
