package com.example.InsuranceManagementPlatform.Repository;

import com.example.InsuranceManagementPlatform.Models.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository extends JpaRepository<Claim,Integer> {
}
