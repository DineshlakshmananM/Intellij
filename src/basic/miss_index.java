package basic;
import java.util.*;
public class miss_index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[]b=new int[a];
        for(int i=0;i<a;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<a-1;i++){
            if(b[i]+1!=b[i+1]){
                System.out.print(i+1);
            }
        }
    }
}
