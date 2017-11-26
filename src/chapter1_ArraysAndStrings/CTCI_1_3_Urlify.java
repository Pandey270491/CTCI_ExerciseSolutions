package chapter1_ArraysAndStrings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by pandey on 15/11/17.
 * Write a method to replace spaces i a string with "%20".
 */
public class CTCI_1_3_Urlify {

    private static String URLify(char[] inputArr , int len)
    {
        int k = len-1;
        for(int i = inputArr.length-1 ; i>= 0 ; )
        {
            if(inputArr[k] == ' ')
            {
                inputArr[i] = '0';
                inputArr[i-1] = '2';
                inputArr[i-2] = '%';
                i= i-3;
                k--;
            }
            else
            {
                inputArr[i]=inputArr[k];
                i--;
                k--;
            }
        }

        return new String(inputArr);

    }

    public static void main(String[] args) {

        System.out.println("Enter Line and Actual Length of line");
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        int len = reader.nextInt();

        String url = URLify(input.toCharArray(),len);

        System.out.println(url);


    }
}
