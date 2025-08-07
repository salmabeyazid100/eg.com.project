
# 🧪 Swag Labs E2E Automation Project

This project performs end-to-end (E2E) test automation for an e-commerce web application using:

- **Selenium 4**
- **Java**
- **TestNG**
- **Page Object Model (POM)**
- **Allure Reports**

---

## 📁 Project Structure

```

\|--- src
\|    |--- main
\|    |    |--- java
\|    |         |--- pages       # Page classes with locators & logic
|
\|    |--- test
\|         |--- java
\|              |--- base        # BaseTest setup with WebDriver & config
\|              |--- tests       # Test classes with TestNG + Allure

````

---

## 🔧 Tech Stack

| Tool / Library           | Description                            |
|--------------------------|----------------------------------------|
| Selenium 4               | Browser automation                     |
| Java                     | Programming language                   |
| TestNG                   | Testing framework                      |
| Maven                    | Dependency management                  |
| Allure                   | Reporting framework                    |
| Page Object Model (POM)  | Test design pattern                    |

---

## ▶️ How to Run Tests

1. Clone the repo:
   ```bash
   git clone https://github.com/your-username/swaglabs-automation.git
   cd swaglabs-automation
````

2. Install dependencies:

   ```bash
   mvn clean install
   ```

3. Run tests:

   ```bash
   mvn test
   ```

4. Generate Allure report:

   ```bash
   allure serve allure-results
   ```

---

## ✅ Test Scenarios

This project covers the following test flows:

* 🔐 **Login & Logout**
* 📝 **User Registration**
* 🛒 **Add to Cart & Checkout**
* 📦 **Item Comparison**
* ❤️ **Wishlist Management**
* 🧍 **Edit My Account Info**
* 🔎 **Search & Filter Items**

---

## 🏷️ Allure Annotations Used

Each test case is documented using Allure annotations:

* `@Epic` – Defines the big feature (e.g., E-Commerce)
* `@Feature` – Specific feature under test (e.g., Wishlist)
* `@Story` – User story or use case
* `@Severity` – Priority level of the test (Blocker, Critical, Normal, Minor)
* `@Description` – Describes the test steps or purpose
* `@Step` – Used within page methods for detailed step logging

---

## 🔐 Test Credentials

Use the following credentials to run tests:

```
Email:     Salma.beyazid@gmail.com
Password:  12345678
```

You can update credentials via environment variables or external config for real-world use.

---

## 📊 Report Overview

After running the tests, Allure generates an interactive HTML report that includes:

* Test case status (Passed/Failed/Skipped)
* Execution time
* Steps and screenshots (optional)
* Logs with annotations

---

## ⚙️ Project Setup

* Java 17+
* Maven 3.6+
* ChromeDriver (auto-managed or placed in PATH)

> You may need to update your driver versions to match the installed browser.

---

## 📜 License

```
AMIT license @ 2025
Created by Salma Beyazid
```

---

## 🙋‍♀️ Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

---

```

Let me know if you want a version that includes badges (e.g., TestNG, Allure, Java) or one in Arabic.
```
