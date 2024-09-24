import java.util.*;
class GraphOperations {
    List<LinkedList<Integer>> adjacency;

    public GraphOperations(int v) {
        adjacency=new ArrayList<>();
        for (int i=0;i<v;i++) {
            adjacency.add(new LinkedList<>());
        }
    }

    public void insertEdge(int source, int destination) {
        adjacency.get(source).add(destination);
        adjacency.get(destination).add(source);
    }

    public void bfs(int source) {
        boolean[] visitedNode=new boolean[adjacency.size()];
        Queue<Integer> q=new LinkedList<>();

        q.add(source);
        visitedNode[source]=true;
        while (!q.isEmpty()) {
            int p=q.poll();
            System.out.println(p);
            for (int i:adjacency.get(p)) {
                if (!visitedNode[i]) {
                    visitedNode[i]=true;
                    q.add(i);
                }
            }
        }
    }

    public void dfs(int source) {
        boolean[] visitedNode=new boolean[adjacency.size()];
        Stack<Integer> st=new Stack<>();
        st.push(source);
        visitedNode[source]=true;

        while (!st.isEmpty()) {
            int p=st.pop();
            System.out.println(p);
            for (int i:adjacency.get(p)) {
                if (!visitedNode[i]) {
                    visitedNode[i]=true;
                    st.push(i);
                }
            }
        }
    }
    private boolean iscyclicutil(int node,boolean[] visited,int parent){
        visited[node]=true;
        for(int neighbour:adjacency.get(node)){
            if(!visited[neighbour]){
                if(iscyclicutil(neighbour, visited, node)){
                    return true;
                }
            }else if(neighbour!=parent){
                return true;
            }
        }
        return false;
    } 
    public boolean iscyclic(int v){
        boolean[] visited=new boolean[v];
        for(int i=0;i<v;i++){
            if(!visited[i]){
                if(iscyclicutil(i,visited,-1)){
                    return true;
                }
            }
        }
        return false;
    }
}
public class Graph{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of vertices and edges:");
        int v=sc.nextInt();
        int e=sc.nextInt();

        GraphOperations g=new GraphOperations(v);
        System.out.println("Enter edges (source & destination):");
        for (int i=0;i<e;i++) {
            int s=sc.nextInt();
            int d=sc.nextInt();
            g.insertEdge(s,d);
        }

        System.out.println("Do you want to perform traversal? (y/n)");
        char res = sc.next().charAt(0);
        if (res=='y') {
            boolean repeat=true;
            while(repeat) {
                System.out.println("Source vertex for traversal:");
                int tv=sc.nextInt();
                System.out.println("Which type of traversal: 1. BFS || 2. DFS");
                int choice=sc.nextInt();

                switch(choice){
                    case 1:
                        g.bfs(tv);
                        break;
                    case 2:
                        g.dfs(tv);
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }
                System.out.println("\nDo you want to traverse again? (y/n)");
                char again=sc.next().charAt(0);
                if (again!='y') {
                    repeat=false;
                }
            }
        }
        System.out.println("Do you want to cycle detection? (y/n)");
        int cyc=sc.next().charAt(0);
        if(cyc=='y'){
            if(g.iscyclic(v)){
                System.out.println("Cycle detected");
            }else{
                System.out.println("NO cycle detected");
            }
        }
        System.out.println("!FINISHED!");
        sc.close();
    }
}
