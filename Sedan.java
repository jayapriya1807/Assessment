
public class Sedan extends Car{
	int length;
	
	public Sedan(int speed,double regularPrice,String color,int length)
	{
		super(speed,regularPrice,color);
		this.length=length;
	}
	
	public double getsalePrice()
	{
		if(length > 20)
		{
			return super.getsalePrice()-(0.05 *super.getsalePrice());
		}
		else
		{
			return super.getsalePrice() -(0.1 *super.getsalePrice());
		}
	}

}
