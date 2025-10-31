package basic;
import java.util.*;
public class encryption {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        for(char x:a.toCharArray()){
            int c=x-'A';
            char v=(char)('Z'-c);
            System.out.print(v);
        }
    }
}
