package set;

public class BTreeNode {
	Integer data;
	BTreeNode left;
	BTreeNode right;
	
	public BTreeNode(Integer data)
	{
		this.data = data;
	}
	public BTreeNode(Integer data,BTreeNode left,BTreeNode right)
	{
		this.data = data;
		this.left = left;
		this.right = right;
	}
	public BTreeNode()
	{
		this.data = data;
	}

}
