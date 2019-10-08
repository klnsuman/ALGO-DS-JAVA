package TrieNew;

import java.util.LinkedList;
import java.util.List;

public class TernarySearchTree implements iTree{

	TSTNode root;
	int size;
	
	public class TSTNode{		
		TSTNode left;
		TSTNode right;
		TSTNode middle;
		char data;
		boolean isWord;
		
		public TSTNode(char data)
		{
			this.data = data;
		}
	}
	
	
	public void add(String key) {
		
		TSTNode tmp = auxAdd(root,key);
		if(root == null)
		{
			root = tmp;
		}
		
			
		
	}

	public TSTNode auxAdd(TSTNode current,String key)
	{
		if(current == null)
		{
			current = new TSTNode( key.charAt(0) );
		}
		if(current.data == key.charAt(0))
		{
			if(key.length()>1)
			{
				current.middle = auxAdd(current.middle,key.substring(1));
			}
			else
			{
				current.isWord = true;
			}			
				
		}
		else if(current.data < key.charAt(0))
		{
			current.right = auxAdd(current.middle,key);
		}
		else if(current.data > key.charAt(0))
		{
			current.left = auxAdd(current.middle,key);
		}
			
		return current;
	}
	
	public void display() {
		List<String> words = new LinkedList<String>();
		
		auxDisplay(root,"",words);
		System.out.println("words->"+words);
		
	}
	public void auxDisplay(TSTNode current,String word,List<String> words)
	{
		if(current == null)
			return;
		auxDisplay(current.left,word,words);
		if(current.isWord == true)
		{
			words.add(word+current.data);
		}
		auxDisplay(current.middle,word+current.data,words);
		auxDisplay(current.right,word,words);			
	}

	
	public void autoCompletion(String key) {
	
		TSTNode current = root;
		int i=0;
		while(i<key.length() && current != null)
		{
			if(current.data < key.charAt(i))
			{
				current = current.left;
			}
			else if(current.data > key.charAt(i))
			{
				current = current.right;
			}
			else
			{
				if(i == key.length()-1) break;
				current = current.middle;
				i++;
			}
		}
		
	}

	@Override
	public void contains(String key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findCommonElementSize(String key) {
		// TODO Auto-generated method stub
		
	}

}
