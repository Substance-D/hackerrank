import java.util.Scanner;

public class Arraylist
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<ArrayList<Integer>> myAL = new ArrayList<>(n);
        for(int i = 0; i < n; i++)
        {
            myAL.add(new ArrayList());
            int d = scan.nextInt();
            for(int j = 0; j < d; j++) myAL.get(i).add(scan.nextInt());
        }
        int q = scan.nextInt();
        for(int k = 0; k < q; k++)
        {
            int x = scan.nextInt(), y = scan.nextInt();
            try
            {
                System.out.println(myAL.get(x).get(y));
            }
            catch(Exception e)
            {
                System.out.println("ERROR");
            }
        }
    }
}
