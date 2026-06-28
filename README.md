# Continuous Integration and Delivery with Jenkins for Automated Selenium Tests

## Project Overview

This project demonstrates the implementation of Continuous Integration (CI) using Jenkins to automatically build and execute Selenium WebDriver TestNG test cases after every code commit.

The project uses GitHub as the version control system, Maven as the build tool, Selenium WebDriver for browser automation, and TestNG for test execution.

---

## Tools & Technologies

- Java 23
- Selenium WebDriver
- TestNG
- Maven
- Jenkins
- Git
- GitHub
- Chrome Browser
- WebDriverManager

---

## Project Structure

```
SeleniumLoginAutomation
│
├── Jenkinsfile
├── pom.xml
├── README.md
├── testng.xml
│
├── src
│   ├── main
│   └── test
│       └── java
│           └── LoginTest.java
│
└── target
```

---

## Test Scenarios

The following Selenium test cases are automated:

- Valid Login
- Invalid Login
- Empty Username and Password

---

## Jenkins Pipeline Stages

1. Clone Source Code from GitHub
2. Build Project using Maven
3. Execute Selenium Test Cases
4. Publish Test Results

---

## How to Run

### Clone Repository

```
git clone https://github.com/vinay-perumalla/Selenium-Jenkins-Project.git
```

### Navigate to Project

```
cd Selenium-Jenkins-Project
```

### Run Tests

```
mvn clean test
```

---

## Jenkins Setup

1. Install Jenkins
2. Configure Maven
3. Configure Git
4. Create Pipeline Job
5. Select "Pipeline from SCM"
6. Connect GitHub Repository
7. Run Build

---

## Test Results

```
Tests Run : 3
Failures : 0
Errors : 0
Skipped : 0

BUILD SUCCESS
```

---

## Author

VINAY PERUMALLA
