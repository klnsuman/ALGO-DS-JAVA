public class StringArrayTest
{
	public static void main(String[] args)
	{
		String[] words = new String[3];
		String word;
		words[0] = "Suman";
		words[1] = " kln";
		words[2] = " How are you";
		
		System.out.println(words[0]+" "+words[1]+" "+words[2]);
		
		word = "Hi Suman How are you";
		System.out.println(word);
		
		String[] fruits = {"apple","banana","orange","grapes","guava"};
		
		for (String fruit : fruits)
		{
			System.out.println(fruit);
		}
		
		System.out.println("============================");
		String text = null;
		
		System.out.println("text:"+text);
		System.out.println("============================");
		String[] texts = new String[2];
		
		System.out.println("texts-1:"+texts[0]);
		System.out.println("texts-2:"+texts[1]);
		System.out.println("============================");
	}
}