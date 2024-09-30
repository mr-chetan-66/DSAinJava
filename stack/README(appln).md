# Stack Application

This project is a stack-based application in Java that provides several functionalities, including:

1. **Validating Brackets**: Checks if the given bracket expression is valid.
2. **Infix to Postfix Conversion**: Converts a mathematical infix expression to postfix notation.
3. **Infix to Prefix Conversion**: Converts a mathematical infix expression to prefix notation.
4. **Evaluating Expressions**: Evaluates postfix and prefix expressions.
5. **Tower of Hanoi**: Solves the Tower of Hanoi problem with the given number of disks.

## Features

- **Bracket Validation**: Validates various types of brackets: `()`, `{}`, `[]`.
- **Expression Conversion**: Handles arithmetic expressions involving operators: `+`, `-`, `*`, `/`, `%`, `^`.
- **User Interaction**: Interactive console interface for inputting expressions and receiving results.

# Terminology Reference for Stack Application

## 1. Stack
A **stack** is a linear data structure that follows the Last In First Out (LIFO) principle. Elements are added and removed from the top of the stack. Common operations include:
- **Push**: Add an element to the top of the stack.
- **Pop**: Remove the top element from the stack.
- **Peek**: View the top element without removing it.

## 2. Valid Brackets
**Bracket validation** is the process of checking if all types of brackets in an expression are balanced. Types of brackets include:
- Parentheses: `()`
- Curly braces: `{}`
- Square brackets: `[]`

An expression is valid if every opening bracket has a corresponding closing bracket in the correct order.

## 3. Infix Expression
An **infix expression** is a mathematical expression in which operators are placed between operands. For example, `A + B` is an infix expression. 

## 4. Postfix Expression
A **postfix expression** (also known as Reverse Polish Notation) is a mathematical notation in which every operator follows all of its operands. For example, the infix expression `A + B` would be written as `AB+` in postfix notation. 

### Evaluation of Postfix Expression
To evaluate a postfix expression, follow these steps:
1. Scan the expression from left to right.
2. If the symbol is an operand, push it onto the stack.
3. If the symbol is an operator, pop the required number of operands off the stack, perform the operation, and push the result back onto the stack.

## 5. Prefix Expression
A **prefix expression** (also known as Polish Notation) is a mathematical notation in which every operator precedes its operands. For example, the infix expression `A + B` would be written as `+AB` in prefix notation.

### Evaluation of Prefix Expression
To evaluate a prefix expression, follow these steps:
1. Scan the expression from right to left.
2. If the symbol is an operand, push it onto the stack.
3. If the symbol is an operator, pop the required number of operands off the stack, perform the operation, and push the result back onto the stack.

## 6. Tower of Hanoi
The **Tower of Hanoi** is a mathematical puzzle that involves three rods and a number of disks of different sizes. The objective is to move the entire stack to another rod, following these rules:
- Only one disk can be moved at a time.
- Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack.
- No larger disk may be placed on top of a smaller disk.

## 7. Algorithm
An **algorithm** is a step-by-step procedure or formula for solving a problem. In this application, algorithms are implemented to validate brackets, convert infix to postfix/prefix, evaluate expressions, and solve the Tower of Hanoi.

## 8. Time Complexity
**Time complexity** is a computational complexity that describes the amount of time it takes to run an algorithm as a function of the length of the input. It is often expressed using Big O notation (e.g., O(n), O(log n), O(n^2)).

## 9. Space Complexity
**Space complexity** measures the amount of working storage an algorithm needs. Like time complexity, it is often expressed in Big O notation. Space complexity includes both the space required for input values and the space needed for variables and data structures used in the algorithm.

## 10. Java Collections Framework
The **Java Collections Framework** is a set of classes and interfaces that implement commonly reusable collection data structures. It provides:
- **List**: An ordered collection that can contain duplicate elements.
- **Set**: A collection that cannot contain duplicate elements.
- **Map**: An object that maps keys to values, with no duplicate keys.

### 10.1 Stack in Java
In Java, the **Stack** class is a part of the Java Collections Framework and provides methods to push, pop, and peek at elements, making it suitable for implementing stack-based applications.



This reference can be used for quick lookups of key concepts and terminologies related to your stack-based application. Feel free to add or modify any terms that you find relevant!


## How to Use

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/stack-application.git
   cd stack-application
   ```
## Compilation and Execution Instructions

To compile and run the **Stack Application**, follow the steps below:

### 1. Compile the Java Files

Open your terminal and navigate to the directory containing the `stackApplication.java` file. Run the following command to compile the Java file:

```bash
javac stackApplication.java
```
## Functionality Overview

1. **Check Valid Brackets**
   - **Input:** A string containing brackets.
   - **Output:** Message indicating whether the brackets are valid.

2. **Infix to Postfix Expression**
   - **Input:** A mathematical expression in infix notation.
   - **Output:** The equivalent expression in postfix notation.

3. **Infix to Prefix Expression**
   - **Input:** A mathematical expression in infix notation.
   - **Output:** The equivalent expression in prefix notation.

4. **Evaluate Expression**
   - **Input:** A postfix or prefix expression.
   - **Output:** The evaluated result of the expression.

5. **Tower of Hanoi**
   - **Input:** Number of disks.
   - **Output:** Steps to solve the Tower of Hanoi problem.

## Example Usage

### Valid Brackets:
- **Input:** `{[()]}`  
  **Output:** Brackets Match

### Infix to Postfix:
- **Input:** `A + B * C`  
  **Output:** `ABC*+`

### Evaluate Postfix:
- **Input:** `5 6 2 + *`  
  **Output:** `35`

## Contribution

Contributions are welcome! Feel free to open issues or submit pull requests.

## License

This project is licensed under the MIT License - see the LICENSE file for details.

### Instructions
- Replace `yourusername` in the clone URL with your actual GitHub username.
- You can add a `LICENSE` file if needed and specify the license type at the end. Adjust the usage examples as needed to reflect your application’s specific outputs.

Feel free to modify the content to better fit your project or add more detailed explanations as needed.

