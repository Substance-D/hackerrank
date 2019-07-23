/*
To get the sum of multiples below a boundary is straightforward with the formula
Sn = (n/2) * (a0 + an)
Sn is the sum of multiples
n is the number of terms (multiples)
a0 is the first term
an is the last term

The solution for this problem is to add the sums for S3 and S5 and subtract S15(due to computing duplicate values that are mutliples of 3 and 5).
For this problem we are not given n (number of terms) but it can be computed easily for each sum equation. We also want to insure we only
calculate the sum of multiples LESS than the given value not inluding it. First check if the given value, x, is divisible by a0 with no remainder.
If x % a0 = 0 then subtract a0 from x and this will be the 'an' value. If x % a0 != 0 then subtract that remainder from x for the 'an' value.

To get the number of terms 'n' simply get the result of an/a0 which is guaranteed to be an integer value. Now all of the values required for the
formula are calculated and simply write a method to output S3 + S5 - S15

BigDecimal is used and so is BigInteger as the values can get very large and some testcases fail if only using decimal and long
*/

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Problem1
{
    public static void main(String args [])
    {
        //Create stdio to scan in T for testcases and iterate for testcases
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i = 0; i < T; i++) sumOfMultiples(scan.nextLong());
    }

    public static void sumOfMultiples(long x)
    {
        //Ternary operator sets the value of three bound to x - 3 if x % 3 == 0 and to x - (x % 3) if not
        BigDecimal threeBound = x % 3 == 0 ? new BigDecimal(x - 3) : new BigDecimal(x - (x % 3));
        /*
        Create BigDecimals for division and multiplication of 3 and 2 as BigDecimals require BigDecimal
        operands for multiplication and division.
        */
        BigDecimal thr = new BigDecimal("3");
        BigDecimal tw = new BigDecimal("2");
        //Simply plug in the values for the formula described in the algorithim
        BigDecimal terms = threeBound.divide(thr);
        BigDecimal multiplesThreeSum = (terms.divide(tw)).multiply(threeBound.add(thr));

        //Same as previous code segment but for 5 instead of 3
        BigDecimal fiveBound = x % 5 == 0 ? new BigDecimal(x - 5) : new BigDecimal(x - (x % 5));
        BigDecimal fiv = new BigDecimal("5");
        terms = fiveBound.divide(fiv);
        BigDecimal multiplesFiveSum = (terms.divide(tw)).multiply(fiveBound.add(fiv));

        //Same as previous code segments but for 15 instead of 3 or 5
        BigDecimal fifteenBound = x % 15 == 0 ? new BigDecimal(x - 15) : new BigDecimal(x - (x % 15));
        BigDecimal fif = new BigDecimal("15");
        terms = fifteenBound.divide(fif);
        BigDecimal multiplesFifteenSum = (terms.divide(tw)).multiply(fifteenBound.add(fif));

        //Add the values for S5 and S3 and subtract the value for S15
        BigDecimal result = multiplesFiveSum.add(multiplesThreeSum);
        result = result.subtract(multiplesFifteenSum);
        //Print answer
        BigInteger sum = result.toBigInteger();
        System.out.println(sum.toString());
    }
}
