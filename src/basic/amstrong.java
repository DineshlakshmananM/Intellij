package basic;

import java.util.Scanner;

public class amstrong {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        int count=String.valueOf(n).length();
        int result=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            result+=Math.pow(rem,count);
        }
        if(result==num){
            System.out.print("1");
        }
        else{
            System.out.print(result);
        }
    }
}
