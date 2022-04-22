import java.util.Scanner;
public class account1 {

	public static void main(String[] args) {
		account account1=new account(39.00);
		
		
		System.out.printf("account1 balance:%.2f\n",account1.getbalance());
		
		Scanner sc=new Scanner(System.in);
		double depositamount;
		double debitamount;
		
		System.out.println("enter deposit amount in account1:");
		depositamount=sc.nextDouble();
		System.out.printf("deposit amount is:%.2f",depositamount);
		account1.credit(depositamount);
		
		
		
		System.out.printf("\nacount1 balance is:%.2f",account1.getbalance());
		
		
		System.out.println("\nenter debit ammount for account:");
		debitamount=sc.nextDouble();
		System.out.printf("%.2f from account balance is debited",debitamount);
		
		if(account1.getbalance()>=debitamount)
		{
			account1.debit(debitamount);
			System.out.printf("\nacount1 balance is:%.2f",account1.getbalance());
			
		}
		
	}

}
