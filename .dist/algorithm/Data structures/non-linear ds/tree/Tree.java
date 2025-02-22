import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// TreeNode class definition
class TreeNode<T> {
    T data;
    TreeNode<T> lTreeNode;
    TreeNode<T> rTreeNode;

    public TreeNode(T data) {
        this.data = data;
        this.lTreeNode = null;
        this.rTreeNode = null;
    }
}

public class Tree {
    
    public static void main(String[] args) {
        System.out.println("Tree Data Structure");
        TreeNode<Integer> root = new TreeNode<>(6);  // Root node with value 6
        createTree(root);  // Build the tree
        dfs(root);  // Perform DFS Traversal
        BFS.traverseLevelOrder(root);
    }

    private static void createTree(TreeNode<Integer> node) {
        Scanner sc = new Scanner(System.in);
        
        try {
            // Prompt user for left and right children
            System.out.print("Enter left child for node " + node.data + ": ");
            Integer leftData = sc.nextInt();
            System.out.print("Enter right child for node " + node.data + ": ");
            Integer rightData = sc.nextInt();

            // If left child is not zero, create a left subtree
            if (leftData != 0) {
                node.lTreeNode = new TreeNode<>(leftData);
                createTree(node.lTreeNode);  // Recursively create the left subtree
            }

            // If right child is not zero, create a right subtree
            if (rightData != 0) {
                node.rTreeNode = new TreeNode<>(rightData);
                createTree(node.rTreeNode);  // Recursively create the right subtree
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers.");
        } finally {
            // We don't close the scanner here, as it's done at the end of the program.
            // It's a good practice to close it once after all input is complete.
        }
    }

    private static void dfs(TreeNode<Integer> treeNode) {
        if (treeNode == null) return; // Base case for null node
        
        System.out.println("Preorder Traversal:");
        DFS.preorderTraversal(treeNode);  // Perform pre-order traversal

        System.out.println("\nIn-order Traversal:");
        DFS.inorderTraversal(treeNode);  // Perform in-order traversal

        System.out.println("\nPost-order Traversal:");
        DFS.postOrderTraversal(treeNode);  // Perform post-order traversal
    }
}

// DFS Traversal class
class DFS {

    // Pre-order Traversal: Root -> Left -> Right
    public static <T> void preorderTraversal(TreeNode<T> treeNode) {
        if (treeNode == null) return;  // Base case for null node
        System.out.print(treeNode.data + " ");  // Visit root node
        preorderTraversal(treeNode.lTreeNode);  // Visit left subtree
        preorderTraversal(treeNode.rTreeNode);  // Visit right subtree
    }

    // In-order Traversal: Left -> Root -> Right
    public static <T> void inorderTraversal(TreeNode<T> treeNode) {
        if (treeNode == null) return;  // Base case for null node
        inorderTraversal(treeNode.lTreeNode);  // Visit left subtree
        System.out.print(treeNode.data + " ");  // Visit root node
        inorderTraversal(treeNode.rTreeNode);  // Visit right subtree
    }

    // Post-order Traversal: Left -> Right -> Root
    public static <T> void postOrderTraversal(TreeNode<T> treeNode) {
        if (treeNode == null) return;  // Base case for null node
        postOrderTraversal(treeNode.lTreeNode);  // Visit left subtree
        postOrderTraversal(treeNode.rTreeNode);  // Visit right subtree
        System.out.print(treeNode.data + " ");  // Visit root node
    }
}

class BFS{

   public static <T> void traverseLevelOrder(TreeNode node){
    // Stack<T> st= new Stack<>();
    System.out.println("Level order traversal4");
    if (node == null) {
        return; // If the tree is empty, just return
    }
       Queue<TreeNode> queue=new LinkedList<>();
       queue.add(node);
       while(!queue.isEmpty()){
        TreeNode cuTreeNode=queue.poll();
        System.out.println(cuTreeNode.data);

       
            if(cuTreeNode.lTreeNode !=null){
                queue.add(cuTreeNode.lTreeNode);
            }
            if(cuTreeNode.rTreeNode !=null){
                queue.add(cuTreeNode.rTreeNode);
            }
        

}



   }


}