# Circular Singly Linked List Operations in Java

This repository contains the implementation of basic operations for a Circular Singly Linked List (CSLL) in Java. The operations include insertion at various positions, deletion, and displaying the elements in the CSLL.

## Table of Contents
1. [Introduction](#introduction)
2. [Operations](#operations)
   - [CSLL Insertion](#csll-insertion)
   - [CSLL Deletion](#csll-deletion)
   - [CSLL Display](#csll-display)
3. [Code Implementation](#code-implementation)
4. [Usage](#usage)
5. [Conclusion](#conclusion)

---

## Introduction

A **Circular Singly Linked List (CSLL)** is a data structure where each node contains a value and a pointer to the next node. The last node points back to the head node, forming a circular structure. This allows traversing the list starting from any node.

This implementation covers:
- Insertion of elements at the beginning, end, before a given element, and after a given element.
- Deletion of elements from the beginning, end, before a given element, and after a given element.
- Display of the current state of the linked list.

---

## Operations

### CSLL Insertion

You can insert a new element at:
1. **The Beginning**: The new node is inserted before the current head and the tail's pointer is updated to point to the new head.
2. **The End**: The new node is inserted after the current tail and the new tail's next pointer points to the head.
3. **Before a Specific Element**: The new node is inserted before a specified element in the list.
4. **After a Specific Element**: The new node is inserted after a specified element in the list.

### CSLL Deletion

You can delete an element from:
1. **The Beginning**: The head node is removed and the tail’s next pointer is updated to point to the new head.
2. **The End**: The tail node is removed and the new tail's next pointer is updated to point to the head.
3. **Before a Specific Element**: The node before the specified element is deleted.
4. **After a Specific Element**: The node after the specified element is deleted.

### CSLL Display

This operation traverses the circular singly linked list starting from the head and prints the values of all nodes until it circles back to the head.

---

## Code Implementation

The code for these operations is available in the `circular_singly_list.java` file inside the `linkedlist` directory of the DSA repository.

### Key Classes and Methods

- **Node Class**: Represents a node in the CSLL, storing data and a reference to the next node.
- **insert()**: Method to insert a node at various positions in the list.
- **delete()**: Method to delete a node from various positions in the list.
- **show()**: Method to display all nodes in the CSLL.

---

## Usage

To run the Circular Singly Linked List operations:

1. **Clone the repository** or copy the `circular_singly_list` class to your local environment.
2. Compile and run the Java program in your preferred IDE or terminal.

### Steps to Perform Operations

1. **CSLL Insertion**: 
   - Choose the "CSLL Insertion" option by selecting `1` in the menu.
   - You can insert nodes at the beginning, end, before, or after a specific element.

2. **CSLL Deletion**: 
   - Choose the "CSLL Deletion" option by selecting `2` in the menu.
   - You can delete nodes from the beginning, end, before, or after a specific element.

3. **CSLL Display**: 
   - To display the current state of the circular singly linked list, select the "CSLL Display" option by selecting `3` in the menu.

4. **Exit**: 
   - Select `4` to exit the program.

---

## Conclusion

This implementation of a Circular Singly Linked List in Java demonstrates how to handle various operations like insertion and deletion at different positions. The circular nature of CSLL, where the last node points back to the head, makes it efficient for scenarios where continuous cycling through the list is required. 

Feel free to clone, modify, or contribute to this project for further improvements.
