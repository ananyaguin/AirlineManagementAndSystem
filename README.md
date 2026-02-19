✈️ Airline Management System


🚀 Java Swing • JDBC • MySQL • NetBeans

A complete desktop-based airline booking and management system built with Java Swing and MySQL. This project simulates real-world airline operations including customer handling, flight management, and ticket booking — all in one clean, fast, and responsive application.

⭐ Overview

This Airline Management System allows users to add customers, manage flights, book tickets, cancel tickets, and store all data in MySQL.
The backend logic is implemented using JDBC, while the interface is built using Java Swing.
When a user interacts with the system, the backend processes their inputs, communicates with the MySQL database, retrieves or stores data, and updates the UI instantly based on user actions.

The project showcases real-world design practices for desktop applications, including OOP structure, event-driven programming, and CRUD database operations.

🔥 What Makes This Project Unique?

🧱 Built From Scratch

Fully hand-coded Java Swing forms
Clean database layer using JDBC
No frameworks — pure Java logic

🛫 Airline Operations Simulation

Add customers, flights, booking records
Real-time data updates
View and search flights by cities

🧹 Smart Data Processing

Well-structured SQL tables
Performs validation and error handling
Clean DB connection layer (Conn.java)

🖥 Full Desktop User Experience

Smooth navigation between pages
Professional UI design
Buttons, tables, dropdowns, flight forms

🎯 Key Features

🔐 Login System

Secure login validation
Redirects user to the Home screen

👤 Customer Management

Add new customer
View all customers
Auto-stored in MySQL
✈️ Flight Module
Add new flight records
Search flights by source and destination
Display complete flight list

🎟 Ticket Booking

Book new tickets
Display ticket summary
Save booking data in MySQL
❌ Ticket Cancellation
Cancel existing bookings
Update database automatically

🗄 Database Integration

Real JDBC connection:
Java
Copy code
Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/airline",
    "root",
    "your_password"
);

🧰 Tech Stack

Category
                       Tools
Frontend / UI
                    Java Swing
Backend Logic
Core Java, OOP
Database
MySQL
Connectivity
JDBC
IDE
Apache NetBeans
Version Control
Git & GitHub
📁 Project Structure
Copy code

AirlineManagementSystem/
│
├── src/
│   ├── Login.java
│   ├── Home.java
│   ├── AddCustomer.java
│   ├── FlightInfo.java
│   ├── BookFlight.java
│   ├── CancelBooking.java
│   └── Conn.java   (MySQL Connection File)
│
├── nbproject/
├── build/
└── README.md

🧠 Concepts Applied

Object-Oriented Programming (OOP)
Event Handling
Java Swing UI/UX
JDBC Connectivity
SQL CRUD Operations
Error Handling
Multi-class application design

🚀 Future Enhancements

Seat availability tracking
Auto-generated ticket prices
Customer flight history
PDF ticket generation
Convert backend into Spring Boot
Deploy as a full web-based airline portal







