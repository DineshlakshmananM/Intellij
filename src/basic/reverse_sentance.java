package basic;
import java.util.*;
public class reverse_sentance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        StringBuilder str=new StringBuilder(a);
        String s=str.reverse().toString();
        s=s.replace(" ","");
        int v=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==' '){
                System.out.print(" ");
            }
            else{
               System.out.print(s.charAt(v++));
            }
        }
    }
}
