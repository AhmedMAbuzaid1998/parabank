# parabank

This project is a test automation of the [ParaBank](https://parabank.parasoft.com/parabank/index.htm), a demo site that simulates a realistic
online banking website, and it uses Selenium Webdriver and Java technologies.

## Prerequisites
- JDK 22.0.2;
- Maven 3.9.6;
- Selenium Webdriver 4.25.0;
- webdrivermanager 5.9.2;
- cucumber-java 7.18.1;
- cucumber-junit 7.18.1;
- javafaker 1.0.2


## Usage
To use this project, clone it on your machine and open it on your favorite IDE.

To run the test automation, you can simply run all the tests located  at the `src/main/resources/Features` dir. This is possible
because the ParaBank application is already running on a web server. 

But if you would like to run only one test case, you can open the
[`Signup.feature`](https://github.com/AhmedMAbuzaid1998/parabank/blob/main/src/main/resources/Features/01_SignUp.feature)
file as an example, and run its tests.

Once you run the tests, Selenium Webdriver will open a browser and execute the steps defined on the test file.
