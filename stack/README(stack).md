# Stack Operations in Java

This project implements fundamental operations on a stack, including **push**, **pop**, **isEmpty**, **isFull**, and **display**. The program allows interactive input from the user to perform these operations on a stack of a user-defined size.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Stack Operations](#stack-operations)
  - [Push Operation](#push-operation)
  - [Pop Operation](#pop-operation)
  - [Display Operation](#display-operation)
  - [isEmpty](#isempty)
  - [isFull](#isfull)
- [Usage](#usage)
- [How to Run](#how-to-run)
- [License](#license)

## Overview
This repository contains a Java program that performs various operations on a stack using an array-based implementation. The program supports interactive input for elements and allows operations such as inserting, deleting, and checking if the stack is full or empty.

## Features
- **Push Operation**: Insert an element into the stack.
- **Pop Operation**: Remove the top element from the stack.
- **Display Operation**: View the top element (peek) or the entire stack.
- **isEmpty**: Check if the stack is empty.
- **isFull**: Check if the stack is full.

## Technologies Used
- **Java**: The programming language used for implementation.
- **Scanner**: Used for interactive input from the user.

## Stack Operations

### Push Operation
The `push` operation inserts an element onto the top of the stack. If the stack is full, an error message is displayed indicating that the element cannot be inserted.

### Pop Operation
The `pop` operation removes the top element from the stack. If the stack is empty, a message is displayed indicating that no elements can be removed.

### Display Operation
The `display` operation shows either the top element (peek) or the entire stack based on the user's selection.

### isEmpty
The `isEmpty` operation checks whether the stack contains any elements. If the stack is empty, it returns true.

### isFull
The `isFull` operation checks if the stack has reached its maximum capacity. If the stack is full, it returns true.

## Usage
To use the program, follow these steps:

1. Enter the desired size for the stack.
2. Choose an operation from the following:
   - Insert (Push)
   - Delete (Pop)
   - Display (Peek or Full Stack)
   - Check if the stack is empty or full.

The program will interactively ask for inputs and perform the operations.

```java
// Example usage
stackOperations s = new stackOperations();
s.stk = new int[5];
s.push(sc);
s.pop(sc);
s.display(sc);

## How to Run
1. Compile and run the program.
2. Input the size of the stack.
3. Choose an operation from the menu and follow the prompts.
4. The output will be printed to the console.

```bash
javac stack.java
java stack

## License
This project is open source and available under the MIT License.
