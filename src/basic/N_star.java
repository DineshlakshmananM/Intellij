package basic;
import java.util.Scanner;
public class N_star {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            for(int i=0;i<a;i++){
                for(int j=0;j<a;j++){
                    if((j==0 || j==a-1)|| (i==j)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }



