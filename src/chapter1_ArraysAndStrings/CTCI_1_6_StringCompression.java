package chapter1_ArraysAndStrings;

import java.util.Scanner;

/**
 * Created by pandey on 16/11/17.
 * Example:
 * input - > aaabccccccaaa
 * output - > a3b1c5a3
 *
 * If compressed string is not smaller than the original string , then return original string
 */
public class CTCI_1_6_StringCompression {

    private static String compressString(char[] input)
    {
        StringBuilder compressedSB = new StringBuilder();

        char c = input[0];
        int count = 0;

        for(int i = 0 ; i<input.length ; i++)
        {
            if(c==input[i])
            {
                count++;
            }
            else
            {
                compressedSB.append(c + "" +count);
                count = 1;
                c=input[i];
            }
        }
        compressedSB.append(c + "" +count);

        return compressedSB.toString();
    }

    public static void main(String[] args) {

        System.out.println("Enter string to compress : ");
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();

        String compressedStr = compressString(input.toCharArray());

        System.out.println(compressedStr);

        if(compressedStr.length() < input.length())
        {
            System.out.println(compressedStr);
        }
        else
        {
            System.out.println(input);
        }
    }
}
