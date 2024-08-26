# Automated E-Commerce Website Testing With Selenium and Maven

This project aims to automate the testing of e-commerce websites using Selenium and Maven. Selenium is a powerful tool for automating web browsers, and Maven is a build automation tool primarily used for Java projects.

## Website Testing Link
~~~
hƩp://tutorialsninja.com/demo/ 
~~~

## Dependencies
The project has the following dependencies:
~~~
<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.12.1</version>
    </dependency>
    <dependency>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.11.0</version>
    </dependency>
</dependencies>
~~~

These dependencies are managed using Maven's project object model (POM) file, where you can specify the required libraries for your project.

## Description
This project demonstrates automated testing of an e-commerce website using Selenium WebDriver. It performs the following tasks:

1. Logs in to the website.
2. Adds items to the shopping cart.
3. Verifies the correctness of product names and total amount in the shopping cart.
4. Proceeds to checkout.

## Usage
To use this project, follow these steps:

1. Clone or download the project repository.
2. Set up your preferred IDE (Integrated Development Environment) with Maven support.
3. Ensure you have the necessary drivers (e.g., ChromeDriver) for Selenium WebDriver.
4. Open the project in your IDE and configure the Selenium WebDriver to point to the correct driver executable.
5. Write your automated tests using Selenium WebDriver APIs.
6. Run the Maven build process to compile and execute the tests.

## Testing
The project provides a framework for testing various aspects of an e-commerce website, such as:

- User authentication
- Product browsing
- Adding items to the cart
- Checkout process
- Payment processing
