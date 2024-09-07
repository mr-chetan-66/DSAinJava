# Array Operations in Java

This project implements various fundamental operations on arrays such as insertion, deletion, sorting, and displaying array elements. These operations are designed to give a clear understanding of how basic array manipulation works in Java.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Array Operations](#array-operations)
  - [Insertion](#insertion)
  - [Deletion](#deletion)
  - [Sorting](#sorting)
  - [Display](#display)
- [Usage](#usage)
- [How to Run](#how-to-run)
- [License](#license)

## Overview
This repository contains a Java program for performing basic operations on arrays. It allows the user to interactively choose from:
- Inserting elements into the array.
- Deleting elements from the array.
- Sorting the array (Insertion Sort, Bubble Sort).
- Displaying the current array elements.

The program is implemented with the use of **Scanner** for interactive input and performs array manipulations with efficient space usage.

## Features
- **Array Insertion**: Insert elements at the beginning, at any position, or at the end.
- **Array Deletion**: Delete elements from the beginning, at any position, or at the end.
- **Array Sorting**: Sort the array using either Insertion Sort or Bubble Sort.
- **Array Display**: Display all the elements of the array in their current order.

## Technologies Used
- **Java**: The programming language used for implementation.
- **Scanner**: Used for input from the user to determine the operations to perform.

## Array Operations

### Insertion
This operation allows inserting elements in the following ways:
- **At the end** of the array.
- **At a specific position** within the array.
- **At the beginning** of the array.

If the array is full, an alert will be shown to the user.

### Deletion
This operation supports deleting elements in three ways:
- **From the end** of the array.
- **From a specific position** in the array.
- **From the beginning** of the array.

If the array is empty, a warning will be shown to the user.

### Sorting
The array can be sorted in two ways:
- **Insertion Sort**: A simple sorting technique where elements are sorted one by one.
- **Bubble Sort**: A sorting technique that repeatedly swaps adjacent elements if they are in the wrong order.

### Display
The current elements of the array are displayed in their current order.

## Usage
To use the program, you need to provide the size of the array and then select from a list of operations (Insertion, Deletion, Sorting, Display). After performing an operation, you can either continue with other operations or quit.

```java
// Example usage
int[] arr = new int[5];
ArrayOperations.arrayFunction(arr, 5);
