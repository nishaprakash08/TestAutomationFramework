# Test Automation Framework

This is a Java-based test automation framework. 
The framework leverages various libraries and tools to facilitate data-driven testing, logging, reporting, and integration with cloud-based testing platform like lambdatest.

## 🚀 About Me
Hi, my name is Nisha Prakash. I bring over 9 years of experience in Automation Testing, with a strong focus on tools and technologies such as Selenium WebDriver and RestAssured.

My core expertise lies in Java programming, and I have hands-on experience with a wide range of frameworks and tools including SDET (Java), TestNG, REST API testing, WebDriverIO, Cucumber, JavaScript, BDD, Azure DevOps, Jenkins, Maven, and Git.


## Authors

- [@nishaprakash08](https://github.com/nishaprakash08)
- EmailAddress: nisha2009prakash@gmail.com



## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/nishaprakash08)

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/nisha-prakash-63133393/)

## Prerequisites

Before running this framework, ensure the following software is installed on your system:

- **Java 11** - Make sure Java is installed and the JAVA_HOME environment variable is set.
- **Maven** - Ensure Maven is installed and added to the system path.
- Downlod Link: https://maven.apache.org/download.cgi

## Features

-**Data-Driven Testing**: Using OpenCSV, Apache POI, and Gson for reading test data from CSV and Excel files and JSON.
- **Cross-Browser Testing**: Supports running tests on different browsers.
- **Headless Mode**: Faster execution by running tests in headless mode.
- **Cloud Testing**: Integrated with LambdaTest to run tests on the cloud.
- **Logging**: Uses Log4j for detailed logs.
- **Reporting**: Generates detailed reports using Extent Reports.

## Technologies Used
- Java 11
- TestNG
- OpenCSV
- Gson
- Apache POI
- Faker
- LambdaTest
- Log4j
- Extent Reports


## Setup Instructions

**Clone the Repository:**

```bash
  git clone https://github.com/nishaprakash08/TestAutomationFramework.git

  cd Test-Automation-Framework

  **Running Tests on LambdaTest:**

```bash
     mvn test  -Dbrowser=chrome -DisLambdaTest=true -DisHeadless=false -X

```

**Running Tests on Chrome browser on Local Machine in Headless Mode:**

```bash
     mvn test  -Dbrowser=chrome -DisLambdaTest=false -DisHeadless=true -X

```

## Reports & Logs
-Reports: After execution, a detailed HTML report will be generated at ./report.html. 

The report contains information on test cases executed, passed, failed, and skipped, along with screenshots for failed tests.

## Logs: 
Logs are created during the test execution and stored in the ./logs/ directory. 

## Integrated the project Github Actions 
This automation framework is integrated with GitHub Actions.
The tests will be executed at 11:30 PM IST every single day. 

The reports will be archived in the gh-pages branch
You can view the HTML reports at : 
https://nishaprakash08.github.io/TestAutomationFramework/report.html


