
public class Invoice1 {

	public static void main(String[] args) {
		Invoice invoice1=new Invoice("jaya","bts",789,89.0);
		Invoice invoice2=new Invoice("priya","blackpink",687,90.0);
		
		System.out.printf("Invoice1:%s\t%s\t\t%d\t%.2f\n",invoice1.getPartNum(),invoice1.getPartDesc(),invoice1.getQuantity(),invoice1.getPrice());
		System.out.printf("Invoice2:%s\t%s\t%d\t%.2f\n",invoice2.getPartNum(),invoice2.getPartDesc(),invoice2.getQuantity(),invoice2.getPrice());

		

	}

}
