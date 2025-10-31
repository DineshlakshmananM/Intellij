package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Rotation {
    public static void rotation(int[] arr, int n, int d)
    {
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int arr[], int st, int end)
    {
        while(st < end)
        {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rotation(arr,n,d);
        System.out.println(Arrays.toString(arr));
    }
}
