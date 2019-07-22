import java.util.Scanner;
import java.util.Arrays;

public class Subarray
{
    public static void main(String args [])
    {
        //Scanner for stdio, scan in int for array size then iterate over array to fill it
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[scan.nextInt()];
        for(int i = 0; i < arr.length; i++) arr[i] = scan.nextInt();
        //Array to act as temporary subarray when caluclating negative subarrays
        int[] subArr;
        //Counter to track found negative subarrays and sub to hold current caluclated subarray value
        int counter = 0, sum = 0;

        for(int j = 0; j < arr.length; j++)
        {
            for(int k = j + 1; k <= arr.length; k++)
            {
                /*
                Nested for loop to create successive subarrays using Arrays.copyOfRange(). This covers
                all possible contiguous subarrays.
                */
                subArr = Arrays.copyOfRange(arr, j, k);
                //Sum the current subarray, check the value and increment counter if negative
                for(int l = 0; l < subArr.length; l++) sum += subArr[l];
                if(sum < 0) counter++;
                //Don't forget ot reset the sum after each check!
                sum = 0;
            }
        }
        //Finally print out the value of counter which has tracked the amount of negative subarrays found
        System.out.println(counter);
    }
}
