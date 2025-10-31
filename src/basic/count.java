package basic;
import java.util.*;
public class count {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[]b=new int[a];
        for(int i=0;i<a;i++){
            b[i]=sc.nextInt();
        }
        int c=1;
        for(int i=1;i<a;i++){
            int v=0;
            for(int j=0;j<i;j++){
               if(b[i]<b[j]) v++;
            }
            if(v==0) c++;
        }
        System.out.print(c);
    }
}
