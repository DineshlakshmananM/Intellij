package basic;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int d = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            d += arr[i];
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        for (int jv : arr) {
            if (jv % 2 != 0) {
                System.out.print(jv + " ");
            }
        }
        System.out.println();
        System.out.println(d);
    }
}
