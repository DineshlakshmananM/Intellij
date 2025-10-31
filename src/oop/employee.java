package oop;
import java.util.*;
class emp{
    String name;
    double salary;
    double bonus;
    public void setdata (String s, double n, double b) {
        name = s;
        salary = n;
        bonus = b;
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
    }
}
class manager extends emp{
    void bonus(){
        System.out.println("bonus : "+bonus);
        System.out.println("Bonus+salary : "+(salary+bonus));
    }
}
public class employee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        double n=sc.nextDouble();
        double b=sc.nextDouble();
        manager m=new manager();
        m.setdata(s,n,b);
        m.display();
        m.bonus();
    }
}
