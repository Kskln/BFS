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
  
  
