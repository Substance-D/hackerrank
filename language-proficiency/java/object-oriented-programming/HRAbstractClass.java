//Start of segment locked by HackerRank
import java.util.*;
abstract class Book
{
	String title;
	abstract void setTitle(String s);
	String getTitle()
    {
		return title;
	}
}
//End of segment locked by HackerRank
/*
Create a class MyBook that extends book. Only need to implement the abstract method
setTitle. Everything else can be directly inherited from the parent class. Write an
implementation for setTitle matching the method signature shown in the Book class.

return the title String in this method.
*/
class MyBook extends Book
{
    public MyBook()
    {
    }

    void setTitle(String s)
    {
        this.title = s;
    }
}
//Start of segment locked by HackerRank
public class HRAbstractClass
{
    public static void main(String []args)
    {
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();

	}
}
//End of segment locked by HackerRank
