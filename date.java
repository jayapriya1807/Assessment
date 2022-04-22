
public class date {
	int month;
	int day;
	int year;
	
	public void setter(int dmon,int dday,int dyr)
	{
		this.month=dmon;
		this.day=dday;
		this.year=dyr;
	}
	
	public void getter()
	{
		System.out.println("the date is:"+day);
		System.out.println("the month is:"+month);
		System.out.println("the year is:"+year);
		System.out.println(day+"/"+month+" /"+year);
	}

}
