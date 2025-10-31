package DSA;
import java.util.*;

class insert1 {
    int front = -1;
    int rear = -1;
    int arr[] = new int[5];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        insert1 q = new insert1();

        while (true) {
            System.out.println("\nChoose operation: 1.Enqueue 2.Dequeue 3.Peek 4.Display 5.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    while (true) {
                        int val = sc.nextInt();
                        q.enqueue(val);
                    }
                    //break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public void enqueue(int a) {
        if (rear == arr.length - 1) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            arr[rear] = a;
            System.out.println(a + " enqueued.");
        }
    }

    public void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(arr[front] + " dequeued.");
            front++;
        }
    }

    public void peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element is: " + arr[front]);
        }
    }

    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}