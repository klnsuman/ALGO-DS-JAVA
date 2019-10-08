package trees;
import java.util.Stack;
public class treeTraversals {
	
	static class TreeNode{
		
		int data;
		TreeNode left,right;
		TreeNode(){}
		TreeNode(int data){
			this.data = data;
			this.left = this.right = null;
 		}
		
	}
	
	public static void display(TreeNode current) {
		auxDisplay(current,0,"Root");
	}
	
	public static void auxDisplay(TreeNode current,int nSpaces,String type) {
		if(current == null) {
			return ;
		}
		for(int i=0;i<nSpaces;i++) {
			System.out.print(' ');
		}
		System.out.println(current.data+" ("+type+")");
		auxDisplay(current.left,nSpaces+4,"L");
		auxDisplay(current.right,nSpaces+4,"R");
		
	}
	
	/*
	 *  Pre-Order Traversal
	 */
	public static void preOrderIter(TreeNode current) {
		
		Stack<TreeNode> st = new Stack<TreeNode>();
		
		while(true) {
			TreeNode temp;
			while(current!=null) {
			    temp = current;
				st.push(temp);
				System.out.println(current.data);
				current = current.left;
			}
			if(st.isEmpty()) break;
			current = st.pop().right;
		}
	}
	
	/*  End Pre-Order Traversal */
	
	/*
	 *  In-Order Traversal
	 */
	public static void inOrderIter(TreeNode current) {
		
		Stack<TreeNode> st = new Stack<TreeNode>();
		
		while(true) {
			TreeNode temp;
			while(current!=null) {
			    temp = current;
				st.push(temp);
				
				current = current.left;
			}
			if(st.isEmpty()) break;
			
			current = st.pop();
			System.out.println(current.data);
			current = current.right;
		}
	}
	
	/*  End In-Order Traversal */
	
	/*
	 *  Post-Order Traversal
	 */
	public static void postOrderIter(TreeNode current) {
		
		Stack<TreeNode> st1 = new Stack<TreeNode>();
		Stack<TreeNode> st2 = new Stack<TreeNode>();
		
		st1.push(current);
		
		while(!st1.isEmpty())
		{
			
			TreeNode temp = st1.pop();
			st2.push(temp);
			
			if(temp.left!=null)
				st1.push(temp.left);
			if(temp.right!=null)
				st1.push(temp.right);
			
		}
		
		while(!st2.isEmpty()) {
			TreeNode tmp = st2.pop();
			System.out.println(tmp.data);
		}
		
		
	}
	
	/*  End Post-Order Traversal */
	
	/* Post Order Recursive */
	public static void postOrderRec(TreeNode current) {
		if(current==null) return;
		postOrderRec(current.left);
		postOrderRec(current.right);
		System.out.println(current.data);
	}
	/* Post Order Recursive */
	
	public static void main(String[] args) {
		TreeNode t = new TreeNode(1);
		t.left = new TreeNode(2);
		t.right = new TreeNode(3);
		
		t.left.left = new TreeNode(4);
		t.left.right = new TreeNode(5);
		
		t.right.left = new TreeNode(6);
		t.right.right = new TreeNode(7);
		display(t);
		
		preOrderIter(t);
		System.out.println(" =============== ");
		inOrderIter(t);
		System.out.println(" =============== ");
		postOrderIter(t);
		System.out.println(" =============== ");
		postOrderRec(t);
	}
}
