
public class Ford extends Car {
	int year;
	int manufactureDiscount;
	
	public Ford(int speed,double regularPrice,String color,int year,int manufacturediscount)
	{
		super(speed,regularPrice,color);
		this.year=year;
		this.manufactureDiscount=manufactureDiscount;
		
	}
	public double getsalePrice()
	{
		return (super.getsalePrice()-manufactureDiscount);
	}
	

}
