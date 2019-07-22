import java.util.Scanner;

public class HR2DArray
{
    public static void main(String args [])
    {
        //Create scanner for stdio and 2D array 6x6 as questions specifies all arrays will be 6x6
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[6][6];
        /*
        Fill array from input. HackerRank provided but not mandatory code for filling array.
        As the input is specified by the question setter their read in is used due to laziness.
        */
        for (int i = 0; i < 6; i++)
        {
            String[] arrRowItems = scan.nextLine().split(" ");
            scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for (int j = 0; j < 6; j++)
            {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        /*Create an int for the max hourglass value found and a temporary variable for summing individual hourglasses.
        The latter is done for neatness.
        */
        int maxHourglass = Integer.MIN_VALUE, tempHourglass;
        //Due to definition of hourglass bounds of loops are for the far points of the hourglass
        for(int m = 0; m+2 < 6; m++)
        {
            for(int n = 0; n+2 < 6; n++)
            {
                //If current hourglass is greater than maxHourglass update the max and finally after the loop print it
                tempHourglass = arr[m][n] + arr[m][n+1] + arr[m][n+2] + arr[m+1][n+1] + arr[m+2][n] + arr[m+2][n+1] + arr[m+2][n+2];
                if(tempHourglass > maxHourglass) maxHourglass = tempHourglass;
            }
        }
        System.out.println(maxHourglass);
    }
}
