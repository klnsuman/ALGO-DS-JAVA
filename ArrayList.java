package Algorithmica;

public class ArrayList implements IList{

	private int[] array;
	private int size;
	
	public ArrayList()
	{
		array = new int[10];
		size = 0;
	}
	public void add(Integer e) {
		if(size== array.length)
			doubling(10);
		
		array[size++] = e;
		//size++;
	}

	private void doubling(int n)
	{
		int[] newarray = new int[2*n];
		for(int i=0;i<size;i++)
		{
			newarray[i] = array[i];
		}
		array = newarray;
	}
	
	public void display(int index) {	
		
		System.out.println("Element at "+index+" is "+array[index]);
		
	}
	
	public void displayAll() {	
		for(int i=0;i<array.length;i++)
		System.out.println("Element at "+i+" is "+array[i]);
		
	}

	public int size(int index) {
		
		return size;
	}
	

}
