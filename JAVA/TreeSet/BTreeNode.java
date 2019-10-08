package TreeSet;

public class BTreeNode {

	Integer key;
	BTreeNode left;
	BTreeNode right;
	
	public BTreeNode(Integer key)
	{
		this.key = key;
	}
	
	
	public BTreeNode(Integer key,BTreeNode left,BTreeNode right)
	{
		this.key = key;
		this.left = left;
		this.right = right;
	}
	
}
