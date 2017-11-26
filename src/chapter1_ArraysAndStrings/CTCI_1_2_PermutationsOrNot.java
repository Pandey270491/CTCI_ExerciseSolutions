package chapter1_ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by pandey on 15/11/17.
 * Given two strings , write a program to decide if one is permutation of the other.
 */
public class CTCI_1_2_PermutationsOrNot {

    private static boolean ifAnagram(char[] Arr1 , char[] Arr2)
    {
        if(Arr1.length != Arr2.length)
        {
            return false;
        }

        Map<Character,Integer> charCountMap = new HashMap<>();

        for(char c1 : Arr1)
        {
            if(charCountMap.containsKey(c1))
            {
                charCountMap.put(c1, charCountMap.get(c1) + 1 )  ;
            }
            else
            {
                charCountMap.put(c1,1);
            }
        }

        for(char c2 : Arr2)
        {
            if(charCountMap.containsKey(c2))
            {
                charCountMap.put(c2, charCountMap.get(c2) -1 )  ;
                if(charCountMap.get(c2)==0)
                {
                    charCountMap.remove(c2);
                }
            }
            else
            {
                return false;
            }
        }

        if(charCountMap.size() == 0)
        {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("Enter two Strings : ");

        Scanner reader = new Scanner(System.in);
        String[] inputs = new String[2];
        int i = 0;
        while(reader.hasNextLine()) {
            inputs[i] = reader.nextLine();
            i++;
            if(i >1)
            {
                break;
            }
        }
        boolean result = ifAnagram(inputs[0].toCharArray() , inputs[1].toCharArray());

        if(result)
        {
            System.out.println("Strings are permutaions of each other");
        }
        else
        {
            System.out.println("Strings are NOT permutaions of each other");
        }


    }
}
