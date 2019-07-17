import java.math.BigDecimal;
import java.util.*;
class Java_BigDecimal{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        Hashtable<BigDecimal, Integer> decimalLengths = new Hashtable<BigDecimal, Integer>();

        String[] sprime = new String[n];
        for(int i = 0; i < sprime.length; i++)
        {
            sprime[i] = s[i];
        }
        s = sprime;
        BigDecimal[] decimalValues = new BigDecimal[n];
        for(int j = 0; j < s.length; j++)
        {
            decimalValues[j] = new BigDecimal(s[j]);
            decimalLengths.put(decimalValues[j], s[j].length());
        }
        java.util.Arrays.sort(decimalValues, Collections.reverseOrder());

        Integer f, r;
        for(int k = 0; k < decimalValues.length; k++)
        {
            f = decimalLengths.get(decimalValues[k]);
            r = decimalValues[k].toString().length();
            if(r != f)
            {
                if(r > f) s[k] = decimalValues[k].toString().substring(1);
                else
                {
                    s[k] = decimalValues[k].toString();
                    while(s[k].length() < f) s[k] = "0" + s[k];
                }
            }

            else s[k] = decimalValues[k].toString();
        }


        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
