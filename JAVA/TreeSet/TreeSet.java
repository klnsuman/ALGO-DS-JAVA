package TreeSet;

import java.util.LinkedList;
import java.util.Queue;

public class TreeSet {
	
	BTreeNode root;
	int size;
	
	public boolean add(Integer key)
	{
		BTreeNode res;
		if(root == null)
		{
			root = auxAdd(root,key);
		}
		else
		{
			res =  auxAdd(root,key);
		}
		return true;
	}
	public BTreeNode auxAdd(BTreeNode current,Integer key)
	{
		BTreeNode left,right;
		
		if(current == null)
		{
			size++;
			return new BTreeNode(key);
		}
		
		int res = key.compareTo(current.key);
		if(res < 0)
		{
			left = auxAdd(current.left,key);
			current.left =left;
			
		}
		if(res == 0)
			return null;		
		if(res>0){
			right = auxAdd(current.right,key);
			current.right = right;
		}
		return current;
	}
	
	public void display()
	{
		Queue<BTreeNode> queue =   new LinkedList<BTreeNode>();
		queue.add(root);
		queue.add(null);
		
		while(!queue.isEmpty())
		{
			
			BTreeNode current = queue.remove();
			if(current == null)
			{
				System.out.println();
				if(!queue.isEmpty())
				{
						queue.add(null);
				}
				
			}
			else
			{
				
			}
		}
	}

}
