package basic;
import java.util.*;
public class neon_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(neon(a)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
    public static boolean neon(int n){
        int p=n*n;
        int sum=0;
        while(p!=0){
            sum+=p%10;
            p/=10;
        }
        if(sum==n){
            return true;
        }
        return false;
    }
}
