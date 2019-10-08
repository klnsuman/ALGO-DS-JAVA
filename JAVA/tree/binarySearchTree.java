package binarySerachTree;
import java.util.Random;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class binarySearchTree{
	public static TreeNode root;
	private static int maxSum = Integer.MIN_VALUE;
	
	public static int maxPathSum(TreeNode root)
	{
		auxPathSum(root,0);
		return maxSum;
	}
	
	public static void auxPathSum(TreeNode current,int cSum)
	{
		if(current == null) return;
		if(current.left == null && current.right == null)
		{
			maxSum = Math.max(maxSum,cSum+current.data);
			return;
		}
		auxPathSum(current.left,cSum+current.data);
		auxPathSum(current.right,cSum+current.data);
	}
	public static int maxPathSum1(TreeNode root)
	{
		if(root == null) return 0;
		int lpSum = maxPathSum1(root.left);
		int rpSum = maxPathSum1(root.right);
		return Math.max(lpSum, rpSum) + root.data;
	}
	public static void createTree(Integer data)
	{
		if(root == null)
		{
			root =  new TreeNode(data);
			return;
		}//System.out.println(data);
		createTree(data,root);
	}
	public static void createTree(Integer data,TreeNode current)
	{		
		if(data<current.data)
		{
			if(current.left!= null)
			{
				createTree(data,current.left);
				return;				
			}
			
			current.left = new TreeNode(data);
		}
		else if(data == current.data){
			return ;
		}
		else
		{
			if(current.right!= null)
			{
				createTree(data,current.right);
				return;
			}
			
			current.right = new TreeNode(data);
		}
	}
	
	public static void display(TreeNode root)
	{
		auxDisplay(root,0,"root");
	}
	public static void auxDisplay(TreeNode root,int nSpaces,String type)
	{
		if(root == null) return;
		for(int i=0;i<nSpaces;i++)
			System.out.print(' ');
		System.out.println(root.data+"("+type+")");
		auxDisplay(root.left,nSpaces+4,"L");
		auxDisplay(root.right,nSpaces+4,"R");
	}
	
	public static void display1(TreeNode root)
	{
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		q.add(null);
		int depth=0;
		while(!q.isEmpty())
		{
			TreeNode current = q.remove();
			if(current == null)
			{	
				++depth;
				System.out.println();
				if(!q.isEmpty())
					q.add(null);
			}
			else
			{
				System.out.print(current.data+" ");
				if(current.left!=null)
					q.add(current.left);
				if(current.right!=null)
					q.add(current.right);
			}
			
		}
		System.out.println("Depth->"+depth);
	}
	
	public static int getDepth1(TreeNode root)
	{
		if(root == null) return 0;
		if(root.left == null && root.right == null) return 1;
		int lh = getDepth1(root.left);
		int rh = getDepth1(root.right);
		
		return Math.max(lh,rh)+1;
	}
	/* pre-order Traversal*/
	public static void rec1(TreeNode current)
	{
		if(current == null) return;
			System.out.print(current.data+" ");
		rec1(current.left);
		rec1(current.right);
	}
	/* in-order Traversal*/
	public static void rec2(TreeNode current)
	{
		if(current == null) return;
			
		rec1(current.left);
		System.out.print(current.data+" ");
		rec1(current.right);
	}
	/* post-order Traversal*/
	public static void rec3(TreeNode current)
	{
		if(current == null) return;
			
		rec1(current.left);
		
		rec1(current.right);
		System.out.print(current.data+" ");
	}
	
	public static void nonRec1(TreeNode current)
	{
		Stack<TreeNode> st = new Stack<TreeNode>();
		while(true)
		{
			while(current!=null)
			{
				System.out.println(current.data+" ");
				st.push(current);
				current = current.left;
			}
			if(st.isEmpty()) break;
			current = st.pop().right;
		}
	}
	
	
	public static void main(String[] args)
	{
		Random r = new Random();
		for(int i=0;i<10;i++)
			createTree(r.nextInt(100));
		
		display(root);
		display1(root);
		
		System.out.println("Depth->"+getDepth1(root));
		System.out.println("-------");
		
		rec1(root);
		System.out.println("-------");
		rec2(root);
		System.out.println("-------");
		rec3(root);
		System.out.println("-------");
		System.out.println("maxPathSum->"+maxPathSum(root));
		System.out.println("maxPathSum1->"+maxPathSum1(root));
	}
}