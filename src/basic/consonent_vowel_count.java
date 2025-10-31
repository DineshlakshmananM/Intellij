package basic;

import java.util.*;

public class consonent_vowel_count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String v="AEIOUaeiou";
        int c=0;
        int v1=0;
        for(char x:a.toCharArray()){
            int f=v.indexOf(x);
            if(f!=-1){
               v1++;
            }
            else{
                c++;
            }
        }
        System.out.println("consonent : "+c);
        System.out.println("vowel : "+v1);
    }
}
