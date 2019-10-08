package BasicThinking;

public class LtestMain {

	public static void main(String[] args) {
		LTest[] lt = new LTest[10];
		
		for(int i=0;i<10;i++)
		{
			lt[i] = new LTest();
			System.out.println("lt->"+lt[i]+" Data->"+lt[i].data);
		}

	}

}
