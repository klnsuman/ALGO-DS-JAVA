package graphs;
import java.util.*;
public class TestGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		testRandomGraph(n);
	}

	public static void testRandomGraph(int n) {
		UndirectedGraph graph1 = new UndirectedGraph(n);
		Random r = new Random(100);
		for(int i = 0; i < n; ++i) {
			int u = r.nextInt(n);
			System.out.println("u->"+u);
			int v = r.nextInt(n);
			System.out.println("v->"+v);
			if(u != v)
				graph1.addEdge(u, v);
		}
		graph1.display();
		graph1.traverse1();
		graph1.display();
		System.out.println("-------");
		//graph1.addEdge(0,1);
		//graph1.addEdge(0,2);
		
		
		
		if(graph1.isBipartite())
				System.out.println("Yes Bipartite");
		else
			System.out.println("No Not Bipartite");
		
		if(graph1.isBipartite_1())
			System.out.println("YesSSSS Bipartite");
	else
		System.out.println("No Not Bipartite");
		
		int G[][] = {{0, 1, 0, 1},
	            {1, 0, 1, 0},
	            {0, 1, 0, 1},
	            {1, 0, 1, 0}
	        };
		
		UndirectedGraph graph2 = new UndirectedGraph(G);
		
		
		if(graph2.isBipartite())
				System.out.println("Yes Bipartite");
		else
			System.out.println("No Not Bipartite");
		
		if(graph2.isBipartite_1())
			System.out.println("YesSSSS Bipartite");
		else
		System.out.println("No Not Bipartite");
		
		graph2.display();
		
	}
}
