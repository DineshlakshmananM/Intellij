package treegraph;
import java.util.*;
class Node{
    int data;
    Node right,left;
    Node(int data){
        this.data=data;
        right=left=null;
    }
}
class Treebuild{
    Node root;
    public void insert(int data){
        root=insertrec(root,data);
    }
    public Node insertrec(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
        if(data>root.data){
            root.right=insertrec(root.right,data);
        }
        else{
            root.left=insertrec(root.left,data);
        }
        return root;
    }
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    public void preorder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    void traverse(){
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        preorder(root);

    }

}
public class tree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Treebuild t=new Treebuild();
        while(true){
            int v=sc.nextInt();
            if(v<0){
                break;
            }
            t.insert(v);
        }
//        t.inorder();
//        t.preorder(t.root);
//        t.postorder(t.root);
        t.traverse();
    }
}
