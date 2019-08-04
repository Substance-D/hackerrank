/*
The algorithim for this solution is quite straightforward and most of the code is made up of repeating
conditions and statements for each type of bracket pairing.

The main method simply reads in the lines of IO and calls the method to check if it's a valid string of brackets
and prints the resulting boolean.

Due to the nature of valid parentheses to check if the sequence is valid you must start with the inner most pair. Think
of it like a jawbreaker or onion, layers around layers. To check if it matches up we start in the centre and see if the
brackets match as an open-close pair. Within the sequence there can be many "onions" and the sequence is valid.

The way to check this is we start at the start of the sequence and if the character is any of the opening characters i.e.
( or { or [ then we push them on our Stack. If we meet any of the close brackets i.e. ) or } or ] then we pop the last
character we pushed onto the Stack. If it matches the closing bracket we just met then it's valid. If not the entire
sequence must be invalid. Keep doing this until the sequence is consumed. If at any point a bracket is popped of
*/

import java.util.Scanner;
import java.util.Stack;

public class HRStack
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext())System.out.println(isValidSequence(scan.nextLine().trim()));

    }
    public static boolean isValidSequence(String currentSequence)
    {
        Stack<Character> parentheses = new Stack<>();
        char currentBracket, checkBracket;

        for(int i = 0; i < currentSequence.length(); i++)
        {
            currentBracket = currentSequence.charAt(i);
            if(currentBracket == '(' ||currentBracket == '{' ||currentBracket == '[') parentheses.push(currentBracket);
            else
            {   if(parentheses.isEmpty()) return false;
                checkBracket = parentheses.pop();
                if(checkBracket == '(')
                {
                    if(currentBracket != ')') return false;
                }
                if(checkBracket == '{')
                {
                    if(currentBracket != '}') return false;
                }
                if(checkBracket == '[')
                {
                    if(currentBracket != ']') return false;
                }
            }
        }
        if(parentheses.isEmpty()) return true;
        else return false;
    }
}
