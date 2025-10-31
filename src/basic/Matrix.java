package basic;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int step = sc.nextInt();
        int row = sc.nextInt();
        int col = sc.nextInt();
//        int arr[][] = new int[row][col];
//        for(int i=0;i<row;i++)
//        {
//            for(int j=0;j<col;j++)
//            {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        for(int i=0;i<row;i++)
//        {
//            for(int j=0;j<col;j++)
//            {
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
        int arr1[][][] = new int[step][row][col];
        for(int i=0;i<step;i++)
        {
            for(int j=0;j<row;j++)
            {
                for(int k=0;k<col;k++)
                {
                arr1[i][j][k] = sc.nextInt();
                }
            }
        }
        int sum = 0;
        for(int i=0;i<step;i++)
        {
            for(int j=0;j<row;j++)
            {
                for(int k=0;k<col;k++)
                {
                    sum += arr1[i][j][k];
                    System.out.print(arr1[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Sum : " + sum);
    }
}
