import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadingTextFile {

	public static void main(String[] args) throws FileNotFoundException
	{
		String filename = "C:/Users/klrao.ORADEV/Desktop/File.txt";
		
		File textFile = new File(filename);

		Scanner in = new Scanner(textFile);
		
		while (in.hasNextLine())
		{
			String Line = in.nextLine();
			System.out.println(Line.toString());
		}
		in.close();
	}
}
