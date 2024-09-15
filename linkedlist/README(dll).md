# Doubly Linked List Operations in Java

This repository contains the implementation of basic operations for a Doubly Linked List (DLL) in Java. The operations include insertion at various positions, deletion, and displaying the elements in the DLL.

## Table of Contents
1. [Introduction](#introduction)
2. [Operations](#operations)
   - [DLL Insertion](#dll-insertion)
   - [DLL Deletion](#dll-deletion)
   - [DLL Display](#dll-display)
3. [Code Implementation](#code-implementation)
4. [Usage](#usage)
5. [Conclusion](#conclusion)

---

## Introduction

A **Doubly Linked List (DLL)** is a data structure where each node contains three fields: a value, a pointer to the next node, and a pointer to the previous node. This allows traversing the list in both directions—forward and backward.

This implementation covers:
- Insertion of elements at the beginning, end, before a given element, and after a given element.
- Deletion of elements from the beginning, end, before a given element, and after a given element.
- Display of the current state of the linked list.

---

## Operations

### DLL Insertion

You can insert a new element at:
1. **The Beginning**: The new node is inserted before the current head.
2. **The End**: The new node is inserted after the current tail.
3. **Before a Specific Element**: The new node is inserted before a specified element in the list.
4. **After a Specific Element**: The new node is inserted after a specified element in the list.

### DLL Deletion

You can delete an element from:
1. **The Beginning**: The head node is removed.
2. **The End**: The tail node is removed.
3. **Before a Specific Element**: The node before the specified element is deleted.
4. **After a Specific Element**: The node after the specified element is deleted.

### DLL Display

This operation traverses the doubly linked list from the head and prints the values of all nodes in a linear fashion.

---
## code implementation  is avai8lable in doubly_list.java(inside linkedlist) file of dsa repo 

## Usage

To run the Doubly Linked List operations:

1. **Clone the repository** or copy the `doubly_list` class to your local environment.
2. Compile and run the Java program in your preferred IDE or terminal.

### Steps to Perform Operations

1. **DLL Insertion**: 
   - Choose the "DLL Insertion" option by selecting `1` in the menu.
   - You can insert nodes at the beginning, end, before, or after a specific element.

2. **DLL Deletion**: 
   - Choose the "DLL Deletion" option by selecting `2` in the menu.
   - You can delete nodes from the beginning, end, before, or after a specific element.

3. **DLL Display**: 
   - To display the current state of the doubly linked list, select the "DLL Display" option by selecting `3` in the menu.

4. **Exit**: 
   - Select `4` to exit the program.


---

## Conclusion

This implementation of a Doubly Linked List in Java demonstrates how to handle various operations like insertion and deletion at different positions. It allows users to interact with the list by performing dynamic operations and displays the current state of the list at any point. The flexibility of DLL, where each node maintains references to both its next and previous nodes, makes it a useful data structure for applications requiring bidirectional traversal.

Feel free to clone, modify, or contribute to this project for further improvements.


