# Selenium Cucumber Framework Test Automation

## 📖 Overview
This project is an automated testing framework designed for a web application using Cucumber and Selenium. It implements Behavior-Driven Development (BDD) principles, allowing for clear and understandable test scenarios that reflect user behavior. The framework is structured using the Page Object Model (POM) to enhance maintainability and readability.

## 🚀 Features
- The framework includes the following key features:
- **User Authentication**: Tests for various user scenarios including successful login, locked-out users, and non-existent users.
- **Product Interaction**: Validates the ability to add products to the cart, complete purchases, and view product details.
- **Logout Functionality**: Ensures users can log out and are redirected to the login page.

## 🛠️ Technologies Used
- **Java**: The primary programming language for the test scripts.
- **Cucumber**: For writing BDD-style test scenarios.
- **Selenium WebDriver**: For browser automation.
- **JUnit**: For running the tests and assertions.
- **WebDriverManager**: For managing browser drivers automatically.

## 📂 Project Structure
The project is organized into several packages:
- **features**: Contains the Gherkin feature files that describe the test scenarios.
- **pages**: Implements the Page Object Model, encapsulating the web elements and actions for each page.
- **stepDefinition**: Contains the step definitions that link the Gherkin steps to the Java methods.
- **utility**: Includes utility classes such as BrowserDriver for managing the WebDriver instance.

## 📦 Dependencies
The project uses the following dependencies, as specified in the pom.xml file:
- **Cucumber**:
  - cucumber-java: For writing Cucumber tests.
  - cucumber-core: Core functionalities of Cucumber.
  - cucumber-junit: Integration with JUnit for running tests.
- **Selenium**:
  - selenium-java: For browser automation.
- **WebDriverManager**:
  - webdrivermanager: Automatically manages the browser drivers.

## 📋 Prerequisites
- Java Development Kit (JDK) installed on your machine.
- Maven for dependency management.
