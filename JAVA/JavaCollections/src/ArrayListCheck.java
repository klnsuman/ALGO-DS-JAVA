import java.util.*;
public class ArrayListCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Integer> alt = new ArrayList<Integer>();
			
			alt.add(10);
			alt.add(20);
			
			/*for(int i=0;i<alt.size();i++)
			{
				System.out.println("ELement at "+i+" is : "+alt.get(i));
			}*/
			System.out.println("traversing elements in backward direction...");  
			ListIterator<Integer> Lit = alt.listIterator();
			while(Lit.hasPrevious())
			{
				System.out.println("previous-"+Lit.previous());
			}
			System.out.println(alt);
			
			for(int k=0;k<alt.size();k++)
			{
				System.out.println("ELement at "+k+" is : "+alt.get(k));
			}
			
			
			for(Integer j : alt)
			{
				System.out.println("ELement at "+j);
			}
			Iterator itr= alt.iterator();
			while(itr.hasNext())
			{
				System.out.println("next->"+itr.next());
			}
			
			
	}

}
