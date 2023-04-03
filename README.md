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
   - Update a insurance 
* CLAIMS
   - Create a new claim.
   - Delete a claim.
   - Get all claims.
   - Get a claim.
   - Update a claim by client. (In this api client can able to update its description.)
   - Update a claim by admin. (In this api admin can able to update its status.)

Steps to perform operations
Users :
=> Registration of a User :
image

=> De-registration of a User :
image

=> Updating address of a user :
image

=> Getting details of all the tickets booked by a particular user till now :
image image

Movies :
=> Adding a movie in the database :
image

=> Removing a movie from the database :
image

=> Get show time with the help of theaterId and movieId:
image

=> Movie with max shows :
image

=> Movie with max collection :
image

=> List of all the movies with their total collection :
image

=> Total Collection of a Movie :
image

Tickets :
=> Booking a ticket by user :
image

=> Cancellation of a ticket by user :
image

=> If any other users tries to book the same seats which have been booked by any other user earlier :
image

=> Getting details of a ticket using ticketId
image

Show :
=> Add Show :
image

=> Remove Show :
image

Theater :
=> Adding Theater :
image

=> Removing Theater :
image

=> Theaters with unique locations :
image

Tech Stack
This project uses the following tech stack:

- Spring Boot
* Hibernate
+ MySQL
Contact
For questions, feedback, or support, please contact the project owner at pranshubarar1851996@gmail.com.

Conclusion
This ONLINE-MOVIE-TICKETING-APPLCIATION provides a strong backend infrastructre to do CRUD operations and managing the database.
