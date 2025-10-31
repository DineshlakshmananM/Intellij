package DSA;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Single{
    static Node head,tail;
    static void create(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
    }
    void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
    void insert(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }else{
            newnode.next=head;
            head=newnode;
        }
    }
}
public class single_linked_list {
    public static void main(String[] args) {
        Single a=new Single();
        a.create(10);
        a.create(20);
        a.create(30);
        a.display();
        System.out.println("insert at first");
        a.insert(5);
        a.display();
    }
}
