# Selenium Automation Framework – SauceDemo

This project is a Selenium WebDriver automation framework built using Java, JUnit 5, and Page Object Model (POM).  
The framework automates the end-to-end purchase flow on the SauceDemo website.

---

## 🚀 Tech Stack

- Java
- Selenium WebDriver
- JUnit 5
- Maven
- Page Object Model (POM)
- ChromeDriver

---

 📂 Project Structure
src
└── test
└── java
└── com.api.seliniium
├── LoginTest.java
├── LoginPage.java
├── Inventory.java
├── CheckOutPage.java
└── Finishh.java
pom.xml



---

## ✅ Test Scenario Automated

The automation performs the following steps:

1. Launch Chrome browser
2. Open https://www.saucedemo.com/
3. Login using:
   - Username: `standard_user`
   - Password: `secret_sauce`
4. Add product to cart
5. Open cart
6. Proceed to checkout
7. Enter checkout details
8. Complete order

---

## ▶️ How to Run the Test

### Option 1: Using Eclipse
- Right-click `LoginTest.java`
- Run As → JUnit Test

### Option 2: Using Maven

```bash
mvn clean test
📌 Framework Design Pattern

This framework follows the Page Object Model (POM) design pattern.

Each page of the application has a separate class containing:

WebElements

Page methods

Business logic

This improves:

Code reusability

Maintainability

Readability
Key Features

Clean separation of test logic and page logic

Reusable page classes

Scalable structure for adding more test cases

Maven dependency management

📎 Author

Kartik

