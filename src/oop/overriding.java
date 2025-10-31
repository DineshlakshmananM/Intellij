package oop;
import java.util.*;
class mark1{
    void add(int a,int b) {
        System.out.println("add_two : " + (a + b));
    }
}
class mark3 extends mark1{
    void add(int a,int b) {
        System.out.println("add_three : " + (a + b));
    }
}
public class overriding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        mark3 m=new mark3();
        m.add(a,b);
        m.add(a,c);
    }
}
