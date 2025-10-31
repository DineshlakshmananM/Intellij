package basic;
import java.util.*;
public class division {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int val=sc.nextInt();
        String str="";
        char arr[]={'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        while(num>0){
            int rem=num%val;
            str+=arr[rem];
            num/=val;
        }
        System.out.print(str);
    }
}


