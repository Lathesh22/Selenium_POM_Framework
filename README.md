\# Selenium POM Framework



\## Applications Automated

\- Netflix Login Flow

\- SauceDemo Login - Positive and Negative scenarios



\## Tech Stack

\- Java

\- Selenium WebDriver

\- TestNG

\- PageFactory (FindBy)

\- Maven



\## Test Scenarios



\### OrangeHRM (https://opensource-demo.orangehrmlive.com)

\- Valid login — assert dashboard username displays

\- Invalid login — assert "Invalid credentials" error displays



\---



\## Screenshot on Failure



\- Automatically captures screenshot when any test fails

\- Screenshot saved to SeleniumScreenshot/ folder

\- Filename format: testName\_dd-MM-yyyy\_HH-mm-ss.png

\- Example: invalidLogin\_30-03-2026\_11-25-33.png



\### Netflix

\- Open Netflix

\- Click Sign In

\- Enter mobile number

\- Click Continue

\- Assert page title contains "Netflix"



\### SauceDemo

\- Valid login with correct credentials

\- Assert inventory page loads

\- Invalid login with wrong credentials

\- Assert error message displays "Epic sadface"



\## How to Run

1\. Clone repository

2\. Open in Eclipse as Maven project

3\. Run individual test classes as TestNG Test



\## Author

Lathesh | QA Engineer | Pharma Digital Domain



\---





