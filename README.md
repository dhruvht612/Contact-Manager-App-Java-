# 📇 Contact Manager App

> A Java-based contact management system that allows users to store, manage, sort, and search for personal or professional contacts using efficient algorithms and clean object-oriented design principles.

---

## 📌 Overview

The **Contact Manager App** is a command-line Java application designed for learning and showcasing skills in:

- Object-Oriented Programming (OOP)
- Sorting and Searching Algorithms
- Modular Code Architecture

This project demonstrates real-world use of inheritance, encapsulation, and data manipulation — perfect for technical portfolios, coursework, or interview prep.

---

## ✨ Features

- ✅ Add new contacts (with multiple addresses)
- 🔍 Search by full name using **Binary Search**
- 🔎 Match partial names using **Linear Search**
- 🔁 Sort contacts by:
  - Name (**Merge Sort**)
  - Phone Number
  - Number of Addresses
- ✏️ Update existing contact details
- 📋 View all contacts
- 📌 Modular design using clean **OOP principles**
- 🧱 Ready for extension (e.g., file I/O, GUI)

---

## 🧠 Algorithms & Concepts Used

| Concept                | Usage                                  |
|------------------------|----------------------------------------|
| **Merge Sort**         | Sort contacts alphabetically by name   |
| **Binary Search**      | Fast exact-name contact lookup         |
| **Comparator Sorting** | Sort by phone number / address count   |
| **Linear Search**      | Find contacts with partial name match  |
| **Inheritance**        | Contact structure extensibility        |
| **Encapsulation**      | Controlled access to contact data      |

---

## 🛠️ Technologies Used

| Technology  | Purpose                             |
|-------------|-------------------------------------|
| **Java**    | Core programming language           |
| **CLI**     | Lightweight terminal UI             |
| **OOP**     | Encapsulation, modularity, reuse    |

---

## 🚀 Getting Started

### ✅ Prerequisites
- Java JDK 8 or higher
- Terminal or IDE (e.g., IntelliJ, Eclipse, VS Code)

### ▶️ Run Instructions

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/contact-manager-app.git
   cd contact-manager-app
   ```

2. **Compile the Files**
   ```bash
   javac Contact.java ContactManager.java ContactManagerApp_FEU_2024.java
   ```

3. **Run the Application**
   ```bash
   java ContactManagerApp_FEU_2024
   ```

---

## 📂 Project Structure

```
📁 contact-manager-app
├── Contact.java                   # Contact class (data model)
├── ContactManager.java            # Core logic and algorithms
└── ContactManagerApp_FEU_2024.java # Main application (CLI)
```

---

## 🖼️ Sample CLI Output

```text
--- Contact Manager ---
1. Add Contact
2. Display Contacts
3. Search by Name (Binary Search)
4. Search by Partial Name
5. Update Contact
6. Sort by Name (Merge Sort)
7. Sort by Phone Number
8. Sort by Address Count
9. Exit
```

---

## 🔮 Future Enhancements

- 💾 File I/O for saving/loading contacts
- 🌐 Export contacts as JSON or CSV
- 🖥️ GUI version using Swing or JavaFX
- 🔁 Duplicate contact prevention
- 🔐 User authentication layer

---

## 📜 License

This project is licensed under the [MIT License](LICENSE).

---

## 🙌 Acknowledgments

This project was developed as part of a learning journey in Java, OOP, and algorithmic programming.
