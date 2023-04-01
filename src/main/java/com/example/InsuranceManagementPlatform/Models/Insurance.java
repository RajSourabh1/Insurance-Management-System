package com.example.InsuranceManagementPlatform.Models;

import com.example.InsuranceManagementPlatform.Enums.PolicyType;
import com.example.InsuranceManagementPlatform.Models.Claim;
import com.example.InsuranceManagementPlatform.Models.Client;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Table(name = "Insurance")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Insurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int policyNumber;

    private PolicyType Type;

    private int coverageAmount;

    private int premium;

    private Date startDate;

    private Date endDate;

    @ManyToMany
    @JoinColumn
    private List<Client> clients = new ArrayList<>();

    @OneToMany(mappedBy = "insurance",cascade = CascadeType.ALL)
    private List<Claim> claimList = new ArrayList<>();
}
