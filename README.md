# 📱 Matrimonial Android Application  
### Semester 6 – Mobile Application Development (Kotlin + SQLite)

This project was developed as a **Semester 6 Case Study** for the subject **CA610: Mobile Application Development**.  
It is a simple matrimonial application built using **Kotlin**, **Android Studio**, and **SQLite database**.  
The app demonstrates core Android concepts such as Activity Navigation, Intent passing, UI design, and local database storage.

> Since the original Android Studio project is not available, this repository contains all frontend screenshots, complete Kotlin code for every screen, and the case-study document for academic reference.

---

## 📘 Project Overview

The application consists of:

### ✔ **1. Sign Up Page**
- User enters:
  - ID  
  - Password  
  - Full Name  
  - Address  
  - Date of Birth  
  - Gender (RadioButton)
- Data stored into local SQLite DB
- Validation for empty fields
- On success → Navigates to Login page

### ✔ **2. Login Page**
- Authenticates user using SQLite DB
- Shows success or error message
- On successful login → navigates to Home Screen

### ✔ **3. Home Screen**
Displays 4 user profiles:
- Nisarg  
- Sahil  
- Yash  
- Darshan  

Each profile opens its own Profile Screen.

### ✔ **4. Profile Screens**
Each profile page contains:
- Photo  
- Description  
- “Back” button  
- “Connect” button (shows Toast message “You are now Connected”)

### ✔ **5. SQLite Database**
Database table: `customer`  
Fields:
- `cid` – Auto increment primary key  
- `cname` – Username  
- `cpass` – Password  

CRUD operations:
- Insert (Signup)
- Validate user (Login)

---

## 🛠️ Technologies Used

- **Kotlin**
- **Android Studio**
- **XML Layouts**
- **SQLite Database**
- **Toast Messages**
- **Intent-based Navigation**

---

## 📂 Repository Structure

```
matrimonial-android-app/
│
├── docs/
│   ├── Android_Case_Study.docx
│   ├── signup_screen.png
│   ├── login_screen.png
│   ├── home_screen.png
│   ├── profile_sahil.png
│   ├── profile_yash.png
│   ├── profile_darshan.png
│   └── profile_nisarg.png
│
└── code/
│   ├── SignUp.kt
│   ├── MainActivity.kt
│   ├── HomeScreen.kt
│   ├── Psahil.kt
│   ├── Pnisarg.kt
│   ├── Pyash.kt
│   ├── Pdarshan.kt
│   └── MyDBHelper.kt
│── README.md
```

---

## ▶️ How to Run the Project (If full project is recreated)

1. Create a new Android Studio project  
2. Add Activities matching the filenames  
3. Copy each `.kt` file into the correct Activity  
4. Create XML layouts following the screenshots  
5. Add the SQLite helper class  
6. Run on Android Emulator or physical device

---

## 🧪 Sample Output (Screens)

- **Signup Screen**  
- **Login Screen**  
- **Home Screen**  
- **Profile Screens (4)**  

Screenshots are available in the `/docs` folder.

---

## 🎓 Academic Context

- **Course:** CA610 – Mobile Application Development  
- **Semester:** 6  
- **Project Type:** Android Case Study  
- **Skills Demonstrated:**  
  - Activity Lifecycle  
  - Intents  
  - XML UI Design  
  - SQLite Local Storage  
  - Kotlin Programming  

This project shows my introduction to mobile app development using Kotlin.

---

## 📄 License

This project is for academic reference and learning purposes.
