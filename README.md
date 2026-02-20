# ✈️ AIRLINE MANAGEMENT SYSTEM  

### 🚀 Core Java • Java Swing • MySQL • JDBC  

---

## 📌 Project Overview  

The **Airline Management System** is a desktop-based application developed using **Core Java** and **Java Swing GUI**, integrated with **MySQL** through **JDBC connectivity**.

This project simulates a real-world airline booking workflow including:

- Secure Login  
- Customer Registration  
- Ticket Booking  
- PNR Generation  
- Journey Details  
- Ticket Cancellation  

> This application is built purely using core concepts — no frontend frameworks, no external libraries — just strong fundamentals.

---

## 🛠️ Technology Stack  

<p align="left">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>
  <img src="https://img.shields.io/badge/Java_Swing-GUI-blue?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white"/>
  <img src="https://img.shields.io/badge/JDBC-Database_Connectivity-green?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/NetBeans-IDE-purple?style=for-the-badge"/>
</p>

---

## 🔐 Application Workflow  

### 1️⃣ Login System
- User enters credentials  
- Validates access  
- Redirects to Home Dashboard  

---

### 2️⃣ Add Customer Module  
- Collects customer details  
- Stores Aadhar number and personal data  
- Executes SQL `INSERT` operation  
- Data is updated directly in MySQL database  

---

### 3️⃣ Ticket Booking Module  
- User enters Aadhar number  
- System fetches customer details automatically from database  
- User selects flight information  
- After confirmation:
  - Ticket is generated  
  - PNR number is created  
  - Booking details stored in MySQL  

---

### 4️⃣ Journey Details Module  
- Displays booking information  
- Retrieves data using PNR  
- Shows passenger & flight details dynamically  

---

### 5️⃣ Cancel Ticket Module  
- User enters PNR number  
- System fetches booking details  
- Deletes booking record from database  
- Updates system in real-time  

---

## 🗄️ Database Integration  

The system uses **JDBC (Java Database Connectivity)** to:

- Establish connection with MySQL  
- Execute SQL queries (`INSERT`, `SELECT`, `DELETE`)  
- Fetch and display records dynamically  
- Maintain data consistency  

Example Connection:

```java
Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/airline",
    "root",
    "your_password"
);


---
