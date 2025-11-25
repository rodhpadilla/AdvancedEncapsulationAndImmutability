# Module 1 Micro-Challenge: Encapsulation & Immutability

## 🎯 Goal
Build a strictly validated, immutable Value Object called `CronExpression`. This component will serve as the core scheduling definition for our Automation Agent.

## 📋 Requirements

### 1. The Class: `CronExpression`
* **Package:** `com.automation.model` (or your preferred package)
* **State:**
    * Must contain a `private final String expression`.
* **Constructor:**
    * Signature: `public CronExpression(String expression)`
    * **Validation Logic:**
        1.  Check if input is `null`.
        2.  Check if input matches the allowed pattern.
    * **Behavior:** If validation fails, throw `new IllegalArgumentException("Invalid cron format")`.
* **Methods:**
    * A getter: `public String getExpression()` (or `toString()`).

### 2. Validation Logic (Regex)
To keep this iteration simple, valid patterns are limited to:
* `*` (Runs every minute)
* `*/<number>` (Runs every N minutes, e.g., `*/5`, `*/15`)

**Regex Hint:** `^(\*|\*/\d+)$`

---

## 🧪 Testing Requirements (JUnit 5)

Create a test class `CronExpressionTest` that proves your "Bouncer" works.

### Test Case 1: `testValidExpressions`
* **Input:** `"*"`, `"*/5"`, `"*/10"`
* **Assertion:** Verify that the object is created successfully and `getExpression()` returns the correct string.

### Test Case 2: `testInvalidExpressions`
* **Input:** `"ABC"`, `"12:00"`, `""` (empty string), `null`
* **Assertion:** Verify that the constructor throws `IllegalArgumentException`.
* **Junit Hint:** Use `Assertions.assertThrows(...)`.

---

## 💡 Implementation Tips

1.  **Java Regex:** Remember that backslashes in regex strings must be escaped in Java.
    * Regex: `\d` -> Java String: `"\\d"`
2.  **Immutability:** Do not create a `setExpression` method. Once created, it stays created.