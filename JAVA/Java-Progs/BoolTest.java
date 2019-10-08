public class BoolTest
{
	public static void main(String[] args)
	{
		int 		value = 0;
		boolean		boovar = value > 10;

		System.out.println("boovar:"+boovar);
		
		while(value < 10)
		{
			System.out.println("boovar:"+boovar+ " Value:"+value);
			value = value + 1;
		}
	}
}