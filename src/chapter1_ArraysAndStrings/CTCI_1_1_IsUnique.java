package chapter1_ArraysAndStrings;

import java.util.Scanner;

/**
 * Created by pandey on 15/11/17.
 * Implement an Algo todetermine if a string has all unique character.
 */
public class CTCI_1_1_IsUnique {

    private static boolean isUnique(char[] inputStrArr) {
        boolean[] boolRefArr = new boolean[128];
        for (char c : inputStrArr)
        {
            if (boolRefArr[(int) c])
            {
                return false;
            }
            else
            {
                boolRefArr[(int) c] = true;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        String inputStr = reader.nextLine();

        boolean result  = isUnique(inputStr.toCharArray());

        if(result)
        {
            System.out.println("String has unique chars");
        }
        else
        {
            System.out.println("String doesnt have unique chars");
        }

    }

}
