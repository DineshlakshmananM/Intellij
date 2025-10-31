package oop;
class a{
    void tea(){
        System.out.println("tea");
    }
}
class b extends a{
    void cof(){
        System.out.println("cof");
    }
}
public class single_inheritance {
    public static void main(String[] args){
        b v=new b();
        v.cof();
        v.tea();
    }
}
