# Insurance-Management-System
This is a Spring Boot application with around 15 APIs for performing all the CRUD operations.

## Design of the Application
![Insurance](https://user-images.githubusercontent.com/116934640/229424169-a74ea9fa-de38-41a3-885e-3d070bc40859.png)


# Database Schema (EER Diagram)
![Insurance-ER](https://user-images.githubusercontent.com/116934640/229427959-8dd40704-2102-4e0b-acbf-9b530f7b8a38.png)


# Description
This Insurance Management application can do the following tasks :

* CLIENTS
   - Clients can register themselves on the application.
   - Clients can delete themselves using id.
   - Clients can update their information by providing all the attributes with the help of id. (If he wants to change the value of some attributes then he will have to provide the update
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
   - Delete a claim using its id.
   - Get all claims.
   - Get a claim using its id.
   - Update a claim by claim using id. (In this api client can able to update its description.)
   - Update a claim by admin usinh id. (In this api admin can able to update its status.)

Steps to perform operations
# Clients :
## => Registration of a Client :
image![addClient](https://user-images.githubusercontent.com/116934640/229422187-159ca297-20e7-43dc-b9d1-b62d9302a08b.png)


## => Deletion of a Client with the help of id:
image![deleteAClient](https://user-images.githubusercontent.com/116934640/229422329-17a94330-0a0a-436c-bf18-8ade1ac0340c.png)


## => Updating information of a Client with the help of id:
image![updateClient](https://user-images.githubusercontent.com/116934640/229422577-78810c1a-cb42-4911-8d60-8ac1f5b418a6.png)


## => Getting the information of a Client with the help of id:
image![getAClient](https://user-images.githubusercontent.com/116934640/229422633-03c55e69-229b-472c-b7c7-125deb5b5995.png)


## => Getting the information of all client.
![AllClient](https://user-images.githubusercontent.com/116934640/229422675-b921ebba-04b7-4706-bbf8-03d7809ea733.png)


# Insurance :
## => Creatinging a insurance in the database :
image![createInsurance](https://user-images.githubusercontent.com/116934640/229422708-4db401eb-1ba1-4d42-901f-1b3e9b30fbc7.png)


## => Removing a insurance from the database with the help of id(policyNumber):
image![deleteInsurance](https://user-images.githubusercontent.com/116934640/229422732-f04a5e40-0aed-41f6-aa0c-d5ad02bb39e1.png)


## => Getting the details of a insurance with the help of id:
image![getAInsurance](https://user-images.githubusercontent.com/116934640/229422778-57f473e1-ab73-4307-a0f1-8fec656c4e41.png)


## => Getting the details of all insurances :
image![AllInsurance](https://user-images.githubusercontent.com/116934640/229422817-64dc6adf-43de-4c87-890a-dc903c76ffcf.png)


## => Updating the information of a insurance with the help of id :
image![updateInsurance](https://user-images.githubusercontent.com/116934640/229422989-2bc4fad6-cd6c-468b-a5bc-e7641fab5d46.png)


# Claims :
## => Creating a claim for a insurance by providing its policyId :
image![createClaim](https://user-images.githubusercontent.com/116934640/229423024-00a17c6e-c61e-42eb-bcc4-ffbcba333c4b.png)


## => Deleting a claim by claimId :
image![deleteClaim](https://user-images.githubusercontent.com/116934640/229423132-8d35eff3-da15-4cc2-9ad5-3527fda3c9fd.png)


## => Getting the details of a claim using claimId
image![getAClaim](https://user-images.githubusercontent.com/116934640/229423151-6ce5325f-78fe-4973-a915-a8fb4a7451dc.png)


## => Getting the details of all claims:
image![getAllClaims](https://user-images.githubusercontent.com/116934640/229423184-a73d24e6-a3f1-49ef-bb7f-cf4f37813024.png)


## => Updating the details(description) of a claim using its id: 
![updateClaim](https://user-images.githubusercontent.com/116934640/229423237-d41202a1-98af-4e37-92aa-5ea56c385f59.png)


# Tech Stack
This project uses some of the following tech stacks:

- Spring Boot
* Hibernate
+ MySQL

# How to run this application locally :
Clone the repo and open it through the application that supports maven and spring boot like IntellIJ. Before starting the server change the password on
application.properties with your mysql database password and create a database with the name of 'insurance' in mysql. 

# Conclusion :
This ONLINE-INSURANCE-MANAGEMENT-APPLCIATION provides a strong backend infrastructre to do CRUD operations and managing the database.
