# Circular Doubly Linked List Operations in Java

This repository contains the implementation of basic operations for a Circular Doubly Linked List (CDLL) in Java. The operations include insertion at various positions, deletion, and displaying the elements in the CDLL.

## Table of Contents
1. [Introduction](#introduction)
2. [Operations](#operations)
   - [CDLL Insertion](#cdll-insertion)
   - [CDLL Deletion](#cdll-deletion)
   - [CDLL Display](#cdll-display)
3. [Code Implementation](#code-implementation)
4. [Usage](#usage)
5. [Conclusion](#conclusion)

---

## Introduction

A **Circular Doubly Linked List (CDLL)** is a data structure where each node contains a value, a pointer to the next node, and a pointer to the previous node. The last node points back to the head node, and the head node points back to the tail, forming a circular structure. This allows for efficient traversal both forwards and backwards.

This implementation covers:
- Insertion of elements at the beginning, end, before a given element, and after a given element.
- Deletion of elements from the beginning, end, before a given element, and after a given element.
- Display of the current state of the linked list.

---

## Operations

### CDLL Insertion

You can insert a new element at:
1. **The Beginning**: The new node is inserted before the current head, and the tail's `next` pointer is updated to point to the new head.
2. **The End**: The new node is inserted after the current tail, and the new tail's `next` pointer points to the head.
3. **After a Specific Element**: The new node is inserted after a specified element in the list.
4. **Before a Specific Element**: The new node is inserted before a specified element in the list.

### CDLL Deletion

You can delete an element from:
1. **The Beginning**: The head node is removed, and the tail’s `next` pointer is updated to point to the new head.
2. **The End**: The tail node is removed, and the new tail's `next` pointer is updated to point to the head.
3. **After a Specific Element**: The node after the specified element is deleted.
4. **Before a Specific Element**: The node before the specified element is deleted.

### CDLL Display

This operation traverses the circular doubly linked list starting from the head and prints the values of all nodes until it circles back to the head.

---

## Code Implementation

The code for these operations is available in the `CircularDoublyLL.java` file inside this repository.

### Key Classes and Methods

- **Node Class**: Represents a node in the CDLL, storing data and references to the next and previous nodes.
- **insert()**: Method to insert a node at various positions in the list.
- **delete()**: Method to delete a node from various positions in the list.
- **show()**: Method to display all nodes in the CDLL.

---

## Usage

To run the Circular Doubly Linked List operations:

1. **Clone the repository** or copy the `CircularDoublyLL` class to your local environment.
2. Compile and run the Java program in your preferred IDE or terminal.

### Steps to Perform Operations

1. **CDLL Insertion**: 
   - Choose the "CDLL Insertion" option by selecting `1` in the menu.
   - You can insert nodes at the beginning, end, before, or after a specific element.

2. **CDLL Deletion**: 
   - Choose the "CDLL Deletion" option by selecting `2` in the menu.
   - You can delete nodes from the beginning, end, before, or after a specific element.

3. **CDLL Display**: 
   - To display the current state of the circular doubly linked list, select the "CDLL Display" option by selecting `3` in the menu.

4. **Exit**: 
   - Select `4` to exit the program.

---

## Conclusion

This implementation of a Circular Doubly Linked List in Java demonstrates how to handle various operations like insertion and deletion at different positions. The circular nature of CDLL, where the last node points back to the head, and the head points to the tail, makes it efficient for scenarios requiring both forward and backward traversal.

Feel free to clone, modify, or contribute to this project for further improvements.
