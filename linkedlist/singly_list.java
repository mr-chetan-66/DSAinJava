import java.util.Scanner;

public class singly_list {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public void sll_creation(Scanner sc) {
        boolean bool = true;
        while (bool) {
            System.out.println("Insert AT: 1. Beginning 2. End 3. Before 4. After 5. EXIT");
            int choice = sc.nextInt();
            if (choice == 5) {
                break;
            }
            System.out.println("Enter the element: ");
            int nodedata = sc.nextInt();
            Node nn = new Node(nodedata);

            if (head == null) {
                head = nn;
                nn.next = null;
            } else {
                switch (choice) {
                    case 1: // Insert at the beginning
                        nn.next = head;
                        head = nn;
                        break;

                    case 2: // Insert at the end
                        Node ptr = head;
                        while (ptr.next != null) {
                            ptr = ptr.next;
                        }
                        ptr.next = nn;
                        break;

                    case 3: // Insert before a specific element
                        System.out.println("Enter element before which you want to INSERT: ");
                        int node = sc.nextInt();
                        Node ptr1 = head;
                        Node pptr1 = null;

                        while (ptr1 != null && ptr1.data != node) {
                            pptr1 = ptr1;
                            ptr1 = ptr1.next;
                        }
                        if (ptr1 == null) {
                            System.out.println("Element not found!");
                        } else if (pptr1 == null) { // inserting before head
                            nn.next = head;
                            head = nn;
                        } else {
                            nn.next = ptr1;
                            pptr1.next = nn;
                        }
                        break;

                    case 4: // Insert after a specific element
                        System.out.println("Enter element after which you want to INSERT: ");
                        int node1 = sc.nextInt();
                        Node ptr2 = head;

                        while (ptr2 != null && ptr2.data != node1) {
                            ptr2 = ptr2.next;
                        }

                        if (ptr2 == null) {
                            System.out.println("Element not found!");
                        } else {
                            nn.next = ptr2.next;
                            ptr2.next = nn;
                        }
                        break;

                    default:
                        System.out.println("WRONG CHOICE!");
                        break;
                }
            }
            System.out.println("To CONTINUE OR EXIT (Press 1):");
            bool = sc.nextInt() == 1;
        }
        System.out.println("EXITED from Insertion Method");
    }

    public void sll_deletion(Scanner sc) {
        if (head == null) {
            System.out.println("NO LL EXISTS");
            return;
        }

        boolean bool2 = true;
        while (bool2) {
            System.out.println("Delete FROM: 1. Beginning 2. End 3. Before 4. After 5.EXIT");
            int choice2 = sc.nextInt();
            if (choice2 == 5) break;

            switch (choice2) {
                case 1: // Deletion from the beginning
                    head = head.next;
                    System.out.println("Element deleted");
                    break;

                    case 2: // Deletion from the end
                    if (head.next == null) { // If there is only one node
                        head = null;
                    } else {
                        Node pptr3 = null;
                        Node ptr3 = head;
                        while (ptr3.next != null) {
                            pptr3 = ptr3;
                            ptr3 = ptr3.next;
                        }
                        if (pptr3 != null) {
                            pptr3.next = null; // correctly set the last node's next to null
                        }
                    }
                    System.out.println("Element deleted");
                    break;                

                case 3: // Deletion before a specific element
                    System.out.println("Enter element before which you want to DELETE: ");
                    int dltitem = sc.nextInt();
                    Node ptr4 = head;
                    Node pptr4 = null;
                    if (head.data == dltitem) {
                        System.out.println("Can't delete element before the first element.");
                        break;
                    }
                    while (ptr4 != null && ptr4.next != null && ptr4.next.data != dltitem) {
                        pptr4 = ptr4;
                        ptr4 = ptr4.next;
                    }
                    if (pptr4 == null) {
                        head = head.next; // Handle if the element to delete is the second node
                    } else {
                        pptr4.next = ptr4.next; // Remove the node before the target
                    }                    
                    System.out.println("Element deleted");
                    break;

                case 4: // Deletion after a specific element
                    System.out.println("Enter element after which you want to DELETE: ");
                    int dltitem1 = sc.nextInt();
                    Node ptr5 = head;
                    Node pptr5 = null;
                    while (ptr5 != null && ptr5.data != dltitem1) {
                        pptr5 = ptr5;
                        ptr5 = ptr5.next;
                    }
                    if (ptr5 == null || ptr5.next == null) {
                        System.out.println("Can't delete after the last element or element not found.");
                    } else {
                        ptr5.next = ptr5.next.next;  // Delete the node after ptr5
                    }
                    System.out.println("Element deleted");
                    break;

                default:
                    System.out.println("WRONG CHOICE!");
                    break;
            }
            System.out.println("To CONTINUE OR EXIT (Press 1):");
            bool2 = sc.nextInt() == 1;
        }
        System.out.println("EXITED from Insertion Method");
    }

    public void sll_display() {
        Node temp = head;
        System.out.print("Elements in SLL: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        singly_list sll = new singly_list();
        boolean flag = true;
        Scanner sc = new Scanner(System.in); // Declare and open Scanner in main()

        while (flag) {
            System.out.println("1.SLL CREATION  ||  2.SLL DELETION  ||  3.SLL DISPLAY || 4.EXIT");
            int choice1 = sc.nextInt();
            if (choice1 == 4) break;

            switch (choice1) {
                case 1:
                    sll.sll_creation(sc); // Pass Scanner object to sll_creation
                    break;
                case 2:
                    sll.sll_deletion(sc); // Pass Scanner object to sll_deletion
                    break;
                case 3:
                    sll.sll_display();
                    break;
                default:
                    System.out.println("WRONG CHOICE!");
                    break;
            }
            System.out.println("To CONTINUE OR EXIT (Press 1):");
            flag = sc.nextInt() == 1;
        }
        sc.close(); // Close Scanner at the end
    }
}
