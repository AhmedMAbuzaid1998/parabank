# DEPI-Graduation-Project
![DEPI](./DEPILogo.png)

## Software Testing SHR1_SWD7_M1e  

## Automated Testing Framework for ParaBank Web Application & APIs

### Overview
This project focuses on developing an Automated Testing Framework using Selenium and Cucumber for end-to-end testing of a web application. The framework is designed to cover UI, functionality, and API testing, with the goal of ensuring the reliability and performance of the web application. Additionally, the project involves report generation and bug tracking using tools like JUnit, Postman, and Jira.
This project is a test automation of the [ParaBank](https://parabank.parasoft.com/parabank/index.htm), a demo site that simulates a realistic
online banking website, and it uses Selenium Webdriver and Java technologies.

### Team Members:
- Khaled Ayoub
- Ahmed Abozaid
- Osama Hassan
- Mahmoud metwally
- Sherif Alaa

###  Features Covered
This project includes automated testing for the following features of ParaBank:

- [Sign Up](https://github.com/AhmedMAbuzaid1998/parabank/blob/main/src/main/resources/Features/01_SignUp.feature)
- [Sign In](https://github.com/AhmedMAbuzaid1998/parabank/blob/main/src/main/resources/Features/02_SignIn.feature)
- [Bill Pay](https://github.com/AhmedMAbuzaid1998/parabank/blob/main/src/main/resources/Features/03_BillPay.feature)
- [Open New Account](https://github.com/AhmedMAbuzaid1998/parabank/blob/main/src/main/resources/Features/04_OpenNewAccount.feature)
- [Transfer Funds](https://github.com/AhmedMAbuzaid1998/parabank/blob/main/src/main/resources/Features/05_TransferFunds.feature)
- [Request Loan](https://github.com/AhmedMAbuzaid1998/parabank/blob/main/src/main/resources/Features/06_RequestLoan.feature)
- [Update Contact Information](https://github.com/AhmedMAbuzaid1998/parabank/blob/main/src/main/resources/Features/07_UpdateContactInfo.feature)
- [Find Transactions](https://github.com/AhmedMAbuzaid1998/parabank/blob/main/src/main/resources/Features/08_FindTransactions.feature)
- [Forgot Login Information](https://github.com/AhmedMAbuzaid1998/parabank/blob/main/src/main/resources/Features/09_Forgot%20login%20info.feature)

### Project Objective
The goal is to develop an automated testing framework for thorough and efficient testing of the ParaBank web application. This includes:

- UI and functionality testing using Selenium and Cucumber.
- API testing using Postman.
- Generating detailed test reports.
- Managing and tracking issues using Jira.

### Technologies Used
- Selenium WebDriver for automating browser interactions.
- Cucumber for behavior-driven development (BDD) and test case structuring.
- Postman for API testing.
- Jira for managing test cases and tracking issues.
- JUnit for report generation and testing.
- Maven as the build tool for project management.

### Prerequisites
- JDK 22.0.2;
- Maven 3.9.6;
- Selenium Webdriver 4.25.0;
- webdrivermanager 5.9.2;
- cucumber-java 7.18.1;
- cucumber-junit 7.18.1;
- javafaker 1.0.2

### Overview video :
[Link](https://drive.google.com/file/d/1SYusmVDIhtnHU-oOyQRP4SVEugp-OS9o/view?usp=drive_link)


### Usage
To use this project, clone it on your machine and open it on your IDE.

To run the test automation, you can simply run all the tests located  at the `src/main/resources/Features` dir. This is possible
because the ParaBank application is already running on a web server. 

But if you would like to run only one test case, you can open the
[`Signup.feature`](https://github.com/AhmedMAbuzaid1998/parabank/blob/main/src/main/resources/Features/01_SignUp.feature)
file as an example, and run its tests.

Once you run the tests, Selenium Webdriver will open a browser and execute the steps defined on the test file.
