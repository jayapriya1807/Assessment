import java.util.*;
public class book1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		book [] test=new book[30];
		System.out.println("enter book data:");
		for(int i=0;i<30;i++)
		{
			System.out.printf("book %d\n",(i+1));
			String name;
			int ISBN;
			String author;
			String publisher;
			
			System.out.println("Enter the book name");
			name=sc.next();
			
			System.out.println("Enter the book ISBN ");
			ISBN=sc.nextInt();
			
			System.out.println("Enter the book author");
			author=sc.next();
			
			System.out.println("Enter the book publisher");
			publisher=sc.next();
			
			test[i]=new book(name,ISBN,author,publisher);
			
		}
		
		for(int i=0;i<30;i++)
		{
			System.out.printf("boo %d\n",(i+1));
			System.out.printf("%s\n",test[i].getBookinfo());
		}

	}

}
