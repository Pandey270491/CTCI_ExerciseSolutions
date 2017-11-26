package chapter1_ArraysAndStrings;

import java.util.Scanner;

/**
 * Created by pandey on 19/11/17.
 * Assume you have a method 'isSubstring' which checks if one word is a substring of another.
 * Given two strings S1 and S2, write a code to check if s2 is a rotation of s1 using only one call to isSubstring
 * (e.g waterbottle is a rotation of erbottlewat);)
 */
public class CTCI_1_9_StringRotation {

    private static boolean isSubstring(String oString , String subString)
    {
        return oString.contains(subString);
    }

    private static boolean isratatedString(String oStr , String rStr)
    {
        String maxMatch="";
        int subStrStartInd = -1;
        for(int i = 0 ; i<rStr.length() ; i++)
        {
            maxMatch += rStr.charAt(i);
            if(!(oStr.indexOf(maxMatch)>-1))
            {
                subStrStartInd = i;
                break;
            }
        }

        String otherHalf = rStr.substring(subStrStartInd);

        return isSubstring(oStr,otherHalf);
    }

    public static void main(String[] args) {
        System.out.println("Enter Original String and Rotated String  : ");

        Scanner reader = new Scanner(System.in);

        String originalStr = reader.nextLine();
        String rotatedStr = reader.nextLine();

        System.out.println(isratatedString(originalStr,rotatedStr));

    }
}
