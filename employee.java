
public class employee {
	String firstname;
	String lastname;
	double salary;
	
	public employee(String fname,String lname,double sal)
	{
		this.firstname=fname;
		this.lastname=lname;
		this.salary=sal;
		
	}
	
	public String getfirstname()
	{
		return this.firstname;
	}
	public String getlastname()
	{
		return lastname;
	}
	public double getsalary()
	{
		return salary;
	}
	
	public void setfirstname(String fname)
	{
		this.firstname=fname;
	}
	public void setlastname(String lname)
	{
		this.lastname=lname;
	}
	public void setsalary(double sal)
	{
		if(sal >0.0)
		{
			salary=sal;
		}
		else
		{
			salary=0.0;
		}
	}

}
