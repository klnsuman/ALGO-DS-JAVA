package cache;

public class DListNode {

	String key;
	Integer value;
	DListNode prev,next;
	
	public DListNode(){
		
	}
	
	public DListNode(String key,Integer value){
		this.key = key;
		this.value = value;
	}
}
