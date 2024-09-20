import java.util.Scanner;
public class CircularDoublyLL{
    static class Node{
        int val ;
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
    public void insert(Scanner sc){
        while(true){
            System.out.println("1.Beginning ||2.End ||3.After ||4.Before ||5.Exit");
            int ichoice=sc.nextInt();
            if(ichoice==5){
                break;
            }else{
                System.out.println("Enter Element :");
                int data=sc.nextInt();
                Node nn=new Node(data);
                if(head==null){
                    head=tail=nn;
                    nn.next=nn.prev=head;                    
                }else{
                    switch (ichoice) {
                        case 1:   //BEG
                        nn.next=head;
                        nn.prev=tail;
                        head.prev=nn;
                        head=nn;
                        tail.next=nn;
                        break;    
                        case 2:   //END
                        nn.next=head;
                        nn.prev=tail;
                        tail.next=nn;
                        head.prev=nn;
                        tail=nn;
                        break;
                        case 3:   //AFTER
                        System.out.println("Enter element after you want to insert :");
                        int ainsert=sc.nextInt();
                        Boolean found=false;
                        Node cur=head;
                        do{
                            if(cur.val==ainsert){
                                nn.next=cur.next;
                                nn.prev=cur;
                                cur.next.prev=nn;
                                cur.next=nn;
                                if(cur==tail) {
                                    tail=nn;
                                }
                                found=true;
                                break;
                            }
                            cur=cur.next;
                        }while(cur!=head);
                        if(!found){
                            System.out.println("Element not in the list!");
                        }
                        break;
                        case 4:   //BEFORE
                        System.out.println("Enter element before you want to insert :");
                        int binsert=sc.nextInt();
                        if(head.val==binsert){
                            nn.next=head;
                            nn.prev=tail;
                            head.prev=nn;
                            head=nn;
                            tail.next=nn;
                            break;
                        }else{
                            Node front=head;
                            boolean inserted=false;
                            do{
                                if(front.next.val==binsert){
                                    nn.next=front.next;
                                    nn.prev=front;
                                    front.next=nn;
                                    nn.next.prev=nn;
                                    inserted=true;
                                    break;
                                }
                                front=front.next;
                            }while(front!=head);
                            if(!inserted){
                                System.out.println("Element not found !");
                            }
                        }
                    }
                }
            }
            System.out.println("To Continue or Exit(Press 1)");
            if(sc.nextInt()!=1) break;
        }
        System.out.println("Exited from Insertion !");
    }
    public void delete(Scanner sc){
        while(true){
            System.out.println("1.Beginning ||2.End ||3.After ||4.Before ||5.Exit");
            int dltchoice=sc.nextInt();
            if(dltchoice==5){
                break;
            }else{
                if(head==null){   
                    System.out.println("List is empty!");
                }else{
                    switch (dltchoice) {
                        case 1:   //BEG
                        tail.next=head.next;
                        head=head.next;
                        head.prev=tail;
                        break;    
                        case 2:   //END
                        tail=tail.prev;
                        tail.next=head;
                        break;
                        case 3:   //AFTER
                        System.out.println("Enter element after you want to delete :");
                        int adel=sc.nextInt();
                        Boolean dfound=false;
                        Node curr=head;
                        do{
                            if(curr.val==adel){
                                if(curr==tail) {
                                    System.out.println("Cant delete after last element !");
                                    break;
                                }
                                if(curr.next==tail) tail=curr;
                                curr.next=curr.next.next;
                                curr.next.prev=curr;
                                dfound=true;
                                break;
                            }
                            curr=curr.next;
                        }while(curr!=head);
                        if(!dfound){
                            System.out.println("Element not in the list!");
                        }
                        break;
                        case 4:   //BEFORE
                        System.out.println("Enter element before you want to delete :");
                        int bdel=sc.nextInt();
                        if(head.val==bdel){
                            System.out.println("Cant delete before first element!");
                            break;
                        }else{
                            Node current=head;
                            boolean deleted=false;
                            do{
                                if(current.next.val==bdel){
                                    current.next.prev=current.prev;
                                    current.prev.next=current.next;
                                    deleted=true;
                                    break;
                                }
                                current=current.next;
                            }while(current!=head);
                            if(!deleted){
                                System.out.println("Element not found !");
                            }
                        }
                    }
                }
            }
            System.out.println("To Continue or Exit(Press 1)");
            if(sc.nextInt()!=1) break;
        }
        System.out.println("Exited from Deletion!");
    }
    public void show(){
        if(head==null){
            System.out.println("List not Exist!");
        }else{
            Node ptr=head;
            System.out.print("Elements in list :");
            do{
                System.out.println(ptr.val+" ");
                ptr=ptr.next;
            }while(ptr!=head);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("!! This is Circular Doubly Linkedlist !!\n");
        CircularDoublyLL cdll=new CircularDoublyLL();
        while(true){
            System.out.println("1.INSERTION ||2.DELETION ||3.DISPLAY ||4.EXIT");
            int choice=sc.nextInt();
            if(choice==4) {
                break;
            }
            switch(choice){
                case 1:
                cdll.insert(sc);
                break;
                case 2:
                cdll.delete(sc);
                break;
                case 3:cdll.show();
                break;
                default:
                System.out.println("INVALID CHOICE!");
                break;
            }
            System.out.println("To Continue or Exit(Press 1)");
            if(sc.nextInt()!=1) break;
        }
        System.out.println("EXITED FROM PROGRAM !");
        sc.close();
    }
}