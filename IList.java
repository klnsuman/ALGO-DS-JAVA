package LinkedListTest;

public interface IList {
	
	public void insertAtBegin(int data);
	
	public void insertAtEnd(int data);
	
	public void insertAtPos(int data,int position);

	public void display();
	
	public int getSize();
	
	public void removeFromBegin();
	public void removeFromEnd();
	
	public void removeFromPosition();
}
