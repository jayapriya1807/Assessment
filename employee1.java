
public class employee1 {

	public static void main(String[] args) {
		employee emp=new employee("jaya","priya",30000.00);
		
		System.out.print("\nFirstname\t  Lastname\t\t  Salary\n");
		System.out.printf("%s\t\t  %s\t\t\t %.2f\n",emp.getfirstname(),emp.getlastname(),emp.getsalary());
		
		emp.setsalary((.1*emp.getsalary())+emp.getsalary());
		
		System.out.println("\n10% salary is raised");
		System.out.print("\nFirstname\t  Lastname\t\t  Salary\n");
		System.out.printf("%s\t\t  %s\t\t\t %.2f\n",emp.getfirstname(),emp.getlastname(),emp.getsalary());
				
		

	}

}
