package com.example.InsuranceManagementPlatform.Controllers;

import com.example.InsuranceManagementPlatform.Models.Claim;
import com.example.InsuranceManagementPlatform.Service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/claims")
public class ClaimController {

    @Autowired
    ClaimService claimService;

    @GetMapping
    public List<Claim> fetchAllClaims(){
       return claimService.fetchAllClaims();
    }

    @GetMapping("/{id}")
    public Claim fetchAClaim(@PathVariable("id")int id){
        return claimService.fetchClaim(id);
    }

    @PostMapping
    public String createClaim(@RequestParam int policyNumber, @RequestParam String description){
        return claimService.createClaim(policyNumber,description);
    }

    @PutMapping("/{id}")
    public String updateClaim(@PathVariable("id") int claimNumber, @RequestParam String description){
        return claimService.updateClaim(claimNumber,description);
    }

    @PutMapping("/admin/{id}")
    public String updateClaimByAdmin(@RequestParam int claimNumber, @RequestParam String resolved){
        return claimService.updateClaim(claimNumber,resolved);
    }

    @DeleteMapping("/{id}")
    public String deleteClaim(@PathVariable("id")int id){
        return claimService.deleteClaim(id);
    }
}
