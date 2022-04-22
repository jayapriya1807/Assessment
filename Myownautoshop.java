
public class Myownautoshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Sedan sedan1=new Sedan(160,2000,"red",10);
	Ford ford1=new Ford(156,4452.0,"black",2006,77);
	Ford ford2=new Ford(567,8765.0,"blue",8767,99);
	Car car1=new Car(543,6789.0,"red");
	
	System.out.printf("sedan price%.2f\n",sedan1.getsalePrice());
	System.out.printf("ford1 price%.2f\n",ford1.getsalePrice());
	System.out.printf("ford2 price%.2f\n",ford2.getsalePrice());
	System.out.printf("car price%.2f\n",car1.getsalePrice());
	

	}

}
