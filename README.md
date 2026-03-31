\# Selenium POM Framework



!\[Java](https://img.shields.io/badge/Java-ED8B00?style=flat\&logo=java\&logoColor=white)

!\[Selenium](https://img.shields.io/badge/Selenium-43B02A?style=flat\&logo=selenium\&logoColor=white)

!\[TestNG](https://img.shields.io/badge/TestNG-FF6C37?style=flat)

!\[Maven](https://img.shields.io/badge/Maven-C71A36?style=flat\&logo=apachemaven\&logoColor=white)



A Selenium Java automation framework built with Page Object Model (POM)

and PageFactory. Covers positive and negative test scenarios across

multiple applications with screenshot capture on failure.



\---



\## Tech Stack



| Tool        | Purpose                          |

|-------------|----------------------------------|

| Java        | Programming language             |

| Selenium    | Browser automation               |

| TestNG      | Test execution and assertions    |

| PageFactory | POM element initialisation       |

| Maven       | Build and dependency management  |

| Apache POI  | Excel data-driven testing        |



\---



\## Framework Features



| Feature                  | Status        |

|--------------------------|---------------|

| Page Object Model        | Done          |

| PageFactory              | Done          |

| TestNG Assertions        | Done          |

| Screenshot on Failure    | Done          |

| Dynamic Screenshot Name  | Done          |

| Data-driven from Excel   | Done   |

| GitHub Actions CI/CD     | Planned       |



\---



\## Applications Automated



\### 1. SauceDemo (https://www.saucedemo.com)

\- Valid login — assert inventory page loads

\- Invalid login — assert "Epic sadface" error displays

\- Data-driven login — reading username and password 

&#x20; from Excel file for multiple login scenarios



\### 2. Netflix (https://www.netflix.com)

\- Open Netflix and click Sign In

\- Enter mobile number and continue

\- Assert page title contains "Netflix"



\### 3. OrangeHRM (https://opensource-demo.orangehrmlive.com)

\- Valid login — assert dashboard username displays

\- Invalid login — assert "Invalid credentials" error displays



\---



\## Screenshot on Failure



\- Automatically captures screenshot when any test fails

\- Screenshot saved to SeleniumScreenshot/ folder

\- Filename format: testName\_dd-MM-yyyy\_HH-mm-ss.png

\- Example: invalidLogin\_30-03-2026\_11-25-33.png



\---



\## Framework Structure

```

src/

&#x20; main/java/

&#x20;   Base1/          # OpenBrowser - driver setup and teardown

&#x20;   pages/          # Page classes - locators and actions

&#x20;   utils/          # ExcelUtils - data driven helper

&#x20; test/java/

&#x20;   Test1/          # Test classes

TestData/           # Excel files for data driven testing

SeleniumScreenshot/ # Auto captured failure screenshots

Testng.xml          # TestNG suite configuration

```



\---



\## How to Run



1\. Clone the repository

&#x20;  git clone https://github.com/Lathesh22/Selenium\_POM\_Framework.git



2\. Open in Eclipse as Maven project



3\. Run individual test class

&#x20;  Right-click test class → Run As → TestNG Test



4\. Run full suite

&#x20;  Right-click Testng.xml → Run As → TestNG Suite



\---



\## Author



Lathesh | QA Engineer | Pharma Digital Domain

GitHub: https://github.com/Lathesh22

