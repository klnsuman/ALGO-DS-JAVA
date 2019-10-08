package TreeSet;

public interface ISet {

	public boolean add(Integer key);
	public void display();
	public boolean contains(Integer key);
	public BTreeNode remove(Integer key);
	
}
