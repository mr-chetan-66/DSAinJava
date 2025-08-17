import java.util.*;

public class Heap{
    //MAX HEAP
    public static List<Integer> maxHeap(List<Integer> heap, Scanner sc){
        heap=heapifyAlgo(heap,1);
        System.out.print("\nMax Heap Construction Successful using Heapify: --> ");
        printHeap(heap);

        while(true){
            System.out.print("\n\n1. Array Representation\n2. Insertion\n3. Deletion\n4. Heap sort\n5. EXIT\n==>");
            int opt=sc.nextInt();
            switch (opt){
                case 1:
                    printHeap(heap);
                    break;
                case 2:
                    System.out.print("Enter the element: ");
                    int element=sc.nextInt();
                    insert(heap,element,1);
                    System.out.println("Element insertd successfully!");
                    break;
                case 3:
                    if(heap.size()==0){
                        System.out.println("Heap is Empty....!!!");
                    }
                    delete(heap,1);
                    System.out.println("Element deleted successfully!");
                    break;
                case 4:
                    List<Integer> sortedheap=new ArrayList<>(heap);
                    sortedheap=heapSort(sortedheap,1);
                    System.out.print("sorted array: ");
                    printHeap(sortedheap);
                    break;
                case 5:
                    System.out.println("Exited successfully.");
                    sc.close();
                    return heap;
                default:
                    System.out.println("!! Wrong Option !!\nTry again (press -> y) | EXIT(press any)");
                    String choice = sc.next();
                    if(choice.charAt(0)!='y'){
                        System.out.println("Exited successfully.");
                        sc.close();
                        return heap;
                    }
            }
        }
    }

    //MIN HEAP
    public static List<Integer> minHeap(List<Integer> heap, Scanner sc){
        heap=heapifyAlgo(heap,2);
        System.out.print("\nMin Heap Construction Successful using Heapify: --> ");
        printHeap(heap);

        while(true){
            System.out.print("\n\n1. Array Representation\n2. Insertion\n3. Deletion\n4. Heap sort\n5. EXIT\n==>");
            int opt=sc.nextInt();
            switch (opt){
                case 1:
                    printHeap(heap);
                    break;
                case 2:
                    System.out.print("Enter the element: ");
                    int element = sc.nextInt();
                    insert(heap,element,2);
                    System.out.println("Element insertd successfully!");
                    break;
                case 3:
                    if(heap.size()==0){
                        System.out.println("Heap is Empty....!!!");
                    }
                    delete(heap,2);
                    System.out.println("Element deleted successfully!");
                    break;
                case 4:
                    List<Integer> sortedheap=new ArrayList<>(heap);
                    sortedheap=heapSort(sortedheap,2);
                    System.out.print("sorted array: ");
                    printHeap(sortedheap);
                    break;
                case 5:
                    System.out.println("Exited successfully.");
                    sc.close();
                    return heap;
                default:
                    System.out.println("!! Wrong Option !!\nTry again (press -> y) | EXIT(press any)");
                    String choice = sc.next();
                    if(choice.charAt(0)!='y'){
                        System.out.println("Exited successfully.");
                        sc.close();
                        return heap;
                    }
            }
        }
    }

    //HEAPIFY
    public static List<Integer> heapifyAlgo(List<Integer> heap, int opt){
        int n=heap.size();
        for(int i=(n-2)/2;i>=0;i--){
            heapify(heap,i,n,opt);
        }
        return heap;
    }

    //heapify
    public static void heapify(List<Integer> heap, int i,int n,int opt){
        int l=2*i+1;
        int r=2*i+2;
        if(opt==1){
            int largest=i;

            if(l<n && heap.get(largest)<heap.get(l)){
                largest=l;
            }
            if(r<n && heap.get(largest)<heap.get(r)){
                largest=r;
            }
            if(largest!=i){
                swap(heap, i,largest);
                heapify(heap,largest,n,opt);
            }
        }else{
            int smallest=i;
            if(l<n && heap.get(smallest)>heap.get(l)){
                smallest=l;
            }
            if (r<n && heap.get(smallest)>heap.get(r)){
                smallest=r;
            }
            if(smallest!=i){
                swap(heap, i, smallest);
                heapify(heap, smallest, n, opt);
            }
        }
    }
    public static void swap(List<Integer> heap, int x,int y){
        int temp=heap.get(x);
        heap.set(x,heap.get(y));
        heap.set(y,temp);
    }

    //DELETION
    public static void delete(List<Integer> heap,int opt){
        int n=heap.size();
        if(n==0) return;
        int last=heap.get(n-1);
        heap.set(0,last);
        heap.remove(n-1);
        heapify(heap,0, heap.size(), opt);
    }

    //INSERTION
    public static void insert(List<Integer> heap, int num,int opt){
        heap.add(num);
        int n=heap.size();
        balance(heap, n-1, opt);
    }

    //INSERT BALANCER
    public static void balance(List<Integer> heap, int i,int opt){
        if(i==0) return;
        int parent=(i-1)/2;
        if(opt==1){
            //maxheap
            if(heap.get(i)>heap.get(parent)){
                swap(heap, i,parent);
                balance(heap,parent,opt);
            }

        }else{
            //minheap
            if(heap.get(i)<heap.get(parent)){
                swap(heap, i,parent);
                balance(heap,parent,opt);
            }
        }
    }

    //  HEAP SORT
    public static List<Integer> heapSort(List<Integer> heap, int opt){
        List<Integer> copy=new ArrayList<>(heap);
        List<Integer> res=new ArrayList<>();

        while(!copy.isEmpty()){
            res.add(copy.get(0));
            delete(copy,opt);
        }
        return res;
    }

    //PRINT
    public static void printHeap(List<Integer> heap){
        for(int x:heap){
            System.out.print(x+"\t");
        }
    }

    //MAIN METHOD
    public static void main(String[] s){
        System.out.println("Welcome to Heap");
        Scanner sc=new Scanner(System.in);

        List<Integer> heapMax=new ArrayList<>();
        List<Integer> heapMin=new ArrayList<>();
        System.out.println("Enter the first few element in Heap:\n-----------  STOP=-1  ------------\n");

        while(true){
            System.out.print("=> ");
            int x=sc.nextInt();
            if(-1==x) break;
            heapMax.add(x);
            heapMin.add(x);
        }
        try {
            while (true) {
                System.out.println("\n1. Max Heap\n2. Min Heap\n");
                int opt = sc.nextInt();
                switch (opt) {
                    case 1:
                        heapMax = maxHeap(heapMax, sc);
                        break;
                    case 2:
                        heapMin = minHeap(heapMin, sc);
                        break;
                    default:
                        System.out.println("\n!! Wrong Option !!\nDo you want to choose again, if yes(press -> y)\n");
                        String choice = sc.next();
                        if (choice.charAt(0) != 'y') break;
                }
            }
        }catch(Exception e){
            System.out.println("Error: ");
            e.printStackTrace();
        }finally {
            sc.close();

        }
    }
}