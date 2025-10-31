package graph;
import java.util.ArrayList;
class gcre{
    int v;
    ArrayList<ArrayList<Integer>> l=new ArrayList<>();
    gcre(int v){
        this.v=v;
        for(int i=0;i<v;i++){
            l.add(new ArrayList<>());
        }
       // System.out.println(l.toString());
    }
    void addE(int v, int n){
        if(n<l.size() && v<l.size()){
            l.get(v).add(n);
            l.get(n).add(v);
            System.out.println(l.toString());
        }
    }
    void pem(int v,int n){
        if(n<l.size() && v>l.size()){
            l.get(v).remove(Integer.valueOf(n));
            l.get(n).remove(Integer.valueOf(v));
        }
    }
    void newadd(int n){
        if(n<l.size() && n>=0){
          l.add(n,new ArrayList<>());
        }
    }
    void dis(){
        System.out.println("Graph:");
        for (int i = 0; i < l.size(); i++) {
            System.out.print(i + " -> ");
            for (int j : l.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
public class implement_graph {
    public static void main(String[] args) {
        gcre a=new gcre(5);

        a.addE(0,1);
        a.addE(1,2);
        a.addE(2,3);
        a.addE(3,4);
        System.out.print("create graph");
        a.dis();
        System.out.print("remove graph");
        a.pem(3,4);
        a.dis();
        System.out.print("add graph");
        a.newadd(1);

        a.dis();
    }
}
