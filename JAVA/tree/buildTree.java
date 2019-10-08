package tree;
import java.util.Random;

public class buildTree implements iTree{
	
	treeNode root;
	
	public buildTree(int data) {
	
		root = new treeNode(data);
		root.left = null;
		root.right = null;
	}

	public treeNode auxAdd(treeNode tmp,int data) {
		
		Random r = new Random();
		int t = r.nextInt(100);
		System.out.println("t->"+t);
		if(tmp == null) {
			tmp = new treeNode(data);
			
		}
		else if(tmp.data >= t)
		{
			 tmp.left = auxAdd(tmp.left, data);
		}
		else if(tmp.data < t) {
			 tmp.right = auxAdd(tmp.right, data);
		}
		return tmp;
	}
	@Override
	public void add(int data) {
		// TODO Auto-generated method stub
		if(root == null)
			root = new treeNode(data);
		auxAdd( root, data);
		
		//return root;
	}

	public treeNode getRoot() {
		return root;
	}
	
	public void auxPrint(treeNode tmp,int nSpace,String s) {
		
		if(tmp == null) return;
		for(int i=0;i<nSpace;i++)
			System.out.print(' ');
		System.out.println(tmp.data);
		auxPrint(tmp.left,nSpace+4,"(L)");
		auxPrint(tmp.right,nSpace+4,"(R)");
		
	}
	public void print(treeNode root) {
		// TODO Auto-generated method stub
		auxPrint(root,0,"ROOT");
		
	}

	@Override
	public void isBST(treeNode root) {
		// TODO Auto-generated method stub
		
	}

}
