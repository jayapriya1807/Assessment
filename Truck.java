
public class Truck extends Car {
	int weight;
	
	public Truck(int speed,double regularPrice,String color,int weight)
	{
		super(speed,regularPrice,color);
		this.weight=weight;
		
	}
	public double getsalePrice()
	{
		if (weight >2000)
		{
			return super.getsalePrice() -(0.1 * super.getsalePrice());
		}
		else
		{
			return super.getsalePrice();
		}
	}

}
