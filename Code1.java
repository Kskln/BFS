import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Graph {
  ArrayList<ArrayList<Inтeger>>graph;
  int V;
  Graph(int nodes){
    V=nodes;
    graph=new ArrayList<ArrayList<Integer>>();
    for(int i=0; i<V; i++){
      graph.add(new ArrayList<Integer>());
    }
  }
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
  
  
