import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {

    static int index = -1;

    // buildTree
    public Node buildTree(int[] nodes) {
        index++;

        if (nodes[index] == -1)
            return null;

        Node newNode = new Node(nodes[index]);

        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    // DFS

    // preorder - NLR
    void preOrder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // postorder - LRN
    void postOrder(Node root) {
        if (root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }

    // inorder
    void inOrder(Node root) {
        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    // BFS

    // levelorder
    void levelOrderTraversal(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();

        q.offer(root);

        while (!q.isEmpty()) {

            Node curr = q.poll();

            System.out.print(curr.data+" ");

            if (curr.left != null)
                q.offer(curr.left);

            if (curr.right != null)
                q.offer(curr.right);
        }
    }

    // levelOrderTraversalLineByLine
    void levelOrderTraversalLineByLine(Node root){
        if(root == null) return;

        Queue<Node> q = new LinkedList<>();

        q.offer(root);

        while (!q.isEmpty()) {
            
            int size = q.size();

            for(int i = 0; i<size; i++){

                Node curr = q.poll();

                System.out.print(curr.data+" ");

                if(curr.left != null) q.offer(curr.left);

                if(curr.right != null) q.offer(curr.right);
            }
            System.out.println();
        }
    }

}

public class Index {
    public static void main(String[] args) {

        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, -1 };

        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);

        System.out.println("PreOrder .....");

        tree.preOrder(root);

        System.out.println();

        System.out.println("PostOrder .....");

        tree.postOrder(root);

        System.out.println();

        System.out.println("InOrder .....");

        tree.inOrder(root);

        System.out.println();

        
        System.out.println("LevelOrder .....");

        tree.levelOrderTraversal(root);

           System.out.println();

        System.out.println("LevelOrderLineByLine .....");

        tree.levelOrderTraversalLineByLine(root);

    }

}
