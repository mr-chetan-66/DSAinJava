# Singly Linked List Implementation in Java

This project demonstrates the implementation of a **Singly Linked List (SLL)** in Java. The list supports the following operations:
- Insertion at the beginning, end, before, or after a specified node.
- Deletion from the beginning, end, before, or after a specified node.
- Displaying all the elements in the list.

## Features

1. **SLL Creation**:
   - Insert elements at the beginning or end.
   - Insert elements before or after a specific element.
  
2. **SLL Deletion**:
   - Delete elements from the beginning or end.
   - Delete elements before or after a specific element.
  
3. **SLL Display**:
   - Display all elements currently in the singly linked list.

## How to Run

### Prerequisites
- You need to have **Java** installed on your system.
- Use any IDE (like IntelliJ IDEA, Eclipse, etc.) or compile and run the program from the command line.

### Compilation and Execution

1. Clone the repository or download the source code.
2. Navigate to the project directory.
3. Compile the code using the following command:
   ```bash
   javac singly_list.java

**Run the program:**
java singly_list

# Usage
When you run the program, you'll be prompted to choose between several operations:

**SLL CREATION:**

Insert at Beginning
Insert at End
Insert Before a specific element
Insert After a specific element
Exit
**SLL DELETION:**

Delete from Beginning
Delete from End
Delete Before a specific element
Delete After a specific element
Exit
**SLL DISPLAY:**

Display all elements in the list.
EXIT:

**Exit the program.**

**Example Input/Output**

1.SLL CREATION  ||  2.SLL DELETION  ||  3.SLL DISPLAY || 4.EXIT
1
Insert AT: 1. Beginning 2. End 3. Before 4. After 5. EXIT
1
Enter the element: 
5
To CONTINUE OR EXIT (Press 1):
1

1.SLL CREATION  ||  2.SLL DELETION  ||  3.SLL DISPLAY || 4.EXIT
3
Elements in SLL: 5 

**Code Explanation**
The program uses a Node class that defines the structure of a singly linked list node. Each node contains:
An int data field.
A reference to the next node (Node next).

The singly_list class contains methods for:

**sll_creation**: Inserts nodes in different positions.
**sll_deletion**: Removes nodes based on user input.
**sll_display**: Prints all the nodes in the list.
The program uses a loop and Scanner input to interact with the user, allowing multiple insertions and deletions.

# License
This project is open-source and available under the MIT License.