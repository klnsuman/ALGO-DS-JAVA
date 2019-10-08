package linkedLists;

import java.util.Iterator;

public class LinkedList<Item> implements Iterable<Item> {

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Node first;
	private int n;
	private class Node
	{
		Item item;
		Node node;
	}
	
	public LinkedList()
	{
		first = null;
		n = 0; 
	}
	
	public void push(Item item)
	{
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.node = first;
		n++;
	}
	public boolean isEmpty()
	{
		return first == null;
	}
	public Node pop()
	{
		Node node = first;
		first.node = null;		
		return node;
	}
	public void peek()
	{
		
	}
	public int size()
	{
		return n;
	}

}
