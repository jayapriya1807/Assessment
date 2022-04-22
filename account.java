
public class account {
	double balance;
	
	public account(double initialbalance)
	{
		if(initialbalance > 0.0) balance=initialbalance;
	}
	public void credit(double amount)
	{
		balance=balance+amount;
	}
	public void debit(double amount)
	{
		balance=balance-amount;
	}
	public double getbalance()
	{
		return balance;
	}
	

}
