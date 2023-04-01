package com.example.InsuranceManagementPlatform.Repository;

import com.example.InsuranceManagementPlatform.Models.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance,Integer> {
}
