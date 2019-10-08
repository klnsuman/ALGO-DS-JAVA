import java.util.Scanner;

public class SwitchTestClass{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter Start/Stop:");
		
		String Value = input.nextLine();
		
		switch(Value)
		{
			case "start":
				System.out.println("Machine Started");
				break;
			case "stop":
				System.out.println("Machine Stopped");	
				break;
			default:
				System.out.println("You entered something wrong");	
		}
	}
	

}