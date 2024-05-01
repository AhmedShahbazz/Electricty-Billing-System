# Electricity Billing System

This repository contains the Electricity Billing System, a Java-based application designed to manage and calculate electricity bills efficiently. It's targeted at utility companies and facilitates both employee and customer interactions with the billing system.

## Features

- **Customer Management:** Add, update, and remove customer details.
- **Bill Calculation:** Automatic calculation of electricity bills based on predefined tariffs and customer usage.
- **Billing History:** Track and retrieve past bills and payment records.
- **User Authentication:** Manage access with a secure login system for administrators and billing staff.

## Getting Started

These instructions will guide you on how to set up and run the project on your local machine for development and testing purposes.

### Prerequisites

Ensure you have the following software installed:

- Java JDK 11 or newer
- MySQL Server 5.7 or newer
- An IDE that supports Java (e.g., Eclipse, IntelliJ IDEA)

### Installation

Follow these steps to get your development environment running:

# Project Setup Instructions

## Import the Project into Your Java IDE

### For Eclipse
1. Go to **File** > **Import**.
2. Select **Existing Projects into Workspace**.

### For IntelliJ IDEA
1. Go to **File** > **Open**.
2. Choose **Project**.

## Set Up the Database

1. Execute the `database_schema.sql` file in your MySQL environment to set up the necessary tables.
2. Adjust the database configuration in `src/database/DatabaseConnection.java` to match your MySQL settings.

## Run the Application

- Navigate to `src/main/java/MainApplication.java` and run it to start the application.

# Usage

- **Log in** with the administrator or staff credentials.
- **Manage Customers**: Access the customer management module to add, update, or delete customer information.
- **Calculate Bills**: Use the billing module to enter electricity usage and generate invoices.
- **View History**: Access past billing records and payments.

# Contributing

We welcome contributions. Please read `CONTRIBUTING.md` for details on our code of conduct and the process for submitting pull requests to us.


# License

This project is licensed under the MIT License - see the `LICENSE.md` file for details.

## Contact

Ahmed Shahbaz - aahmedch420567@gmail.com
