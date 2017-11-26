package chapter1_ArraysAndStrings;

import java.util.Scanner;

/**
 * Created by pandey on 26/11/17.
 */
public class CTCI_1_7_RotateMatrix {

    public static void main(String[] args) {

        System.out.println("Enter value of 'N' for square matrix N x N : ");
        Scanner reader = new Scanner(System.in);

        int N = reader.nextInt();

        int[][] matrix = new int[N][N];

        setNxNmatrix((matrix),N);

        System.out.println("Original Matrix : ");
        printNxNMatrix(matrix,N);

        rotateMAtrix90DegClockwise(matrix , N);

        System.out.println("Rotated Matrix :  ");
        printNxNMatrix(matrix,N);


    }

    private static void rotateMAtrix90DegClockwise(int[][] matrix, int n) {

        int layer = 0;

        for(int i = 0 ; i<n/2 ; i++)
        {
            for (int j = i ; j<n-1-i ; j++)
            {
                swapArrayElements(matrix , i , j , i + j-layer, n-1-i);
                swapArrayElements(matrix , i , j , n-1-i, n-1-i-j+layer);
                swapArrayElements(matrix , i , j , n-1-i-j+layer,i);



            }
            layer++;
        }
    }

    private static void swapArrayElements(int[][]matrix , int i1, int j1 , int i2, int j2 ) {

        int temp = matrix[i1][j1];
        matrix[i1][j1] = matrix[i2][j2];
        matrix[i2][j2] = temp;
    }

    private static void setNxNmatrix(int[][] matrix ,int n) {

        int count = 0;

        for(int i = 0; i<n ; i++)
        {
            for(int j = 0 ; j<n ; j++)
            {
                matrix[i][j] = count;
                count++;
            }
        }
    }

    private static void printNxNMatrix(int[][] matrix , int n)
    {
        System.out.println("*********************");
        for(int i = 0; i<n ; i++)
        {
            for(int j = 0 ; j<n ; j++)
            {
                if(matrix[i][j] <10) {
                    System.out.print(matrix[i][j] + "       ");
                }
                else
                {
                    System.out.print(matrix[i][j] + "      ");
                }
            }

            System.out.println("\n");
        }
        System.out.println("*********************");
    }

}
