package Trie;

import java.util.LinkedList;
import java.util.List;

public class TernarySearchTree {
	public static TSTNode root;
	int size;
	
	public static class TSTNode {
	
		char data;
		TSTNode left,right,middle;
		boolean isEndOfWord;
		public TSTNode(char data){
			
			this.data = data;
		}
	}
		
	 
	public static void add(String key){
		
		TSTNode tmp;
		tmp = auxAdd(root,key);	
		if(root == null)
			root = tmp;
		return;
	}
	public static TSTNode auxAdd(TSTNode current,String key){
		
		if(current ==  null){			
			current = new TSTNode(key.charAt(0));
		}
		
		if(current.data == key.charAt(0))
		{
			if(key.length() > 1)
			{				
				current.middle = auxAdd(current.middle,key.substring(1));
			}
			else{			
				 current.isEndOfWord = true;
			}
		}
		else if(current.data < key.charAt(0))
		{			
			current.left = auxAdd(current.right,key);
		}
		else
		{		
			current.right = auxAdd(current.left,key);
		}		
			
		return current;
	}

	public static boolean contains(String key){
		
		TSTNode tmp = root;
		
		int i=0,n=key.length();
		while(i<n && tmp!=null){
			if(tmp.data < key.charAt(i))
			{
				tmp = tmp.right;
			}
			else if(tmp.data > key.charAt(i))
			{
				tmp = tmp.left;
			}
			else if(tmp.data == key.charAt(i)){
				if(i== n-1) return tmp.isEndOfWord;
				tmp = tmp.middle;
				i++;
			}
		}
		return false;
	}
	public static void mydisp(){
		TSTNode tmp = root;
		LinkedList<String> words = new LinkedList<String>();
		String word;
		while(tmp!=null)
		{
			
		}
	}
	public static void display()
	{
		List<String> words = new LinkedList<String>();
		auxDisplay(root,"",words);
		System.out.println(words);
		
	}
	public static void auxDisplay(TSTNode current,String word,List<String> words){
		
		if(current == null)
			return;
		auxDisplay(current.left,word,words);
		if(current.isEndOfWord == true) 
			words.add(word+current.data);
		auxDisplay(current.middle,word+current.data,words);
		auxDisplay(current.right,word,words);
	}
	
	public static List<String> autoComplete(String prefix){
		
		TSTNode tmp = root;
		int i=0;
		while(i<prefix.length() && tmp!=null){
			if(tmp.data > prefix.charAt(i)){
				tmp = tmp.left;
			}
			else if (tmp.data < prefix.charAt(i)){
				tmp = tmp.right;
			}
			else if (tmp.data == prefix.charAt(i)){
				if(i == prefix.length()-1) break;
				tmp = tmp.middle;
				++i;
			}
			else 
				return null;
		}
		List<String> words = new LinkedList<String>();
		String word="";
		auxDisplay(tmp.middle,prefix,words);
		return words;
	}
	public static void main(String[] args){
		add("AN");
		add("TO");
		add("ANS");
		add("ANTS");
		if(contains("AT")){
			System.out.println("Contains");
		}
		else
		{
			System.out.println("Not Contains");
		}
		display();
		System.out.println(autoComplete("AN"));
	}
}
