# CRUD-PlayersManagementSystem
This Java-based Cricket Player Management System allows users to add, view, search, and filter players based on different criteria like ID, team, and runs. It is designed using Core Java with an MVC (Model-View-Controller) architecture, making it modular and maintainable.


## Structure

│── src/com/client/
│   ├── ClientApp.java         (Main class with menu-driven UI)
│
│── src/com/controller/
│   ├── PlayerController.java  (Handles player-related actions)
│
│── src/com/service/
│   ├── PlayerService.java     (Business logic and validation)
│
│── src/com/dao/
│   ├── PlayerDAO.java         (Manages player data storage)
│
│── src/com/entity/
│   ├── Player.java            (Defines the Player entity)
│
│── README.md                  (Project description)
│── .gitignore                  (Ignored files)


## 📌 Features

1️⃣ Player Management
Add new players with ID, name, team, role, and runs.
View all players stored in the system.
Find players by ID for quick lookup.
Filter players by team to list only those belonging to a specific team.
Get players by runs to find high-scoring players.
2️⃣ MVC Architecture
Client (Main class): Provides a menu-driven console UI.
Controller Layer: Handles business logic and user interactions.
Service Layer: (Can be added) Acts as an intermediary for validation and business logic.
DAO Layer: Manages data storage and retrieval.
Entity Layer: Represents the Player model with fields like ID, name, team, role, and runs.
3️⃣ Predefined Players
The system starts with a predefined list of players to allow testing and filtering.
4️⃣ Console-Based Menu
Simple interactive console-based UI where users can enter commands to manage players.


## 🛠️ Technologies Used

🔹 Backend (Server-Side)
Core Java (OOP, Collections, Scanner)
DAO Pattern (Data Access Object)
MVC Architecture (Separation of concerns)
🔹 Tools & Environment
Eclipse / IntelliJ IDEA (IDE for coding)
Git & GitHub (Version control)
Java 8 or above (JDK)
