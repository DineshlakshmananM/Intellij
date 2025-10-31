
import java.util.*;
class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data=data;
        this.next=null;
    }
}
class Simple{
    static Node1 head,tail;
    static void create(int data){
        Node1 newnode=new Node1(data);
        if(head==null) {
            head = newnode;
            tail = newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
    } void display(){
        Node1 current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
    void insert(int data){
        Node1 newnode=new Node1(data);
        if(head==null){
            head=newnode;
        }else{
            newnode.next=head;
            head=newnode;
        }
    }
    void end(int data){
        Node1 v=new Node1(data);
        if(tail==null){
            tail=v;
        }
        else {
            tail.next= v;
            tail=v;
        }
    }
    void delete(){
      head=head.next;
    }
    void end_delete(){
        Node1 cur=head;
        while (cur.next.next!= null) {
        cur=cur.next;
        }
        tail=cur;
        tail.next=null;
        }
// void pos(int data){
//        Node1 cur=head;
//        while(cur)
// }


}

public class file {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Simple l=new Simple();
        while(true){
            int n=sc.nextInt();
            if(n==-1){
                break;
            }
            else {
                l.create(n);
            }
        }
        int a=sc.nextInt();
        l.insert(a);
        int e=sc.nextInt();
        l.end(e);
        l.display();
        l.delete();
        l.display();
        l.end_delete();
        l.display();
    }
}
