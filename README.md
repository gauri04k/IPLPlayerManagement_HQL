<div align="center">

# 🏏 IPL PLAYER MANAGEMENT SYSTEM
### Using Hibernate ORM & HQL

<img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java"/>
<img src="https://img.shields.io/badge/Hibernate-5.6.15.Final-green?style=for-the-badge&logo=hibernate"/>
<img src="https://img.shields.io/badge/MySQL-8-blue?style=for-the-badge&logo=mysql"/>
<img src="https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven"/>

### 🎓 Advanced Java Assignment
### 📚 Hibernate HQL CRUD Operations Project

</div>

---

## 📖 Project Overview

The **IPL Player Management System** is a Java-based Hibernate ORM application that performs CRUD operations on IPL player records stored in a MySQL database using **Hibernate Query Language (HQL)**.

This project demonstrates:

✔ Hibernate ORM Framework  
✔ Entity Mapping using Annotations  
✔ HQL Query Execution  
✔ MySQL Database Connectivity  
✔ Maven Project Structure  
✔ Session & Transaction Management

---

# 🛠 Technology Stack

| Technology | Purpose |
|------------|----------|
| ☕ Java 17 | Programming Language |
| 🔥 Hibernate ORM | Object Relational Mapping |
| 🗄 MySQL | Database |
| 📦 Maven | Dependency Management |
| 💻 Eclipse IDE | Development Environment |
| 📝 HQL | Database Query Language |

---

# 📂 Project Structure

```text
IPLPlayerManagement_HQL
│
├── src/main/java
│   │
│   ├── com.ipl.entity
│   │      └── Player.java
│   │
│   └── com.ipl.client
│          ├── FetchAllPlayers.java
│          ├── FetchSinglePlayer.java
│          ├── UpdatePlayerHQL.java
│          └── DeletePlayerHQL.java
│
├── src/main/resources
│      └── hibernate.cfg.xml
│
└── pom.xml
```

---

# 🎯 Implemented Operations

## 📋 Fetch All Players

```java
String hql = "from Player";
```

Retrieves all player records from the database.

---

## 🔍 Fetch Single Player

```java
String hql =
"from Player where playerId=:id";
```

Retrieves a specific player using Player ID.

---

## ✏️ Update Player Details

```java
String hql =
"update Player set runs=:runs where playerId=:id";
```

Updates player information using HQL.

---

## ❌ Delete Player

```java
String hql =
"delete from Player where playerId=:id";
```

Deletes a player record from the database.

---

# 🗄 Database Schema

## Database

```sql
CREATE DATABASE ipl_management;
```

## Table

```sql
CREATE TABLE player(
    player_id INT PRIMARY KEY AUTO_INCREMENT,
    player_name VARCHAR(100),
    team_name VARCHAR(100),
    role VARCHAR(50),
    runs INT,
    wickets INT,
    price DOUBLE
);
```

---

# 📊 Sample Records

| ID | Player Name | Team | Role |
|----|-------------|------|------|
| 1 | MS Dhoni | CSK | Wicket Keeper |
| 2 | Virat Kohli | RCB | Batsman |
| 3 | Rohit Sharma | MI | Batsman |
| 4 | Jasprit Bumrah | MI | Bowler |
| 5 | Ravindra Jadeja | CSK | All Rounder |

---

# ⚙️ Hibernate Configuration

```xml
<mapping class="com.ipl.entity.Player"/>
```

```xml
<property name="hibernate.dialect">
org.hibernate.dialect.MySQL8Dialect
</property>
```

---

# 🚀 How To Run

### 1️⃣ Clone Repository

```bash
git clone https://github.com/gauri04k/IPLPlayerManagement_HQL.git
```

### 2️⃣ Import Project

Import as **Existing Maven Project** in Eclipse.

### 3️⃣ Configure Database

Update MySQL username and password in:

```xml
hibernate.cfg.xml
```

### 4️⃣ Run Classes

Run any file from:

```text
com.ipl.client
```

---

# 🧠 Concepts Learned

✅ Hibernate Architecture

✅ SessionFactory

✅ Session Object

✅ Transaction Management

✅ Entity Mapping

✅ HQL Queries

✅ Maven Dependency Management

✅ MySQL Integration

✅ CRUD Operations

---

# 📸 Project Output

### Fetch All Players

```text
Player [playerId=1, playerName=MS Dhoni ...]
Player [playerId=2, playerName=Virat Kohli ...]
Player [playerId=3, playerName=Rohit Sharma ...]
```

### Delete Operation

```text
Rows Deleted : 1
```

### Update Operation

```text
Rows Updated : 1
```

---

# 🌟 Key Highlights

🏆 Hibernate ORM Implementation

🏆 Annotation-Based Mapping

🏆 HQL CRUD Operations

🏆 Maven Build Automation

🏆 MySQL Database Connectivity

🏆 Industry Standard Project Structure

---

<div align="center">

# 👩‍💻 Author

### Gauri Kapadnis
### B.Tech Computer Science Engineering

📚 Advanced Java (Hibernate ORM)

⭐ Academic Project Submission 2026

---

### ✨ Task Completed Successfully ✨

</div>
