package com.encore.data.structor.graph;

public class GraphServiceImpl {

	public GraphServiceImpl() {
	}
	
	public GraphNode makeNode(int data) {
		GraphNode node = new GraphNode(data);
		return node ; 
	}
	
	public void makeEdge(GraphNode idxNode, GraphNode corNode) {
		idxNode.getCorLst().add(corNode) ; 
	}
	
	// 재귀호출이 필요하고
	// Iterator 
	// 방문을 체크 
	public void dfs(GraphNode node) {
		System.out.println(node.getData()+"\t"); 
	}
	
}






