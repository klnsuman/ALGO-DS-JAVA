
public class Employee {
	private int 	empNo;
	private String 	empName;
	
	public Employee()
	{
		
	}
	
	public void setEmployeeDetails(int empNo,String empName)
	{
		this.empNo 		= empNo;
		this.empName 	= empName;
	}
	public String getEmployeeName()
	{
		return this.empName;
	}
	public int getEmployeeNo()
	{
		return this.empNo;
	}
}
