//Start of code segment locked by HackerRank
import java.util.*;
public class Main
{
    static Iterator func(ArrayList mylist)
    {
        Iterator it=mylist.iterator();
        while(it.hasNext())
        {
            //End of code segment locked by HackerRank
            /*
            The rest of the code handles IO and printing. We simply need to identify when the
            iterator hits strings. First set element to be the next item the iterator reaads.
            Then the if statement just checks if it's a String using the instanceof keyword and
            breaks the while loop when it returns true. The rest of the printing etc. is done
            by the locked code.
            */
            Object element = it.next();
            if(element instanceof String)
            //Start of code segment locked by HackerRank
			break;
        }
        return it;
    }

    @SuppressWarnings({ "unchecked" })
    public static void main(String []args)
    {
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0;i<n;i++)
        {
            mylist.add(sc.nextInt());
        }

        mylist.add("###");
        for(int i=0;i<m;i++)
        {
            mylist.add(sc.next());
        }
        Iterator it=func(mylist);
        while(it.hasNext())
        {
            Object element = it.next();
            System.out.println((String)element);
        }
    }
}
//End of code segment locked by HackerRank
