package basic;
import java.util.*;
public class leapyear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a%4==0 && a%100!=0)|| a%400==0 ){
            System.out.print("leap year");
        }
        else{
            System.out.print("Not leap year");
        }
    }
}
