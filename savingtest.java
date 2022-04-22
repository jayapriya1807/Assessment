
public class savingtest {

	public static void main(String[] args) {
		savingaccount saver1=new savingaccount();
		savingaccount saver2=new savingaccount();
		
		saver1.setsavingbalance(2000.00);
		saver2.setsavingbalance(3000.00);
		
		savingaccount.modifyinterest(0.04);
		saver1.monthlyinterest();
		saver2.monthlyinterest();
		
		System.out.printf("new balance saver1=%.2f\n",saver1.getsavingbalance());
		System.out.printf("new balance saver1=%.2f\n",saver2.getsavingbalance());
		
		savingaccount.modifyinterest(0.05);
		saver1.monthlyinterest();
		saver2.monthlyinterest();
		
		System.out.printf("new balance saver1=%.2f\n",saver1.getsavingbalance());
		System.out.printf("new balance saver1=%.2f\n",saver2.getsavingbalance());
		
		
		
		
	}

}
