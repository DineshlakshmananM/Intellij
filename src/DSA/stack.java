package DSA;
import java.util.*;
class st {
    int[] a;
    int Size;
    int top;
   st (int size){
      Size=size;
      a=new int[Size];
      top=-1;
  }
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        a[++top] = value;
    }
    public boolean isFull() {
        return top == Size - 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack emoty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }
}
public class stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        st st = new st(b);
        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            } else {
                st.push(n);
            }
        }
        st.display();
    }
}
