package LinkedListTest;

public class TestLinkedList {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList(10);
		
		ll.display();
		
		ll.insertAtBegin(5);
		ll.display();
		
		ll.insertAtEnd(15);
		ll.display();
		
		ll.insertAtEnd(20);
		ll.display();

		
		ll.insertAtEnd(25);
		ll.display();
		
		ll.insertAtEnd(30);
		ll.display();

		ll.insertAtBegin(4);
		ll.display();
		System.out.println("----");
		ll.insertAtPos(35,2);
		ll.display();
		System.out.println("----");
		System.out.println(ll.getSize());
		
		
		System.out.println("----Remove from Begin---");
		ll.removeFromBegin();
		ll.display();
		System.out.println(ll.getSize());
	}
	

}
