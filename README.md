# Selenium WebDriver Project with Cucumber and Page Object Model

This project demonstrates automated testing of a web application using Selenium WebDriver, Cucumber, and the Page Object Model (POM).

## Project Structure
src.</br>
└── main.</br>
|   └── java.</br>
|   |   └── pageObjects.</br>
|   |   |    ├── BasePage.java.</br>
|   |   |   ├── HomePage.java.</br>
|   |   |   ├── RegisterPage.java.</br>
|   |   |   ├── LoginHomePage.java.</br>
|   |   |   ├── SignInPage.java.</br>
└── test.</br>
|   └── java.</br>
|   |   ├── stepDefinitions.</br>
|   |   |   ├── BaseTest.java.</br>
|   |   |   ├── RegisterSteps.java.</br>
|   |   ├── runners.</br>
|   |   |   ├── TestRunner.java.</br>
|   |   ├── utilities.</br>
|   |   |   ├── ConfigReader.java.</br>
|   └── resources.</br>
|   |   ├── features.</br>
|   |   |   ├── register.feature.</br>
|   |   ├── config.properties.</br>

## Dependencies

- Java 17.</br>
- Selenium WebDriver 4.9.0.</br>
- Cucumber 7.11.0.</br>
- WebDriverManager 5.5.0.</br>

## Setup Instructions

1. **Clone the repository**

   ```bash.
   git clone <repository-url>
   cd <project-folder>.


## Test Execution
Running the tests.</br>
Right-click on the TestRunner class and select Run As > JUnit Test in your IDE..</br>

## Features
Page Object Model (POM): Organizes web elements and actions in separate page classes.</br>
Cucumber: Uses Gherkin syntax for writing test scenarios in feature files..</br>
Assertions: Validates expected outcomes for sign up and sign in scenarios..</br>
