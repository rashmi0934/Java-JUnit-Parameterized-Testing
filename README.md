# Java JUnit Parameterized Testing

This project contains unit tests for a simple 'Calculator' class using **JUnit 5**.
It demonstrates the use of **basic testing**, **parameterized tests**, and **exception handling**.

---

## 📌 Features Covered

* ✅ Unit Testing using JUnit 5
* ✅ `@BeforeEach` and `@AfterEach` lifecycle methods
* ✅ Parameterized Testing using:
  * `@ValueSource`
  * `@CsvSource`
* ✅ Exception Testing using `assertThrows`
* ✅ Assertions:
  * `assertEquals`
  * `assertNotEquals`

---

## 📂 Project Structure

```
project-root/
│
├── src/                # Source code (Calculator class)
├── test/               # Test cases (CalculatorTest.java)
├── lib/                # JUnit libraries
└── README.md
```

---

## 🧠 Test Cases Implemented

### 1. Square of a Number (Valid Values)
* Tests square calculation using multiple inputs
* Uses `@ParameterizedTest` with `@ValueSource`

### 2. Addition of Two Integers
* Verifies addition within integer range

### 3. Square with Invalid Values (Exception Case)
* Tests edge cases like:
  * `Integer.MAX_VALUE`
  * `Integer.MIN_VALUE`
* Ensures `ArithmeticException` is thrown

### 4. Square Result Deviation Test
* Validates incorrect results using `assertNotEquals`

### 5. Division of Two Integers
* Uses `@CsvSource` for multiple test inputs

---

## ⚙️ Technologies Used
* Java
* JUnit 5
* VS Code

---

## ▶️ How to Run Tests

1. Open the project in VS Code
2. Ensure JUnit libraries are added
3. Run tests using:
   * **Run Test button (▶)** in editor
   * OR Testing panel in VS Code

---

## 🔁 Test Lifecycle

* `@BeforeEach` → Initializes Calculator object
* `@AfterEach` → Prints:

  ```
  Method resources released
  ```

---

## 📸 Sample Output

```
Method resources released
Method resources released
...
```

(Output appears once per test execution)

---

## 🚀 Learning Outcome

This project helps in understanding:
* Writing clean unit tests
* Using parameterized inputs
* Handling edge cases and exceptions
* Structuring test code effectively

---

## 📌 Author

Rashmi 

---
