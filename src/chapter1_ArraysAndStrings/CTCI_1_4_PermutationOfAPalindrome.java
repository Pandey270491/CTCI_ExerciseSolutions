package chapter1_ArraysAndStrings;

import java.util.*;

/**
 * Created by pandey on 16/11/17.
 * Given a String , write a function to check if it is a permutation of a palindrome.
 *
 * Example :
 * input : Tact coa
 * output : true ( permutation :- "taco cat","atco cta", etc)
 */
public class CTCI_1_4_PermutationOfAPalindrome {

    private static boolean isPermutationOfPalindrome(char[] input)
    {
        int len =0;
        int expectedOddCharCount =0;

        Set<Character> charCountSet = new HashSet<>();

        for(char c : input)
        {
            if(c !=' ')
            {
                len++;
                if(charCountSet.contains(c))
                {
                    charCountSet.remove(c);
                }
                else
                {
                    charCountSet.add(c);
                }
            }

        }
        expectedOddCharCount = len%2;

        return expectedOddCharCount == charCountSet.size();
    }

    public static void main(String[] args) {
        System.out.println("The string to be ");
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();

        boolean result = isPermutationOfPalindrome((input.toLowerCase()).toCharArray());

        System.out.println(result);
    }
}
