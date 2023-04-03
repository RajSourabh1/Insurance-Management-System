package com.example.InsuranceManagementPlatform.Service;

import com.example.InsuranceManagementPlatform.Converter.ClaimConvertor;
import com.example.InsuranceManagementPlatform.Enums.ClaimStatus;
import com.example.InsuranceManagementPlatform.Models.Claim;
import com.example.InsuranceManagementPlatform.Models.Insurance;
import com.example.InsuranceManagementPlatform.Repository.ClaimRepository;
import com.example.InsuranceManagementPlatform.Repository.InsuranceRepository;
import com.example.InsuranceManagementPlatform.ResponseDto.ClaimResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ClaimService {


    @Autowired
    ClaimRepository claimRepository;

    @Autowired
    InsuranceRepository insuranceRepository;

    public List<ClaimResponse> fetchAllClaims(){

        try{
            List<ClaimResponse> ans = new ArrayList<>();
            List<Claim> list = claimRepository.findAll();

            for(Claim claim:list){
                ClaimResponse claimResponse = ClaimConvertor.EntityToDto(claim);
                ans.add(claimResponse);
            }

            return ans;
        }catch (Exception e){
            return null;
        }
    }


    public ClaimResponse fetchClaim(int id){
        try{
            Claim claim = claimRepository.findById(id).get();
            ClaimResponse claimResponse = ClaimConvertor.EntityToDto(claim);
            return claimResponse;
        }catch (Exception e){
            return null;
        }
    }


    public String createClaim(int policyNumber, String description){

           List<Insurance> list = insuranceRepository.findAll();
           Insurance insurance = null;

           for(Insurance insurance1:list){
               if(insurance1.getPolicyNumber()==policyNumber){
                   insurance = insurance1;
                   break;
               }
           }

           if(insurance == null)
               return "You have no policy of this type to claim";
           else {
               Claim claim = new Claim();
               claim.setDescription(description);
               claim.setClaimStatus(ClaimStatus.Pending);
               claim.setClaimDate(new Date());
               claim.setInsurance(insurance);

               insurance.getClaimList().add(claim);

               insuranceRepository.save(insurance);
               return "Successfully created";
           }

    }


    public String updateClaim(int claimNumber, String description){
        try{
            Claim claim = claimRepository.findById(claimNumber).get();
            claim.setDescription(description);
            claimRepository.save(claim);
            return "Successfully updated";
        }catch (Exception e){
            return "Not updated";
        }
    }

    //
    public String updateClaimByAdmin(int claimNumber, String resolved){
        try{
            Claim claim = claimRepository.findById(claimNumber).get();
            claim.setClaimStatus(ClaimStatus.Resolved);
            claimRepository.save(claim);
            return "Successfully updated";
        }catch (Exception e){
            return "Not updated";
        }
    }

    public String deleteClaim(int id){
        try{
            claimRepository.deleteById(id);
            return "Successfully deleted";
        }catch(Exception e){
            return "Not available a claim of this id to delete";
        }
    }
}
