import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//Define a Graph class
class Graph {
  ArrayList<ArrayList<Integer>>graph;
  int V;
  Graph(int nodes){
    V=nodes;
    graph=new ArrayList<ArrayList<Integer>>();
    for(int i=0; i<V; i++){
      graph.add(new ArrayList<Integer>());
    }
  }
  
  //Methods for add egde and print graph
  void addEdge(int v, int u){
    graph.get(v).add(u);
    graph.get(u).add(v);
    
  }
  void printGraph(){
    for(int i = 0;i<V;i++){
      System.out.println("Node"+i);
      for (int x:graph.get(i))System.out.print(" -> "+x);
    }
  }
  //Breadth First Search method
  void BFS(int start){
    boolean visited[]=new boolean[V];
    Queue<Integer> q = new LinkedList<Integer>();
    q.add(start);
    System.out.println("BFS");
    visited[start] = true ;
    while(q.isEmpty()==false){
      int node = q.poll();
      System.out.println(node+ " ");
      for(int x:graph.get(node)){
        if(visited[x]==false){
          visited[x]=true;
          q.add(x);
        }
      }
    }
  }
}

//Main class Graph1 with our methods     
public class Graph1{
  public static void main (String args[]){
    Graph g = new Graph(5);
    g.addEdge(0,1);
    g.addEdge(3,2);
    g.addEdge(2,4);
    g.addEdge(1,4);
    g.addEdge(3,1);
    g.addEdge(2,0);
    g.printGraph();
    System.out.println();
    g.BFS(0);
  }
}
  
  
