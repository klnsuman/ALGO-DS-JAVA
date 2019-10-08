package strproblems;

public class isUniq_1 {
	public boolean isUnique(String s){
		
		if(s.length() > 128)
		{
			return false;
		}
		boolean char_set[] = new boolean[128];
		for(int i =0;i<s.length();i++)
		{
			int val = s.charAt(i);
			if(char_set[val])
				return false;
			
			char_set[val] = true; 
		}
		return true;
	}
	
	public static void main(String args[]){
		isUniq_1 is = new isUniq_1();
		
		boolean isUniq = is.isUnique("ABAAAC");
		if(isUniq)
		{
			System.out.println("Yes Unique");
		}
		else
		{
			System.out.println("Not Unique");
		}
	}

}
