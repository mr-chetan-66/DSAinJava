import java.util.Scanner;

class stackOperations {
    int[] stk;
    int top=-1;
    public void push(Scanner sc){
        do {
            System.out.println("Enter the element");
            int data = sc.nextInt();
            if (top == stk.length - 1) {
                System.out.println("Element cant be Inserted.Stack is full");
                break;
            } else {
                stk[++top] = data;
            }
            System.out.println("To enter the element again(Press 1) :");
        } while (sc.nextInt() == 1);
        System.out.println("Exited from Insertions :");
    }
    public void pop(Scanner sc){
        while(true){
            if(top==-1){
                System.out.println("Stack is empty");
                break;
            }else{
                System.out.println("Element deleted"+stk[top--]);
            }
            System.out.println("To delete the element again(Press 1) :");
            if(sc.nextInt()!=1) break;
        }
        System.out.println("Exited from Deletion :");
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == stk.length - 1;
    }
    public void display(Scanner sc){
        System.out.println("1.Peek Element\t2.Full Stack");
        int mcq=sc.nextInt();
        if(top==-1){
            System.out.println("Stack is empty");
        }else{
            if(mcq==1){
                System.out.println("Element at TOP (Peek Element) :"+stk[top]);
            }else{
                System.out.println("Stack:");
                int ptr=top;
                System.out.println(stk[ptr--]+"<-TOP");
                while(ptr!=-1) {
                    System.out.println(stk[ptr--]);
                }
            }
        }
    }
}
public class stack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stackOperations s = new stackOperations();
        System.out.println("Enter the size of the stack: ");
        int size = sc.nextInt();
        s.stk = new int[size];
        System.out.println("Stack Created !");

        while(true) {
            System.out.println("1.Insert\t2.Delete\t3.Display\t4.isEmpty\t5.isFull\t6.EXIT");
            int choice=sc.nextInt();
            if(choice == 6) break;
            switch (choice){
                case 1:
                    s.pop(sc);
                    break;
                case 2:
                    s.push(sc);
                    break;
                case 3:
                    s.display(sc);
                    break;
                case 4:
                    System.out.println(s.isEmpty()?"TRUE":"FALSE");
                    break;
                case 5:
                    System.out.println(s.isFull()?"TRUE":"FALSE");
                    break;
                default:
                    System.out.println("Wrong choice!");
                    break;
            }
            System.out.println("To CONTINUE or EXIT (Press1)");
            if(sc.nextInt()!=1) break;
        }
        System.out.println("Exit from Stack");
        sc.close();
    }
}