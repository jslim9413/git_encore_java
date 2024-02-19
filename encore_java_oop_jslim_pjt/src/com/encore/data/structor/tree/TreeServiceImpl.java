package com.encore.data.structor.tree;

public class TreeServiceImpl {
	public TreeServiceImpl() {
	}
	
	public TreeNode makeTree(int data , TreeNode leftNode , TreeNode rightNode) { 

		// case01.
		// TreeNode node = new TreeNode(data, leftNode, rightNode);
		
		// case02
		TreeNode node = new TreeNode(data);
		node.setLeftNode(leftNode);
		node.setRightNode(rightNode); 
		
		return node ; 
	}
	// 전위순회( 뿌리 -> 왼쪽자식 -> 오른쪽자식)
	// 0	1	3	7	8	4	9	10	2	5	11	6	
	public void preOrder(TreeNode node) {
		if(node != null) {
			System.out.print(node.getData()+"\t");
			preOrder(node.getLeftNode());
			preOrder(node.getRightNode()); 
			// System.out.println(node.getLeftNode().getLeftNode().getData());
			// System.out.println(node.getRightNode().getLeftNode().getData());
		}
	}
	// 중위순회( 왼쪽자식 -> 뿌리 -> 오른쪽자식)
	// 7	3	8	1	9	4	10	0	11	5	2	6	
	public void inOrder(TreeNode node) {
		if(node != null) {
			inOrder(node.getLeftNode());
			System.out.print(node.getData()+"\t");
			inOrder(node.getRightNode()); 
		}
	}
	// 후위순회( 왼쪽자식 -> 오른쪽자식 -> 뿌리)
	// 7	8	3	9	10	4	1	11	5	6	2	0	
	public void postOrder(TreeNode node) {
		if(node != null) {
			postOrder(node.getLeftNode());
			postOrder(node.getRightNode());
			System.out.print(node.getData()+"\t");
		}
	}
}







