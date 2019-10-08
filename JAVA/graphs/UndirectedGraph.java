package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UndirectedGraph {

	public int[][] adj_matrix;
	
	public UndirectedGraph(int[][] G){
		adj_matrix = G;
	}
	
	public UndirectedGraph(int size){
		
		adj_matrix = new int[size][size];
	}
	
	public void addEdge(int u, int v ){
		
		adj_matrix[u][v] = adj_matrix[v][u] = 1;
	}
	
	public void traverse1(){
		boolean[] visit = new boolean[adj_matrix.length];
		
		int nComponent = 1;
		
		// This allows us to traverse all connected components of graph		
		for(int u=0;u<adj_matrix.length;u++)
		{  
			if(visit[u] == false)
			{
				System.out.println("Component-"+nComponent);
				auxTraverse1(u, visit);
				nComponent++;
			}
		}
	}
	public void auxTraverse1(int u,boolean[] visit ){
		
		System.out.println(u);
		visit[u] = true;
		
		for(int v=0;v<adj_matrix.length;++v)
		{
			if(adj_matrix[u][v] == 1 && visit[v] == false)
				auxTraverse1(v, visit);
			
		}
		
	}
	
	public void display() {
		for(int u = 0; u < adj_matrix.length; ++u) {
			for(int v = 0; v < adj_matrix.length; ++v) {
				System.out.print(adj_matrix[u][v]);
			}
			System.out.println();
		}
	}
	public boolean isBipartite()
	{
		boolean res;
		
		int[] visit = new int[adj_matrix.length];
		res = auxBipartite(0,1,visit);
		if(res){
			List<Integer> part1 = new ArrayList<Integer>();
			List<Integer> part2 = new ArrayList<Integer>();
			
			for(int u=0;u<adj_matrix.length;u++)
			{
				if(visit[u]==1)
					part1.add(u);
				else
					part2.add(u);
			}
			System.out.println(part1);
			System.out.println(part2);
			
			
		}
		return res;
	}
	public boolean auxBipartite(int u, int p,int[] visit)
	{
		visit[u] = p;
		System.out.println("p->"+p);
		System.out.println("u->"+u);
		for(int v=0;v<adj_matrix.length;++v)
		{
			if(adj_matrix[u][v]==1)
			{
				if(visit[v] == 0)
				{
					if(!auxBipartite(v,p==1?2:1,visit))
						return false;
				}
				else
				{
					if(visit[v] == p)
						return false;
				}
			}
		}
		return true;
	}
	
	public boolean isBipartite_1(){
		
		int[] visit = new int[adj_matrix.length];
		int V = visit.length; 
	
		for (int i=0; i<V; ++i)
            visit[i] = -1;
		
		visit[0] = 1;
		
		LinkedList<Integer> q = new LinkedList<Integer>();
		q.add(0);
		
		while(q.size()!=0)
		{
			int u = q.poll();
			
			for(int v=0; v<V; ++v){
				if(adj_matrix[u][v] == 1 && visit[v]==-1){
					
				}
				else if (adj_matrix[u][v] == 1 && visit[v]==visit[u])
				{
					return false;
				}
			}
		}
		
		return true;
	}
}
