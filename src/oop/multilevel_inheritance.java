package oop;
class A1 {
    void displayA() {
        System.out.println("This is class A (the grandparent).");
    }
}
class B1 extends A1 {
    void displayB() {
        System.out.println("This is class B (the parent).");
    }
}
class C1 extends B1 {
    void displayC() {
        System.out.println("This is class C (the child).");
    }
}
public class multilevel_inheritance {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.displayA();
        obj.displayB();
        obj.displayC();
    }
}
