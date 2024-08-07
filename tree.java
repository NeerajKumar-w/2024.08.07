import java.util.*;

public class Node{
    int data;
    Node left, right;
    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class tree {
    public static ArrayList<Integer> preorder(Node node, ArrayList<Integer> stack) {
        if(node == null){
            return stack;
        }
        preorder(node.left, stack); 
        stack.add(node.data);
        preorder(node.right, stack);
        return stack;
    }
    public static ArrayList<Integer> inorder(Node node, ArrayList<Integer> stack) {
        if(node == null){
            return stack;
        }
        stack.add(node.data);
        inorder(node.left, stack); 
        inorder(node.right, stack);
        return stack;
    }
    public static ArrayList<Integer> postorder(Node node, ArrayList<Integer> stack) {
        if(node == null){
            return stack;
        }
        postorder(node.left, stack); 
        postorder(node.right, stack);
        stack.add(node.data);
        return stack;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.right.left = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);
        ArrayList<Integer> instack = new ArrayList<>();
        ArrayList<Integer> prestack = new ArrayList<>();
        ArrayList<Integer> poststack = new ArrayList<>();
        instack = inorder(root, instack);
        prestack = preorder(root, prestack);
        poststack = postorder(root, poststack);
        System.out.println(instack);
        System.out.println(prestack);
        System.out.println(poststack);
    }
}
