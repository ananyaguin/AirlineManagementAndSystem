✈️ Airline Management System

A desktop-based Airline Management System developed using Java Swing (GUI) and MySQL Database with JDBC connectivity, built in Apache NetBeans IDE.

This project demonstrates database integration, GUI development, and CRUD operations in Java.

📌 Project Overview

The Airline Management System allows users to:

Login securely

Manage customer details

View available flights

Book flight tickets

Cancel bookings

Store and retrieve data from MySQL database

The system uses JDBC (Java Database Connectivity) to connect Java application with MySQL database.

🛠️ Technologies Used

☕ Java

🖥️ Java Swing (GUI)

🗄️ MySQL

🔌 JDBC (Java Database Connectivity)

🧠 OOP Concepts

🛠️ Apache NetBeans IDE

🔄 Git & GitHub

🧩 Key Features

🔐 Login Authentication

👤 Add Customer Details

📋 View Customer Information

✈️ Flight Information Management

🎟️ Ticket Booking System

❌ Ticket Cancellation

🚪 Logout Functionality

🗄️ Database Integration using JDBC

🗄️ Database Configuration
Step 1: Create Database
CREATE DATABASE airline;
USE airline;
Step 2: Create Flight Table
CREATE TABLE flight (
    id VARCHAR(10),
    flight_code VARCHAR(20),
    source VARCHAR(50),
    destination VARCHAR(50)
);
Step 3: Insert Sample Data
INSERT INTO flight VALUES
("1001", "AI-101", "Delhi", "Mumbai"),
("1002", "AI-202", "Mumbai", "Bangalore"),
("1003", "AI-303", "Delhi", "Kolkata");
🔌 JDBC Connectivity (Example)
Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/airline",
    "root",
    "your_password"
);

JDBC is used to:

Execute SQL queries

Insert data into tables

Fetch data from database

Perform update and delete operations

🚀 How To Run

Open the project in Apache NetBeans

Configure MySQL username and password in connection file

Run Login.java

After successful login → Home page will open

Use menu options to manage flights and bookings

🎯 Learning Outcomes

Through this project, I practiced:

Java Swing GUI design

JDBC database connectivity

CRUD operations

Event handling

SQL integration

Project structuring in NetBeans

Version control using Git

🔮 Future Enhancements

Add seat availability system

Add ticket price column

Add admin and user roles

Convert into Spring Boot Web Application

Integrate real-time flight API

👩‍💻 Developer

Ananya Guin
B.Tech Student | Aspiring Java Backend Developer

