package basic;
import java.util.*;
public class array_sort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int[][]c=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                c[i][j]=sc.nextInt();
            }
        }
        for(int arr[]:c){
            Arrays.sort(arr);
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
