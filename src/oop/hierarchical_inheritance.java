package oop;
class A {
    void display() {
        System.out.println("This is class A (the parent).");
    }
}
class B extends A {
    void showB() {
        System.out.println("This is class B (child of A).");
    }
}
class C extends A {
    void showC() {
        System.out.println("This is class C (child of A).");
    }
}
public class hierarchical_inheritance {
    public static void main(String[] args) {
        B objB = new B();
        objB.display();
        objB.showB();
        C objC = new C();
        objC.display();
        objC.showC();
    }
}

