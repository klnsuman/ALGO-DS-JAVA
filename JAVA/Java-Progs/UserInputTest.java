import java.util.Scanner;
public class UserInputTest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Some String:");
		String Value = input.nextLine();
		System.out.println("Value Entered is:"+Value);
	}
}