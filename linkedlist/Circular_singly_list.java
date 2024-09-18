import java.util.Scanner;

public class Circular_singly_list {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    Node tail=null;

    public void insert(Scanner sc) {
        while (true) {
            System.out.println("Insert AT: 1. Beginning 2. End 3. Before 4. After 5. EXIT");
            int choice = sc.nextInt();
            if (choice == 5) break;
            System.out.println("Enter the element: ");
            int nodedata = sc.nextInt();
            Node nn = new Node(nodedata);

            if (head == null) {
                head = nn;
                nn.next = head;
                tail=nn;
            } else {
                switch (choice) {
                    case 1: // Insert at the beginning
                        nn.next = head;
                        head = nn;
                        tail.next=head;
                        break;

                    case 2: // Insert at the end
                        tail.next = nn;
                        nn.next=head;
                        tail=nn;
                        break;

                    case 3: // Insert before a specific element
                        System.out.println("Enter element before which you want to INSERT: ");
                        int node = sc.nextInt();
                        if(head.data==node){
                            nn.next = head;
                            head = nn;
                            tail.next=head;
                            break;
                        }else{
                            Node ptr1 = head, pptr1 = null;

                            while (ptr1.next != head && ptr1.data != node) {
                                pptr1 = ptr1;
                                ptr1 = ptr1.next;
                            }
                            if(ptr1.data==node){
                                nn.next = ptr1;
                                if(pptr1!=null) pptr1.next=nn;
                            }else{
                                System.out.println("Element not found!");
                            }
                        }
                        break;

                    case 4: // Insert after a specific element
                        System.out.println("Enter element after which you want to INSERT: ");
                        int node1 = sc.nextInt();
                        Node ptr2 = head;
                        do{
                            if(ptr2.data==node1){
                                nn.next = ptr2.next;
                                ptr2.next=nn;
                                if(ptr2==tail) tail=nn;
                            }
                            ptr2=ptr2.next;
                        }while(ptr2!=head);
                        break;

                    default:
                        System.out.println("WRONG CHOICE!");
                        break;
                }
            }
            System.out.println("To CONTINUE OR EXIT (Press 1):");
            if(sc.nextInt() != 1) break;
        }
        System.out.println("EXITED from Insertion Method");
    }

    public void delete(Scanner sc) {
        if (head == null) {
            System.out.println("NO LL EXISTS");
            return;
        }

        while (true) {
            System.out.println("Delete FROM: 1. Beginning 2. End 3. Before 4. After 5.EXIT");
            int choice2 = sc.nextInt();
            if (choice2 == 5) break;

            switch (choice2) {
                case 1: // Deletion from the beginning
                    if(head==tail){
                        head=null;
                        tail=null;
                    }else {
                        head = head.next;
                        tail.next = head;
                        System.out.println("Element deleted");
                    }
                    break;

                case 2: // Deletion from the end
                    if (head==tail) { // If there is only one node
                        head = null;
                        tail=null;
                    } else {
                        Node ptr3 = head;
                        while (ptr3.next.next != tail) {
                            ptr3 = ptr3.next;
                        }
                        ptr3.next=head;
                        tail=ptr3;
                    }
                    System.out.println("Element deleted");
                    break;

                case 3: // Deletion before a specific element
                    System.out.println("Enter element before which you want to DELETE: ");
                    int dltitem = sc.nextInt();
                    if (head.data == dltitem) {
                        System.out.println("Can't delete element before the first element.");

                    }else{
                        Node ptr4 = head,pptr4 = null;
                        while (ptr4.next!= head && ptr4.next.data != dltitem) {
                            pptr4 = ptr4;
                            ptr4 = ptr4.next;
                        }
                        if (ptr4.next.data==dltitem) {
                            if(pptr4==null){
                                head=head.next;
                                tail.next=head;
                            }else{
                                pptr4.next=ptr4.next;
                            }
                        } else {
                            System.out.println("Element not found!");
                        }
                        System.out.println("Element deleted");
                    }

                    break;

                case 4: // Deletion after a specific element
                    System.out.println("Enter element after which you want to DELETE: ");
                    int dltitem1 = sc.nextInt();
                    Node curr = head;
                    do {
                        if (curr.data == dltitem1) {
                            if (curr.next == head) {
                                System.out.println("Can't delete after the last element.");
                                break;
                            } else {
                                curr.next = curr.next.next;
                                if (curr.next == head) tail = curr; // Update tail if the last element is deleted
                            }
                            break;
                        }
                        curr = curr.next;
                    } while (curr != head);
                    System.out.println("Element deleted after " + dltitem1);
                    break;

                default:
                    System.out.println("WRONG CHOICE!");
                    break;
            }
            System.out.println("To CONTINUE OR EXIT (Press 1):");
            if(sc.nextInt() != 1) break;
        }
        System.out.println("EXITED from Deletion Method");
    }

    public void show() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node temp = head;
        System.out.print("Elements in CSLL: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        Circular_singly_list csll = new Circular_singly_list();
        boolean flag = true;
        Scanner sc = new Scanner(System.in); // Declare and open Scanner in main()

        while (flag) {
            System.out.println("1.INSERTION  ||  2.DELETION  ||  3.DISPLAY || 4.EXIT");
            int choice1 = sc.nextInt();
            if (choice1 == 4) break;

            switch (choice1) {
                case 1:
                    csll.insert(sc); // Pass Scanner object to sll_creation
                    break;
                case 2:
                    csll.delete(sc); // Pass Scanner object to sll_deletion
                    break;
                case 3:
                    csll.show();
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
