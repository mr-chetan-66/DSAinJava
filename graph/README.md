# Graph Operations in Java

This project implements fundamental operations on graphs, such as inserting edges and performing Breadth-First Search (BFS) and Depth-First Search (DFS) traversals. The project allows interactive input of vertices and edges, and provides options to choose between BFS and DFS traversal.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Graph Operations](#graph-operations)
  - [Insert Edge](#insert-edge)
  - [Breadth-First Search (BFS)](#breadth-first-search-bfs)
  - [Depth-First Search (DFS)](#depth-first-search-dfs)
- [Usage](#usage)
- [How to Run](#how-to-run)
- [License](#license)

## Overview
This repository contains a Java program that performs graph operations, including:
- Inserting edges between vertices.
- Performing traversal using BFS and DFS techniques.

The program uses the **Adjacency List** representation of graphs and provides the user with interactive options for traversing the graph from a specific source vertex.

## Features
- **Insert Edge**: Insert edges between any two vertices.
- **BFS Traversal**: Traverse the graph using the BFS technique starting from a specified source vertex.
- **DFS Traversal**: Traverse the graph using the DFS technique starting from a specified source vertex.

## Technologies Used
- **Java**: The programming language used for implementation.
- **Scanner**: Used for interactive input from the user.

## Graph Operations

### Insert Edge
This operation adds an edge between two vertices in an undirected graph. The edge is inserted in both directions (from source to destination and destination to source).

### Breadth-First Search (BFS)
BFS traverses the graph level by level, starting from a specified source vertex. It explores all neighbors at the current level before moving on to the next level of vertices.

### Depth-First Search (DFS)
DFS traverses the graph by exploring as far as possible along each branch before backtracking. It uses a stack to keep track of the nodes to visit.

## Usage
To use the program, you need to input the number of vertices and edges. Then, provide pairs of vertices to define edges. After that, you can choose whether to perform BFS or DFS traversal from a specific source vertex.

```java
// Example usage
GraphOperations g = new GraphOperations(5);
g.insertEdge(0, 1);
g.insertEdge(1, 2);
g.insertEdge(2, 3);
g.bfs(0);  // BFS traversal from vertex 0
g.dfs(0);  // DFS traversal from vertex 0

## How to Run
1. Compile and run the program.
2. Input the number of vertices and edges.
3. Provide the edges (source and destination).
4. Choose whether to perform BFS or DFS traversal from a specified source vertex.
5. The traversal output will be printed to the console.

## License
This project is open source and available under the MIT License.
