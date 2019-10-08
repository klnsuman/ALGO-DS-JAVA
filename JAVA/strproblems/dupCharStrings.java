package duplicateChars;

public class dupCharStrings {

	public static boolean dups(String s){
		boolean[] ch_array = new boolean[128];
		
		if(s.length()<=1) return false;
		
		for(int i=0;i<s.length();i++){
			int c = s.charAt(i);
			if(ch_array[c]){
				return true;
			}
			else
			{
				ch_array[c] = true;
			}
		}
		return false;
	}
	public static void main(String[] args){
		String s1 = new String();
		s1 = "Geks";
		if(dups(s1))
		{
			System.out.println("yes has duplicate");
		}
		else
		{
			System.out.println("No duplicate");
		}
	}
}
