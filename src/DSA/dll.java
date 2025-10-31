package DSA;
class Node2{
    int data;
    Node2 next;
    Node2 prev;
    Node2(int data){
        this.data=data;
        this.next=null;
    }
}
class Double{
    static Node2 head,tail;
    static void create(int data){
        Node2 newnode=new Node2(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
           newnode.prev=tail;
           tail.next=newnode;
           tail=newnode;
        }
    }
    void display(){
        Node2 current1=head;
        while(current1!=null){
            System.out.print(current1.data+" ");
            current1=current1.next;
        }System.out.println();
        System.out.println("revers");
        Node2 current=tail;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.prev;
        }
        System.out.println();
    }
    void Pos(int data,int pos){
        Node2 current1=head;
        if(pos<1) System.out.println("Error");
        else{
            Node2 newnode=new Node2(data);
            for(int i=1;i<pos-1 && current1!=null;i++){
                current1=current1.next;
            }
            newnode.next=current1.next;
            current1.next.prev=newnode;
            newnode.prev=current1;;
            current1.next=newnode;
        }
    } void Posdelete(int pos) {
        Node2 current1 = head;
        if (pos < 1) System.out.println("Error");
        else {
            for (int i = 1; i < pos - 1 && current1 != null; i++) {
                current1 = current1.next;
            }
            current1.next= current1.next.next;
            current1.next.prev = current1;
        }
    }
    void end(int data){
        Node2 v=new Node2(data);
        if(tail==null){
            tail=v;
        }
        else {
            tail.next= v;
            v.prev=tail;
            tail=v;
        }
    }
}
public class dll {
    public static void main(String[] args){
        Double dll=new Double();
        dll.create(12);
        dll.create(4);
        dll.create(90);
        dll.create(9);
        dll.create(97);
        dll.display();
        System.out.println("inseret end");
        dll.end(10);
        dll.display();
        System.out.println("inseret pos");
        dll.Pos(20,5);
        dll.display();
        System.out.println("delete pos");
        dll.Posdelete(5);
        dll.display();

    }
}
