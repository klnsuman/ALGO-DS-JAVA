import java.util.*;
public class ArrayListGenerics {
	
	public static void main(String args[])
	{
		Student st1 = new Student(101,"Suman");
		Student st2 = new Student(102,"KLN");
		Student st3 = new Student(103,"Venkat");
		Student st4 = new Student(104,"Narasimha");
		
		ArrayList<Student> ast = new ArrayList<Student>();
		ast.add(st1);
		ast.add(st2);
		ast.add(st3);
		ast.add(st4);
		int i=0;
		for(Student s:ast)
		{
			i+=1;
			System.out.println("("+i+") "+s.rollno+" "+s.name);
		}
		
		
		// ------------------------------------------
		Employee e1 = new Employee();
		e1.setEmployeeDetails(101, "KLN");
		e1.setEmployeeDetails(1011, "KLN 1011");
		Employee e2 = new Employee();
		e2.setEmployeeDetails(102, "Suman");
		
		ArrayList<Employee> emp1 = new ArrayList<Employee>();
		emp1.add(e1);
		emp1.add(e2);
		int j=0;
		for(Employee e:emp1)
		{
			j+=1;
			System.out.println("("+i+") "+e.getEmployeeNo()+" "+e.getEmployeeName());
		}
		
		// ------------------------------------------
	}

}
