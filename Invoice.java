
public class Invoice {
	String partNumber;
	String partdescription;
	int quantity;
	double price;
	
	public Invoice(String num,String desc,int qty,double prc)
	{
		this.partNumber=num;
		this.partdescription=desc;
		this.quantity=qty;
		this.price=prc;
	}
	public String getPartNum()
	{
		return partNumber;
	}
	public String getPartDesc()
	{
		return partdescription;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPartNum(String num)
	{
		if(num!=null)
		{
			partNumber=num;
		}
		else
		{
			partNumber="0";
		}
	}
	public void setPartDesc(String desc)
	{
		if(desc!=null)
		{
			partdescription=desc;
		}
		else
		{
			partdescription="0";
		}
	}
	public void setQuantity(int qty)
	{
		if (qty>0)
		{
			quantity=qty;
		}
		else
		{
			quantity=0;
		}
	}
	public void setPrice(double prc)
	{
		if(prc >0.0)
		{
			price=prc;
		}
		else
		{
			price=0.0;
		}
	}
	public double getInvoiceAmount()
	{
		return(double)quantity*price;
	}
	

}
