import com.encore.data.structor.graph.GraphNode;
import com.encore.data.structor.graph.GraphServiceImpl;

public class GraphMain {

	public static void main(String[] args) {
		
		// 1 ~ 6 노드 생성 
		// GraphServiceImpl - makeNode(int data) : GraphNode 
		GraphServiceImpl service = new GraphServiceImpl();
		GraphNode node1 = service.makeNode(1) ;
		GraphNode node2 = service.makeNode(2) ;
		GraphNode node3 = service.makeNode(3) ;
		GraphNode node4 = service.makeNode(4) ;
		GraphNode node5 = service.makeNode(5) ;
		GraphNode node6 = service.makeNode(6) ;
		
		// 생성한(1 ~ 6) 노드의 방향을 연결 
		service.makeEdge(node1, node2); 
		service.makeEdge(node2, node4);
		service.makeEdge(node4, node3);
		service.makeEdge(node3, node5);
		service.makeEdge(node5, node4);
		service.makeEdge(node3, node6);
		service.makeEdge(node4, node1); 
		
		//DFS 탐색.....
		service.dfs(node1);
		
		

	}

}




