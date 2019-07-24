/*
Solution is a bit more longwinded than it need be as I assumed that a BitSet may be
asked to perform an operation on itself e.g. B1.and(B1) but the editorial revealed
this wasn't needed. Still the code is more robust so w/e.

Stdio takes in N for the initial BitSets' sizes, an array is used to create two
BitSets. The reason for this was the assumption that the second operand for AND,
OR, and XOR operations may be the first BitSet again. In this case it was easier
to write the BitSet index - 1 each time so the same statement could be used whether
it was the first or second BitSet. However this entire construct is quite meaningless
as the solution provided by the question setter doesn't account for it. hooray!

using scan.next() allows for easy consumption of Strings and ints. Scan in the operation
as a String and the operands as ints. SEt up a switch for that String then it's rather
basic calling the relevant operations on the correct BitSets.

AFter the switch has made the changes to the BitSets simply print out their amount of set
bits with .cardinality()
*/
import java.util.Scanner;
import java.util.BitSet;

public class HRBitSet
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), M = scan.nextInt();
        BitSet[] myBSArr = new BitSet[2];
        myBSArr[0] = new BitSet(N);
        myBSArr[1] = new BitSet(N);
        String operation;
        int operand1, operand2;
        for(int i = 0; i < M; i++)
        {
            operation = scan.next();
            operand1 = scan.nextInt();
            operand2 = scan.nextInt();
            switch(operation)
            {
                case "AND":
                if(operand1 == 1) myBSArr[0].and(myBSArr[operand2-1]);
                else myBSArr[1].and(myBSArr[operand2-1]);
                break;
                case "OR":
                if(operand1 == 1) myBSArr[0].or(myBSArr[operand2-1]);
                else myBSArr[1].or(myBSArr[operand2-1]);
                break;
                case "XOR":
                if(operand1 == 1) myBSArr[0].xor(myBSArr[operand2-1]);
                else myBSArr[1].xor(myBSArr[operand2-1]);
                break;
                case "FLIP":
                if(operand1 == 1) myBSArr[0].flip(operand2);
                else myBSArr[1].flip(operand2);
                break;
                case "SET":
                if(operand1 == 1) myBSArr[0].set(operand2);
                else myBSArr[1].set(operand2);
                break;
            }
            System.out.println(myBSArr[0].cardinality() + " "+ myBSArr[1].cardinality());
        }
    }
}
