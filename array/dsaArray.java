import java.util.Scanner;

public class dsaArray{
    static int current=0;

    //INSERTION METHOD
    public static int[] arrayInsertion(int[] array, int n) {
        Scanner sc = new Scanner(System.in);
        boolean continueInsertion = true;
        while (continueInsertion) {
            if (current == n) {
                System.out.println("ALERT!->Array is full");
                return array;
            }
    
            System.out.println("Where do you want to Insert:");
            System.out.println("1.End\t2.PositionAT\t3.Beginning\t4.QUIT");
            int ipos = sc.nextInt();
            int insertValue=0;
            if(ipos!=4){
                System.out.println("Enter value:");
                insertValue = sc.nextInt();
            }
            switch (ipos) {
                case 1:
                    // Inserting at the end
                    array[current++] = insertValue;
                    break;
    
                case 2:
                    // Inserting at a specific position
                    System.out.println("Enter index position:");
                    int insertPos = sc.nextInt();
                    if (insertPos > current || insertPos < 0) {
                        System.out.println("!INVALID INDEX!");
                        break;
                    }
                    // Shift elements to the right to make space for the new value
                    for (int i = current; i > insertPos; i--) {
                        array[i] = array[i - 1];
                    }
                    array[insertPos] = insertValue;
                    current++;
                    break;

                case 3:
                    // Inserting at the beginning
                    for (int i = current; i > 0; i--) {
                        array[i] = array[i - 1];
                    }
                    array[0] = insertValue;
                    current++;
                    break;

                case 4:
                    System.out.println("!EXITED from Insertion!");
                    return array;

                default:
                    System.out.println("!INVALID CHOICE!");
                    break;
            }
            System.out.println("To CONTINUE OR QUIT (Press 1)");
            continueInsertion = sc.nextInt() == 1;
        }
        return array;
    }    
     //DELETION METHOD
    public static int[] arrayDeletion(int[] array) {
        Scanner sc = new Scanner(System.in);
        boolean continueDeletion = true;
        while (continueDeletion) {
            if (current == 0) {
                System.out.println("ALERT!->Array is empty");
                return array;
            }
    
            System.out.println("Where do you want to perform deletion:");
            System.out.println("1.End\t2.PositionAT\t3.Beginning\t4.QUIT");
            int dpos = sc.nextInt();
    
            switch (dpos) {
                case 1:
                    // Deleting from the end
                    array[--current] = 0;
                    System.out.println(" 1st Element DELETED");
                    break;
    
                case 2:
                    // Deleting from a specific position
                    System.out.println("Enter index position:");
                    int delPos = sc.nextInt();
                    if (delPos >= current || delPos < 0) {
                        System.out.println("!INVALID INDEX!");
                        break;
                    }
                    // Shift elements to the left after deletion
                    for (int i = delPos; i < current - 1; i++) {
                        array[i] = array[i + 1];
                    }
                    array[--current] = 0;
                    System.out.println(delPos+" index Element DELETED");
                    break;
    
                case 3:
                    // Deleting from the beginning
                    for (int i = 0; i < current - 1; i++) {
                        array[i] = array[i + 1];
                    }
                    array[--current] = 0;
                    System.out.println("Last Element DELETED");
                    break;
                    
                case 4:
                    System.out.println("!EXITED from Deletion!:");
                    return array;
    
                default:
                    System.out.println("!INVALID CHOICE!");
                    break;
            }
            System.out.println("To CONTINUE OR QUIT (Press 1)");
            continueDeletion = sc.nextInt() == 1;
        }
        return array;
    }
   //SORTING METHOD
    public static int[] arraySorting(int[] array){
        Scanner sc=new Scanner(System.in);
        System.out.println("Which sorting do you want to perform on array:");
        System.out.println("1.Insertion Sort \t2.Bubble Sort");
        int sortqn=sc.nextInt();
        switch(sortqn){
            case 1:
                for(int a=1;a<current;a++){
                    int temp=array[a];
                    int b=a-1;
                    while(b>=0 && temp<array[b]){
                        array[b+1]=array[b];
                        b--;
                    }
                    array[b+1]=temp;
                }
                break;
            case 2:
                for(int c=0;c<current;c++){
                    for(int d=0;d<current-1-c;d++){
                        if(array[d]>array[d+1]){
                            int tmp=array[d];
                            array[d]=array[d+1];
                            array[d+1]=tmp;
                        }
                    }
                }
                break;
            default:
                System.out.println("! INVALID CHOICE !");
                break;  
        }
        System.out.println("! SORTED !");
        return array;
    }

    public static void arrayDisplay(int[] array){
        System.out.println("Element of ARRAY:");
        for(int j=0;j<current;j++){
            System.out.println(array[j]);
        }
    }

    public static void arrayFunction(int[] array,int n){
        Scanner sc=new Scanner(System.in);
        boolean bool=true;
        while(bool){
            System.out.println("Which operation do you want to perform on array:");
            System.out.println("1.Insertion\t2.Deletion\t3.Sorting\t4.Display\t5.QUIT");
            int c = sc.nextInt();
            switch(c){
                case 1:
                    array=arrayInsertion(array,n);
                    break;
                case 2:
                    array=arrayDeletion(array);
                    break;
                case 3:
                    array=arraySorting(array);
                    break;
                case 4:
                    arrayDisplay(array);
                    break;
                case 5:
                System.out.println("!EXITED !");
                    return;
                default:
                    System.out.println("! INVALID CHOICE !");
                    break;  
            }
            System.out.println("To CONTINUE OR QUIT (Press 1)");
            bool=(sc.nextInt()==1);
        }
        sc.close();
    }
    public static void main(String[] s){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.println("Array has been created of size:"+size);
        System.out.println(" ");
        arrayFunction(array,size);
    }
}
