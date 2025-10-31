package basic;
import java.util.*;
public class placement_test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int roll=sc.nextInt();
        int arrear=sc.nextInt();
        double cgpa=sc.nextDouble();
        if((arrear==0 && cgpa>=7)||(arrear<=2 && cgpa>=7.5)){
            System.out.println("Name:"+name);
            System.out.println("Roll:"+roll);
            System.out.println("selected");
        }
        else{
            System.out.println("Not selected");
        }
    }
}
