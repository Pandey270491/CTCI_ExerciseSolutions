package chapter1_ArraysAndStrings;

import java.util.Scanner;

/**
 * Created by pandey on 19/11/17.
 * Write an algo such that if an element in an M X N matrix is 0; its entire row and column are set to 0
 */
public class CTCI_1_8_ZeroMatrix {

    public static void main(String[] args) {

        System.out.println("Enter number of rows and columns");
        Scanner reader = new Scanner(System.in);
        int m = reader.nextInt();
        int n = reader.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter Elements : \n");

        for(int i = 0; i<m ; i++)
        {
            for(int j = 0; j<n ; j++)
            {
                matrix[i][j] = reader.nextInt();
            }
        }

        for(int i = 0; i<m ; i++)
        {
            for(int j = 0; j<n ; j++)
            {
               System.out.print( matrix[i][j] + " ");
            }
            System.out.print("\n");
        }


        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<m ; i++)
        {
            for(int j = 0; j<n ; j++)
            {
               if(matrix[i][j]==0)
               {
                    sb.append( ""+ i + " " + j + "-1");
               }
            }
        }

        if(!sb.toString().isEmpty()) {
            String[] zeroMap = (sb.toString()).split("-1");
            for (int k = 0 ; k<zeroMap.length ; k++)
            {
                String [] index = zeroMap[k].split(" ");
                for(int i = 0; i<m ; i++)
                {
                    matrix[i][Integer.parseInt(index[1])] = 0;
                }

                for(int j = 0; j<n ; j++)
                {
                    matrix[Integer.parseInt(index[0])][j] = 0;
                }

            }

        }

        for(int i = 0; i<m ; i++)
        {
            for(int j = 0; j<n ; j++)
            {
                System.out.print( matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
