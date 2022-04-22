
public class savingaccount {
	static double annualinterestrate;
	double savingbalance;
	
	public savingaccount()
	{
		annualinterestrate=0.0;
		savingbalance=0.0;
	}
	public savingaccount(double anintrate,double savbal)
	{
		annualinterestrate=anintrate;
		savingbalance=savbal;
	}
	public double monthlyinterest()
	{
		double anintrate=(savingbalance +annualinterestrate/12);
		savingbalance=savingbalance+anintrate;
		return anintrate;
	}
	public static void modifyinterest(double newinterestrate)
	{
		annualinterestrate=newinterestrate;
	}
	public void setsavingbalance(double newbal)
	{
		savingbalance=newbal;
	}
	public double getsavingbalance()
	{
		return savingbalance;
	}
	public double getannualinterestrates()
	{
		return annualinterestrate;
	}

}
