# Courier Booking System

A lightweight, Java Swing-based Desktop Application that calculates shipping costs for local, national, and international parcels using Object-Oriented Programming (OOP) principles.

---

## 🚀 Features
* **Interactive GUI:** Simple and intuitive desktop interface built with Java Swing (`JFrame`, `GridLayout`).
* **Dynamic Cost Calculation:** Automatically evaluates shipping fees based on destination type and weight.
* **OOP Implementation:** Leverages core Java OOP features including abstract classes, method overriding, and polymorphism.
* **Booking Summary:** Generates a clean, formatted receipt view in a text area upon calculation.

---

## 🛠️ Architecture & Design
The system is built on a modular, object-oriented hierarchy:

* `Parcel.java` *(Abstract Base Class)*: Defines common properties like `trackingId` and `weight`, and declares the abstract method `calculateCost()`.
* `LocalParcel.java` *(Derived Class)*: Overrides calculation logic at a rate of Rs. 40 per kg.
* `NationalParcel.java` *(Derived Class)*: Overrides calculation logic for domestic long-distance shipments.
* `InternationalParcel.java` *(Derived Class)*: Overrides calculation logic at a rate of Rs. 500 per kg.
* `GUI.java` *(Controller & View)*: Manages user inputs, handles action events, and renders the interface.

---

## 📋 Rate Matrix
| Parcel Type | Rate per Kilogram |
| :--- | :--- |
| **Local** | Rs. 40 / kg |
| **National** | *(Configured via NationalParcel)* |
| **International** | Rs. 500 / kg |

---

## 💻 Prerequisites
* **Java Development Kit (JDK):** Version 8 or higher.
* **IDE (Optional):** Eclipse, IntelliJ IDEA, NetBeans, or VS Code.

---

## 🔧 Installation & Running

### Option 1: Via Terminal / Command Prompt
1. Clone the repository:
   ```bash
   git clone [https://github.com/YOUR_USERNAME/Courier-Booking-System.git](https://github.com/YOUR_USERNAME/Courier-Booking-System.git)
   
2. Navigate into the project folder:
   cd Courier-Booking-System
   
4. Compile all Java resource files:
   javac *.java
   
6. Execute the main program:
   java GUI

---

## 📸 Usage
1. Enter a valid Tracking ID.
2. Select the target Parcel Type from the dropdown menu (Local, National, International).
3. Input the parcel's weight in kilograms (integer value).
4. Click the Calculate button to instantly generate your total shipping cost and booking summary receipt.
