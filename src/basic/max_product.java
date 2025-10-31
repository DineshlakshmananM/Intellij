package basic;

import java.util.*;

public class max_product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int max=Integer.MAX_VALUE;
        int[]b=new int[a];
        for(int i=0;i<a;i++){
            b[i]=sc.nextInt();
        }
       Arrays.sort(b);
        int t=b[0]*b[1]*b[a-1];
        int c=b[a-3]*b[a-2]*b[a-1];
        max=Math.max(t,c);
        System.out.print(max);
    }
}
