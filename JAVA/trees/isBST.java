package trees;

public class isBST {
	
	static class TreeNode{
		int data;
		TreeNode left,right;
		TreeNode(){
			
		}
		TreeNode(int data){
			this.data = data;
			this.left = this.right = null;
		}
	}
	
	public static boolean isBST(TreeNode current) {
		if(current == null) return true;
		
		if(current.left!=null && current.left.data > current.data) return false;
		
		if(current.right!=null && current.right.data < current.data) return false;
		
		if(!isBST(current.left) && !isBST(current.right)) return false;
			
		return true;
	}
	
	public static boolean isBST1(TreeNode current) {
		
		return isAuxBST1(current,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	public static boolean isAuxBST1(TreeNode current,int min,int max) {
		
		
		return true;
	}
	public static void main(String[] args) {
		TreeNode t = new TreeNode(3);
		t.left = new TreeNode(2);
		t.right = new TreeNode(5);
		
		t.left.left = new TreeNode(1);
		t.left.right = new TreeNode(4);
		
		if(isBST(t))
			System.out.println("True!!!!");
		else
			System.out.println("False!!!!");
	}
}
