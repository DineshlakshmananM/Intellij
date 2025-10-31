package basic;
import java.util.*;
public class high_digit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        List<Integer>l=new ArrayList<>();
        while(b!=0){
            int r=b%10;
            l.add(r);
            b/=10;
        }
//        for(int x:l){
//            System.out.print(x);
//        }
        while(a!=0){
            for(int i=0;i<l.size()-1;i++){
                if(l.get(i)<l.get(i+1)){
                    int t=l.get(i);
                    l.add(i,(l.get(i+1)));
                    l.add(i+1,(t));
                    //break;
                }
            }
            a--;
        }
       // System.out.print(l.size());
        for(int x:l){
            System.out.print(x);
        }
    }
}
