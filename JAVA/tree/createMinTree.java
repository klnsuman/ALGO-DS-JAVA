package treeproblems;
/* 
 * Create Minimal Tree based on Sorted Array
 * */

class TreeNode{
	
	int data;
	TreeNode left,right;
	
	public TreeNode(){
		
	}
	public TreeNode(int data){
		this.data = data;
		this.left = this.right = null;
	}
}

public class createMinTree{
	
	public static TreeNode root;
	
	public static void createMinBST(int[] array)
	{
		root = createMinBST(array,0,array.length-1);		
	}
	
	public static TreeNode createMinBST(int[] array,int start, int end)
	{		
		
		if(start>end) return null;
		
		int mid = (start+end)/2;
		
		TreeNode n = new TreeNode(array[mid]); 
		
		n.left = createMinBST(array,start,mid-1);
		n.right = createMinBST(array,mid+1,end);
		return n;
	}
	public static void display(TreeNode root)
	{
		display(root,0,"root");		
	}
	
	public static boolean isBST()
	{
		if(root == null) return false;
		
		return true;
	}
	public static void display(TreeNode root,int nSpaces,String type)
	{
		if(root == null) return;
		for(int i=0;i<nSpaces ; i++)
			System.out.print(' ');
		
		System.out.println(root.data+"("+type+")");
		display(root.left , nSpaces+4,"L");
		display(root.right , nSpaces+4,"R");
	}
	public static void main(String[] args){
		int[] array = {5,6,7,8,9,10};
		createMinBST(array);
		
		display(root);
	}
}