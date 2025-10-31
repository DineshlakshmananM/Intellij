package basic;
import java.util.*;
public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();
        System.out.println(n+" "+m);
        int temp=n;
        n=m;
        m=temp;
        System.out.println(n+" "+m);
    }
}
