package basic;

import java.util.*;
public class char_different {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char []ch=a.toCharArray();
        for(int i=0;i<ch.length-1;i++){
            System.out.print(ch[i]+""+(ch[i+1]-ch[i]));
        }
        System.out.print(ch[ch.length-1]);
    }
}
