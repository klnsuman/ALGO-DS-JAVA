package strproblems;

public class isUnique {

	public boolean isUniqueChars(String s){
		if(s.length() > 128) return false;
		
		boolean char_set[] = new boolean[128];
		for(int i=0;i<s.length();i++)
		{
			int val = s.charAt(i);
			System.out.println(s.charAt(i)+" "+val);
			if(char_set[val])
				return false;
			
			char_set[val] = true;
		}
		return true;
	}
	
	public static void main(String args[])
	{
		isUnique i = new isUnique();
		boolean isUn = i.isUniqueChars("ABAC");
		if(isUn){
			System.out.println("Yes Unique");
		}
		else
		{
			System.out.println("Not Unique");
		}
	}
}
