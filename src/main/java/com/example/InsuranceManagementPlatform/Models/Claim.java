package com.example.InsuranceManagementPlatform.Models;

import com.example.InsuranceManagementPlatform.Enums.ClaimStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table(name = "claims")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int claimNumber;

    private String description;

    private Date claimDate;

    @Enumerated(value = EnumType.STRING)
    private ClaimStatus claimStatus;

    @ManyToOne
    @JoinColumn
    private Insurance insurance;
}
