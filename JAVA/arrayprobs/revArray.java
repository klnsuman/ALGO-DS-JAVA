
public class revArray {

	public static int[] reverseA(int in[])
	{
		int[] out = new int[in.length];
		for(int i=0;i<in.length;i++){
			out[i] = in[in.length-1-i];
		}
		
		return out;
	}
	
	public static void main(String[] args)
	{
		int in[] =new int[4];
		
		in[0] = 1;
		in[1] = 2;in[2] = 3;in[3] = 4;
		for(int i=0;i<in.length;i++){
			System.out.print(in[i]+" ");
		}
		System.out.println(" ");
		int[] out = reverseA(in);
		for(int i=0;i<in.length;i++){
			System.out.print(out[i]+" ");
		}
	}
}
