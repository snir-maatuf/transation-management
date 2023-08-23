
# Transaction Management Project

  

This project represents a simple transaction management application built using Java Spring Boot. The application allows you to manage employee and address information, ensuring that the data is saved consistently in the database.

  

## Table of Contents

  

- [Overview](#overview)

- [Technologies Used](#technologies-used)

- [Getting Started](#getting-started)

- [Prerequisites](#prerequisites)

- [Installation](#installation)

- [Usage](#usage)

- [Contributing](#contributing)

  

## Overview

  

The transaction management application handles employee and address information. It provides RESTful API endpoints to add employees and their associated addresses to the database. The application ensures that the transaction is managed correctly, so either both employee and address are successfully saved, or none of the changes are persisted in the database.

  

## Technologies Used

  

- Java Spring Boot

- Spring Data JPA

- Spring Web

- PostgreSQL (Database)

- Maven (Build tool)

- Javax Persistence API (JPA)

- Lombok (for generating boilerplate code)

  

## Getting Started


### Prerequisites

  

To run this project, you need to have the following prerequisites installed on your system:

  

1. Java Development Kit (JDK) 19 or later

2. Apache Maven

3. PostgreSQL (Database server)

  

### Installation

  

1. Clone the repository:

  

	`git clone https://github.com/your-username/transaction-management.git`

  

2. Change into the project directory:

	`cd transaction-management`

3. Configure the Database:

- Create a PostgreSQL database with the name "transaction_management".

- Update the database connection properties in `src/main/resources/application.properties` with your PostgreSQL credentials.

  

4. Build the project using Maven:

	`mvn clean install`

5. Run the application:

    `mvn spring-boot:run`

  

The application will start, and you can access the RESTful API endpoints to manage employee and address data.

  

## Usage

The application provides the following RESTful API endpoints:

-  `POST /api/employee/add`: Add a new employee along with their associated address. Provide the employee details as a JSON request body.

  

Example JSON request:

    {
    "name": "John Doe",
    "address": "123 Main Street"
    }
    
Example JSON response:

    {
    "id": 1,
    "name": "John Doe",
	"address": {
		  "id": 1,
		  "address": "123 Main Street"
          }
    }  

## Contributing

Contributions to this project are welcome. If you find any issues or have suggestions for improvements, feel free to open an issue or submit a pull request.
<img src="https://t.bkit.co/w_64e60f64e5371.gif" />
