package oop;
import java.util.*;
class mark{
    void add(int a,int b) {
        System.out.println("add_two : " + (a + b));
    }
}
class mark2 extends mark{
    void add(int a,int b,int c) {
        System.out.println("add_three : " + (a + b+c));
    }
}

public class overloding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        mark2 m=new mark2();
        m.add(a,b);
        m.add(a,b,c);
    }
}
