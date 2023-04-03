# Insurance-Management-System
This is a Spring Boot application with around 15 APIs for performing all the CRUD operations.

## Design of the Application
![InsuranceImage](https://user-images.githubusercontent.com/116934640/229379186-0e21929b-7c31-472d-b80e-f5be87858edd.png)


# Database Schema (EER Diagram)


# Description
This Insurance Management application can do the following tasks :

* CLIENTS
   - Clients can register themselves on the application.
   - Clients can delete themselves.
   - Clients can update their information by providing all the attributes. (If he wants to change the value of some attributes then he will have to provide the update
  value of this attribute and if he does not want to update the attribut like name then provide the previous value.)
   - Get all clients.
   - Get a client by their id.
* INSURANCE(POLICY)
   - Create a new insurance in the database.
   - Delete a insurance from the database using its its id i.e. policy number.
   - Get a insurance using id from the database.
   - Get all insurances.
   - Update a insurance by using its id. (If anyone wants to change the value of some attributes then he will have to provide the update value of this attribute and if he does not want to update the attribute like type, startDate then provide the previous value.)
* CLAIMS
   - Create a new claim.
   - Delete a claim.
   - Get all claims.
   - Get a claim.
   - Update a claim by client. (In this api client can able to update its description.)
   - Update a claim by admin. (In this api admin can able to update its status.)

Steps to perform operations
# Clients :
## => Registration of a Client :
image

## => Deletion of a Client with the help of id:
image

## => Updating information of a Client with the help of id:
image

## => Getting the information of a Client with the help of id:
image image

## => Getting the information of all client. 

# Insurance :
## => Creatinging a insurance in the database :
image

## => Removing a insurance from the database with the help of id(policyNumber):
image

## => Getting the details of a insurance with the help of id:
image

## => Getting the details of all insurances :
image

## => Updating the information of a insurance with the help of id :
image

# Claims :
## => Creating a claim for a insurance by providing its id :
image

## => Deleting a claim by claimId :
image

## => Getting the details of a claim using claimId
image

## => Getting the details of all claims:
image

## => Updating the details(description) of a claim using its id: 

# Tech Stack
This project uses the following tech stack:

- Spring Boot
* Hibernate
+ MySQL

Conclusion
This ONLINE-INSURANCE-MANAGEMENT-APPLCIATION provides a strong backend infrastructre to do CRUD operations and managing the database.
