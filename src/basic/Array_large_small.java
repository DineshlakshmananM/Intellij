package basic;
import java.util.*;
public class Array_large_small {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[]b=new int[a];
        for(int i=0;i<a;i++){
            b[i]=sc.nextInt();
        }
        Arrays.sort(b);
        int r=0,l=b.length-1;
        while(r<l){
            System.out.print(b[r++]+" "+b[l++]);
        }
    }
}
