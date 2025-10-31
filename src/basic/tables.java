package basic;
import java.util.*;
public class tables {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0) {
            int a = sc.nextInt();
            int c = 1;
            for (int i = 0; i < 10; i++) {
                System.out.println(c + " x " + a + " = " + (c * a));
                c++;
            }
            n--;
        }
    }
}
