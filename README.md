# Automated Login Form Testing Using Selenium

## Objective

Automate login functionality testing using Selenium WebDriver in Java.

Website:
https://the-internet.herokuapp.com/login

## Technologies Used

- Java
- Selenium WebDriver
- Maven
- TestNG
- Chrome Browser

## Test Cases

### Test Case 1: Valid Login

Username:
tomsmith

Password:
SuperSecretPassword!

Expected Result:
User successfully logs in and reaches Secure Area page.

---

### Test Case 2: Invalid Login

Username:
wrongusername

Password:
wrongpassword

Expected Result:
Error message displayed:
Your username is invalid!

---

### Test Case 3: Empty Fields

Username:
Empty

Password:
Empty

Expected Result:
Website returns invalid username message.

## How To Run

1. Open project in IntelliJ IDEA.
2. Install Maven dependencies.
3. Open LoginTest.java.
4. Run LoginTest.

All tests should pass successfully.