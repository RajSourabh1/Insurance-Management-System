package com.example.InsuranceManagementPlatform.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Table(name = "client")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Client {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;

   private String name;

   private String dateOfBirth;

   private String address;

   private String contactInformation;

   @ManyToMany(mappedBy = "clients", cascade = CascadeType.ALL)
   private List<Insurance> insurances = new ArrayList<>();
}
