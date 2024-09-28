# Hotel Booking System

## Description
The Hotel Booking System is a RESTful API that allows users to manage hotels, bookings, payments, and guests. It provides endpoints for creating, updating, retrieving, and deleting data related to hotel operations.

## Features
- **Hotel Management**: Add, update, view, and delete hotel information.
- **Booking Management**: Handle guest bookings and reservations.
- **Payment Processing**: Manage various payment methods and transactions.
- **Room Configuration**: Support different room types and configurations.

## Technologies Used
- **Java**: Version 17
- **Spring Boot**: Version 3.2.5
- **JPA/Hibernate**
- **Lombok**

## Dependencies Used 
The project uses the following dependencies:

### Spring Boot Starters
- **spring-boot-starter-data-jpa**: For JPA and Hibernate support.
- **spring-boot-starter-oauth2-client**: For OAuth2 client support.
- **spring-boot-starter-oauth2-resource-server**: For OAuth2 resource server support.
- **spring-boot-starter-security**: For Spring Security features.
- **spring-boot-starter-validation**: For validation support.
- **spring-boot-starter-web**: For building web applications.
- **spring-boot-starter-webflux**: For reactive web applications.

### Databases
- **com.h2database:h2**: H2 database for runtime.
- **com.mysql:mysql-connector-j**: MySQL connector for runtime.

### Lombok
- **org.projectlombok:lombok**: To reduce boilerplate code with annotations.

### Testing
- **spring-boot-starter-test**: For testing Spring Boot applications.
- **reactor-test**: For testing reactive streams.
- **spring-security-test**: For testing Spring Security.

### MapStruct
- **org.mapstruct:mapstruct**: For generating type-safe mappers.
- **org.mapstruct:mapstruct-processor**: Processor for MapStruct, provided scope.


## File Structure
- **config**: Configuration files for the application.
- **controller**: REST controllers (e.g., `BookingController`, `HotelController`).
- **dto**: Data Transfer Objects for transferring data between layers.
- **enumFiles**: Enumerations for bed types, payment methods, etc.
- **exception**: Custom exception classes and global exception handlers.
- **mapping**: Mapper interfaces for converting between DTOs and models.
- **model**: Entity classes representing database tables.

## Installation
1. Clone the repository:
   ```bash
   git clone <repository-url>
   
2. Navigate to project directory:
    ```bash
    cd hotelBooking

3. Build the project using Maven:
    ```bash
    mvn install
4. Run the application:
    ```bash
    mvn spring-boot:run


