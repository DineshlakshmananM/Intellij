package basic;

import java.util.Scanner;

public class add_outer_box_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[][]b=new int[a][a];
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
            b[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if(i==0 ||j==0||i==a-1||j==a-1){
                    sum+= b[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
