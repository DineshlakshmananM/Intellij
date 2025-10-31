package DSA;
import java.util.*;
class Node3{
    int data;
    Node3 next;
    Node3(int data){
        this.data=data;
        this.next=null;
    }
}
class linkstack {
    static Node3 head, tail;

    static void create(int data) {
        Node3 newnode = new Node3(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    void display() {
        Node3 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    void insert(int data) {
        Node3 newnode = new Node3(data);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }
}