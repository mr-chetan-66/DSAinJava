# Data Structures and Algorithms in Java

## Overview
This repository contains implementations of fundamental Data Structures and Algorithms in Java. The goal of this project is to provide a comprehensive collection of DSA solutions, including operations like insertion, deletion, sorting, searching, and other related functionalities.

These implementations can serve as references for preparing for technical interviews, practicing coding problems, or improving your understanding of how data structures and algorithms work behind the scenes.

## Table of Contents
- [About the Project](#about-the-project)
- [Technologies Used](#technologies-used)
- [Data Structures](#data-structures)
- [Algorithms](#algorithms)
- [Usage](#usage)
- [Examples](#examples)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## About the Project
This project focuses on implementing core operations on various data structures and algorithms in Java, including:

- **Insertion and Deletion**: Various techniques for inserting and removing elements from different data structures.
- **Sorting Algorithms**: Implementations of sorting techniques like Bubble Sort, Merge Sort, Quick Sort, etc.
- **Searching Algorithms**: Efficient searching methods, including linear search and binary search.
- **Utility Operations**: Additional methods like traversals, reversing data structures, and more.

Each algorithm is implemented with detailed comments and optimized for both time complexity and space complexity.

## Technologies Used
- **Java**: The core programming language used for all the code.
- **JUnit**: For testing the correctness of the implemented algorithms.
- **Git**: For version control.

## Data Structures
This section contains the implementation of several fundamental data structures and the operations associated with them.

- **Arrays**:
  - Insertion
  - Deletion
  - Searching
  - Sorting 
- **Linked List**:
  - Singly Linked List
  - Circular Singly Linked List
  - Doubly Linked List
  - Circular Doubly Linked List
- **Stacks**:
  - Push
  - Pop
  - Peek
  - Applications (e.g., Expression Evaluation)
- **Queues**:
  - Enqueue
  - Dequeue
  - Circular Queue
- **Trees**:
  - Binary Search Tree (BST)
  - AVL Tree
  - Heap (Max Heap, Min Heap)
- **Graphs**:
  - BFS (Breadth-First Search)
  - DFS (Depth-First Search)
  - Shortest Path Algorithms (Dijkstra, Bellman-Ford)

## Algorithms
Here you’ll find the implementation of key algorithms grouped by their category.

### Sorting Algorithms
- **Bubble Sort**: Time Complexity: O(n²)
- **Selection Sort**: Time Complexity: O(n²)
- **Insertion Sort**: Time Complexity: O(n²)
- **Merge Sort**: Time Complexity: O(n log n)
- **Quick Sort**: Time Complexity: O(n log n)
- **Heap Sort**: Time Complexity: O(n log n)

### Searching Algorithms
- **Linear Search**: Time Complexity: O(n)
- **Binary Search**: Time Complexity: O(log n)

### Other Algorithms
- **Floyd-Warshall Algorithm**: For all-pairs shortest path in a weighted graph.
- **Kruskal's Algorithm**: Minimum Spanning Tree (MST).
- **Dijkstra's Algorithm**: Shortest path in weighted graphs.

## Usage
To use this repository:

1. Clone the repository:
    ```bash
    git clone https://github.com/mr-chetan-66/DSAinJava.git
    cd DSA-Java
    ```

2. Compile and Run: Each class can be compiled and executed independently. For example:
    ```bash
    javac Sorting/BubbleSort.java
    java Sorting.BubbleSort
    ```

3. Test Cases: JUnit tests are available for most algorithms.
    ```bash
    cd tests
    javac org.junit.runner.JUnitCore dsaArray.java
    ```

## Examples
Here are some quick usage examples for common operations.

1. **Array Insertion**:
    ```java
    int[] arr = {1, 2, 3, 4};
    ArrayOperations.insert(arr, 5, 2);  // Inserts 5 at index 2
    ```

2. **Merge Sort**:
    ```java
    int[] arr = {5, 2, 9, 1, 5, 6};
    MergeSort.sort(arr);
    System.out.println(Arrays.toString(arr));  // Output: [1, 2, 5, 5, 6, 9]
    ```

3. **Binary Search**:
    ```java
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    int index = BinarySearch.search(arr, 4);  // Returns the index of 4 (i.e., 3)
    ```

## Contributing
Contributions are always welcome! If you would like to add new data structures or algorithms, fix bugs, or improve documentation:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature/your-feature`).
5. Open a pull request.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more information.

## Contact
For any questions or discussions, feel free to reach out.

- **GitHub**: [Chetan Awari](https://github.com/mr-chetan-66/DSAinJava.git)
- **Email**: [chetanawari2002@gmail.com](mailto:chetanawari2002@gmail.com)
