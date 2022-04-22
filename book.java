
public class book {
	String name;
	int ISBN;
	String author;
	String publisher;
	
	public book(String name,int ISBN,String author,String publisher)
	{
		this.name=name;
		this.ISBN=ISBN;
		this.author=author;
		this.publisher=publisher;
		
	}
	public void setbookname(String name)
	{
		this.name=name;
	}
	public void setISBN(int isbn)
	{
		this.ISBN=ISBN;
	}
	public void setauthor(String author)
	{
		this.author=author;
	}
	public void setpublisher(String publisher)
	{
		this.publisher=publisher;
	}
	public String getbookname()
	{
		return name;
	}
	public int getISBN()
	{
		return ISBN;
	}
	public String getauthor()
	{
		return author;
	}
	public String getpublisher()
	{
		return publisher;
	}
	String getBookinfo()
	{
		String info="Name:  "+name+"\nISBN:  "+ISBN+"\nAuthor: "+author+"\nPublisher: "+publisher;
		return info;
	}

}
