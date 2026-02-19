
✈️ Airline Management System
Java Swing + JDBC + MySQL Desktop Application

A desktop-based Airline Management System developed using Java Swing (GUI) and MySQL Database, integrated through JDBC connectivity.
The system simulates real-world airline booking operations including authentication, customer management, flight handling, and ticket processing.

📌 Project Overview

This project demonstrates:

GUI development using Java Swing

Backend logic implementation using Java

Database connectivity using JDBC

Execution of SQL queries (CRUD operations)

Modular multi-class project structure


🛠️ Technologies Used

☕ Java

🖥 Java Swing

🗄 MySQL

🔌 JDBC (Java Database Connectivity)

🛠 Apache NetBeans

🔄 Git & GitHub



📂 Project Structure & File Explanation
🔐 Login Module

Purpose: User authentication

Internal Working:

Accepts username and password using Swing components.

Validates credentials.

On successful validation:

Closes login window.

Opens Home dashboard.

Uses event handling for button actions.



🏠 Home Module

Purpose: Main dashboard navigation

Internal Working:

Displays menu options for all operations.

Handles navigation between modules.

Controls session flow (Login → Operations → Logout).

Uses action listeners for menu interaction.



👤 Customer Management Module

Purpose: Store and manage passenger details

Internal Working:

Collects customer information through form inputs.

Executes SQL INSERT query to store data in MySQL.

Retrieves customer data using SELECT queries.

Displays records using JTable.



✈️ Flight Information Module

Purpose: Manage flight records

Internal Working:

Fetches flight details from flight table.

Displays available flights dynamically.

Uses SQL SELECT queries.

Updates GUI components with database data.



🎟️ Booking Module

Purpose: Ticket booking system

Internal Working:

Links selected customer with selected flight.

Inserts booking data into booking table.

Generates booking records.

Performs SQL INSERT operation.



❌ Cancellation Module

Purpose: Cancel booked tickets

Internal Working:

Accepts booking ID or customer reference.

Executes SQL DELETE query.

Updates database records.

Reflects changes in GUI.



🛫 Journey Details Module

Purpose: Display booking and travel information

Internal Working:

Fetches booking records from database.

Displays journey information in table format.

Uses SQL SELECT queries.



🔌 Database Connection Module

Purpose: Centralized database handling

Internal Working:

Establishes connection using JDBC driver.

Executes SQL queries.

Handles exceptions.

Reused across all modules.


🗄️ Database Tables Used
flight

id

flight_code

source

destination

customer

customer_id

name

gender

nationality

phone

address

booking

booking_id

customer_id

flight_code

source

destination



🔄 System Workflow

User logs in

Dashboard loads

User selects operation

JDBC executes SQL query

MySQL processes data

GUI updates dynamically



🎯 Concepts Applied                                    

Object-Oriented Programming (OOP)                        

Seat availability system

Ticket pricing integration

Booking ID auto-generation

Role-based authentication




🚀 Future Enhancements

Seat availability system

Ticket pricing integration

Booking ID auto-generation

Role-based authentication

Convert to Spring Boot Web Application
