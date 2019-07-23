/*
Create a LinkedList to handle the data.
Scan in N for the initial N values
Iterate over the next N values of input
Scan Q for the number of queries to expect
Iterate Q times each time scanning in the command as temp
If "Insert" the next two values scanned are the index and the value to add respectively
If not "Insert" must be "Delete" so use an else to scan the single next value for the index to delete
Iterate over the final LinkedList and print each element
*/

import java.util.*;

public class HRList
{
    public static void main(String args [])
    {
        List<Integer> myList = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i = 0; i < N; i++) myList.add(scan.nextInt());
        int Q = scan.nextInt();

        String temp;
        for(int j = 0; j < Q; j++)
        {
            temp = scan.next();
            if(temp.equals("Insert"))
            {
                int x = scan.nextInt(),y = scan.nextInt();
                myList.add(x, y);
            }
            else myList.remove(scan.nextInt());
        }

        for(int k = 0; k < myList.size(); k++)
        {
            System.out.print(myList.get(k) + " ");
        }

    }
}
