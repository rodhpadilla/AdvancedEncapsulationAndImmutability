# Module 1 Micro-Challenge: Encapsulation & Immutability

## 🎯 Goal
Create a `CronExpression` Value Object. It must be impossible to create an instance of this class with invalid data.

## 📋 Requirements

### 1. The Class: `CronExpression`
* **State:**
    * A `private final` variable to hold the cron string.
* **Constructor:** `public CronExpression(String expression)`
    * **Validation:** You must validate the input *before* assigning it to the state variable.
    * **Rules:**
        1.  Input cannot be `null`.
        2.  Input must match the allowed format (see below).
    * **Failure:** If any rule is violated, throw `IllegalArgumentException`.
* **Methods:**
    * `getCronValue()`: Returns the valid string.

### 2. The Format Logic (Regex)
You need to construct a Regex pattern that validates two specific cases:
1.  **"Every Minute":** Exact match for `*`.
2.  **"Step Interval":** Starts with `*/` followed immediately by a number (e.g., `*/5`, `*/15`).

### 3. Testing (`CronExpressionTest`)
* **Framework:** JUnit 5
* **Test Case A:** Verify valid inputs (`*` and `*/10`) create the object successfully.
* **Test Case B:** Verify `null` throws an exception.
* **Test Case C:** Verify invalid formats (e.g., `A`, `*/A`, `12:00`) throw an exception.
    * *Tip:* Use `assertThrows(IllegalArgumentException.class, () -> new CronExpression(...))`