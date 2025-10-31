package DSA;
import java.util.*;
class insert{
    int front=-1;
    int rear =-1;
    int arr[]=new int[5];
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        insert q=new insert();
        q.enqueue(11);
        q.enqueue(13);
        q.enqueue(12);
        q.enqueue(14);
        q.enqueue(15);
    }
    public void enqueue(int a){
        if(rear == arr.length-1){
            System.out.print("queue is full");
        }
        else{
            if(front ==-1){
                front =0;
            }
            rear++;
            arr[rear]=a;
            System.out.print(a+" ");
        }
    }
}

