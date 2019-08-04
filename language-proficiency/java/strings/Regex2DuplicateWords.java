/*
Most of the code is provided for this problem already. It's not locked however the question says
it will fail if anything other than the three chosen lines are modified. Therefore rather than
trying to figure out how to solve the question in some other way we will work within the given
structure.

Realistically the provided code means we just need to write the regex for finding duplicate words.
Later in the code we will replace the findings with nothing.
*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2DuplicateWords
{
    public static void main(String[] args)
    {
        /*
        \\b is a word boundary so this grabs us the start of a word

        ([A-Z]+) Defines the range of A-Z one or more times (+). The brackets make this part of the regex
        a group. The question shows that duplicate words should be case insensitive and we'll deal with that
        after defining the regex.

        (\\s+\\1\\b) is to define the duplicate words. \\s means a white space character and the + takes into
        account if there are multiple whitespace characters. \\1 refers to the first group of the regex. As stated
        before wrapping the first part of the regex in () creates a group. Therefore \\1 means "an instance of that
        first group." This means the word captured by ([A-Z]+) can be exactly matched against by \\1. So the
        (\\s+\\1\\b) matches a duplicate word. The + after this is incase there are many duplicates rather than
        just one. This is also why the second part of the regex is grouped followed by the +.

        */
        String regex = "\\b([A-Z]+)(\\s+\\1\\b)+";
        /*
        We create a pattern p by compiling our regex. If our regex was invalid it would not compile. The second input
        paramter is the flag. There are a variety of these but this one means when our pattern is created it won't care
        about character cases.
        */
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        //Scanner is created for stdio and scans in an integer for the amount of sentences to read in.
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        //A quite insane way of iterating over the lines of input but easy to understand.
        while (numSentences-- > 0)
        {
            //Scan in the next line of input
            String input = in.nextLine();
            //Create a matcher from the Pattern p.
            Matcher m = p.matcher(input);
            //Here we are iterating over the input manipulating it as we go
            while (m.find())
            {
                input = input.replaceAll(m.group(), m.group(1));
            }
            System.out.println(input);
        }
        in.close();
    }
}
