//Start of code segment locked by HackerRank
import java.math.BigDecimal;
import java.util.*;
class HRBigDecimal
{
    public static void main(String []args)
    {

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
//End of code segment locked by HackerRank
        /*
        due to bizarre IO choice to make an array bigger than the amount of inputs I copied those decimalValues
        into a new array sprime. then created an array of BigDecimal based on those values. So now there is an array of strings and an array of BigDecimal
        in the same order.
        */
        String[] sprime = new String[n];
        for(int i = 0; i < sprime.length; i++)
        {
            sprime[i] = s[i];
        }
        BigDecimal[] decimalValues = new BigDecimal[n];
        for(int j = 0; j < n; j++)
        {
            decimalValues[j] = new BigDecimal(sprime[j]);
        }
        //Temporary BigDecimal and String declarations for bubble sort
        BigDecimal tempBD;
        String tempStr;

        /*
        The simplets way to solve this is to manually implement a bubble sort which sorts elements in descending order. This bubble sort is written to sort the BigDecimal array
        which has a default comparator. Any swaps made to the BigDecimal array are mirrored in the string (sprime) array. Doing this maintains the strings in their correct format for
        output.
        */
        for(int k = 0; k < decimalValues.length; k++)
        {
            for(int l = 0; l + 1< decimalValues.length - k; l++)
            {
                if(decimalValues[l].compareTo(decimalValues[l+1]) < 0)
                {
                    tempBD = decimalValues[l];
                    decimalValues[l] = decimalValues[l + 1];
                    decimalValues[l + 1] = tempBD;

                    tempStr = sprime[l];
                    sprime[l] = sprime[l + 1];
                    sprime[l + 1] = tempStr;
                }
            }
        }
        //Finally as the output is locked to print s it's a simple matter of setting s to be a copy of sprime
        s = java.util.Arrays.copyOfRange(sprime, 0, n);
//Start of code segment locked by HackerRank
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
//End of code segment locked by HackerRank
