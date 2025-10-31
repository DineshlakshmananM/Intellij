package basic;
import java.util.*;
public class duck_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.charAt(0)=='0'){
            System.out.println("not duck");;
        }
        else{
            if(s.contains("0")) System.out.println("duck");
            else System.out.println("not duck");
      }
    }
}
