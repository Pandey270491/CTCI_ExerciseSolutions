package chapter1_ArraysAndStrings;

import java.util.*;

/**
 * Created by pandey on 16/11/17.
 * There are 3 types of edits that can be performed on strings:
 * 1. Insert a character,
 * 2. Remove a character,
 * 3. Replace a character.
 * Given true strings , write a function to check if they are one edit away.
 * Example :
 * pale , ple -> true
 * pales , pale -> true
 * pale , bale ->true
 * pale , bake ->false
 */
public class CTCI_1_5_OneAway {

    private static boolean checkOneEditInsertionOrRemoval(char[] str1, char[] str2) {

        Map charCountMap = new HashMap<Character,Integer>();

        for(char c : str1)
        {
            if(charCountMap.containsKey(c))
            {
                charCountMap.put(c, (int)charCountMap.get(c) + 1);
            }
            else
            {
                charCountMap.put(c,1);
            }
        }

        for (char c : str2)
        {
            if(charCountMap.containsKey(c))
            {
                charCountMap.put(c, (int)charCountMap.get(c) -1);
                if((int)charCountMap.get(c) == 0)
                {
                    charCountMap.remove(c);
                }
            }
            else
            {
                charCountMap.put(c,-1);
            }
        }

        return ((charCountMap.size() == 1)  && (int)charCountMap.values().toArray()[0] ==1);
    }


    private static boolean isOneEdit(char[] originalStr , char[] editedStr)
    {
        int lenO = originalStr.length;
        int lenE = editedStr.length;
        if(lenO == lenE)
        {
            //check for replacement of char
            int editCount = 0;

            for(int i =0 ; i<lenO ; i++)
            {
                if(originalStr[i] != editedStr[i] )
                {
                    editCount++;
                }
            }
            return (editCount ==1 );

        }
        else if(lenO - lenE == 1)
        {
            //check for removal
            return checkOneEditInsertionOrRemoval(originalStr, editedStr);
        }
        else if(lenE - lenO == 1)
        {
            //check for insertion
            return checkOneEditInsertionOrRemoval(editedStr, originalStr);
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter original and edited String : ");
        Scanner reader = new Scanner(System.in);
        String originalStr = reader.nextLine();
        String editedStr  = reader.nextLine();

        boolean result = isOneEdit(originalStr.toCharArray() , editedStr.toCharArray());

        System.out.println(result);

    }
}
