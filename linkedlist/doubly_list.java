import java.util.Scanner;

public class doubly_list {
    static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
            this.next=null;
            this.prev=null;
        }
    }

    Node head=null;
    Node tail=null;

    public void dll_creation(Scanner sc) {
        boolean bool = true;
        while (bool) {
            System.out.println("Insert AT: 1. Beginning 2. End 3. Before 4. After 5. EXIT");
            int choice = sc.nextInt();
            if (choice == 5) {
                break;
            }
            System.out.println("Enter the element:");
            int nodedata = sc.nextInt();
            Node nn = new Node(nodedata);

            if (head == null) {
                head = nn;
                tail=nn;
                nn.next = null;
                nn.prev=null;
            } else {
                switch (choice) {
                    case 1: // Insert at the beginning
                        nn.next = head;
                        nn.prev=null;
                        head.prev = nn;
                        head=nn;
                        break;

                    case 2: // Insert at the end
                        nn.next=null;
                        nn.prev=tail;
                        tail.next=nn;
                        tail=nn;
                        break;

                    case 3: // Insert before a specific element
                        System.out.println("Enter element before which you want to INSERT: ");
                        int nodeval = sc.nextInt();
                        Node ptr1 = head;
                        while (ptr1 != null && ptr1.val != nodeval) {
                            ptr1 = ptr1.next;
                        }
                        if (ptr1 == null) {
                            System.out.println("Element not found!");
                        } else if (ptr1.prev == null) { // inserting before head
                            nn.next = head;
                            nn.prev=null;
                            head.prev=nn;
                            head = nn;
                        } else {
                            nn.next=ptr1;
                            nn.prev=ptr1.prev;
                            ptr1.prev.next=nn;
                            ptr1.prev=nn;
                        }
                        break;

                    case 4: // Insert after a specific element
                        System.out.println("Enter element after which you want to INSERT: ");
                        int node1 = sc.nextInt();
                        Node ptr2 = head;

                        while (ptr2 != null && ptr2.val != node1) {
                            ptr2 = ptr2.next;
                        }

                        if (ptr2 == null) {
                            System.out.println("Element not found!");
                        } else {
                            nn.next = ptr2.next;
                            nn.prev=ptr2;
                            ptr2.next.prev=nn;
                            ptr2.next=nn;
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

    public void dll_deletion(Scanner sc) {
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
                    head=head.next;
                    head.prev=null;
                    System.out.println("Element deleted");
                    break;

                    case 2: // Deletion from the end
                    if (head.next == null) { // If there is only one node
                        head = null;
                        tail=null;
                    } else {
                        tail=tail.prev;
                        tail.next=null;
                    }
                    System.out.println("Element deleted");
                    break;                

                case 3: // Deletion before a specific element
                    System.out.println("Enter element before which you want to DELETE: ");
                    int dltitem = sc.nextInt();
                    Node ptr4 = head;
                    if (head.val == dltitem) {
                        System.out.println("Can't delete element before the first element.");
                        break;
                    }
                    while (ptr4 != null && ptr4.next != null && ptr4.next.val != dltitem) {
                        ptr4 = ptr4.next;
                    }
                    if (ptr4.prev == null) {
                        head = head.next; // Handle if the element to delete is the second node
                        head.prev=null;
                    } else {
                        ptr4.prev.next=ptr4.next;// Remove the node before the target
                        ptr4.next.prev=ptr4.prev;
                        ptr4.next=null;
                        ptr4.prev=null;
                    }                    
                    System.out.println("Element deleted");
                    break;

                case 4: // Deletion after a specific element
                    System.out.println("Enter element after which you want to DELETE: ");
                    int dltitem1 = sc.nextInt();
                    Node ptr5 = head;
                    while (ptr5 != null && ptr5.val != dltitem1) {
                        ptr5 = ptr5.next;
                    }
                    if (ptr5 == null || ptr5.next == null) {
                        System.out.println("Can't delete after the last element or element not found.");
                    }else if(ptr5==tail){
                        tail=tail.prev;
                        tail.next=null;
                    }
                    else {
                        ptr5.next.next.prev=ptr5;
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
    
    public void dll_display(){
        Node temp = head;
        System.out.print("Elements in DLL: ");
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        doubly_list dll = new doubly_list();
        boolean flag = true;
        Scanner sc = new Scanner(System.in); // Declare and open Scanner in main()
        while (flag) {
            System.out.println("1.DLL INSERTION  ||  2.DLL DELETION  ||  3.DLL DISPLAY || 4.EXIT");
            int choice1 = sc.nextInt();
            if (choice1 == 4) break;

            switch (choice1) {
                case 1:
                    dll.dll_creation(sc); // Pass Scanner object to sll_creation
                    break;
                case 2:
                    dll.dll_deletion(sc); // Pass Scanner object to sll_deletion
                    break;
                case 3:
                    dll.dll_display();
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
