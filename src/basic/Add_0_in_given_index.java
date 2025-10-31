package basic;
import java.util.*;
public class Add_0_in_given_index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[]b=new int[a];
        for(int i=0;i<a;i++){
            b[i]=sc.nextInt();
        }
        int[]c=new int[a];
       int l=0;
       int l1=0;
       while(l1!=a-1){
           if(b[l]==0){
               c[l1]=b[l];
               l1++;
               if(l1>=a){
                   break;
               }
               c[l1]=0;
               l++;
               l1++;
           }
           else{
               if(l1>=a){
                   break;
               }
               c[l1]=b[l];
               l1++;
               l++;
           }
       }
       for(int x:c){
       System.out.print(x+" ");
       }
    }
}
