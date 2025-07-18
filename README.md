# Balanced Parentheses Validator

A simple Java utility that checks whether a string expression contains properly balanced parentheses, brackets, and braces using a stack-based algorithm.

## 🧠 Features

- Validates expressions with `()`, `{}`, and `[]`
- Ignores non-bracket characters (optional to extend)
- Simple and readable implementation
- Includes unit tests using JUnit 5

## 📦 Project Structure
```
src/
├── main/
│   └── java/
│       └── com.hernan/
│           └── util/
│           │   └── ExpressionValidatorUtil.java
│           └── CheckBalancedParenthesis.java
└── test/
│    └── java/
│       └── com.hernan.util/
            └── ExpressionValidatorUtilTest.java
```

## 🛠️ How It Works

The algorithm uses a stack to track opening brackets. Each time a closing bracket appears, it checks if the most recent opening bracket matches it. If all brackets match and the stack is empty at the end, the expression is considered **balanced**.

## ✅ Example Usages

| Expression     | Result            |
|----------------|-------------------|
| `()`           | ✅ Balanced        |
| `({[]})`       | ✅ Balanced        |
| `(())`         | ✅ Balanced        |
| `([)]`         | ❌ Not Balanced    |
| `({[})]`       | ❌ Not Balanced    |
| `((())`        | ❌ Not Balanced    |
| `)(`           | ❌ Not Balanced    |

## 🧪 Running Tests

Make sure you have JUnit 5 in your dependencies. Then run tests using your IDE or command line (e.g., Maven).

Example with Maven:
```bash
mvn test
```

## 🚀 Requirements
- Java 8 or higher

- Maven for building and running tests