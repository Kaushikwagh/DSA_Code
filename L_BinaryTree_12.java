// Question 01

//public class L_BinaryTree_12 {
//        static class Node {
//            int data;
//            Node left;
//            Node right;
//            Node(int data) {
//                this.data = data;
//                this.left = null;
//                this.right = null;
//            }
//        }
//        static class BinaryTree {
//            static int idx = -1;
//            public static Node buildTree(int nodes[]) {
//                idx++;
//                if(nodes[idx] == -1) {
//                    return null;
//                }
//                Node newNode = new Node(nodes[idx]);
//                newNode.left = buildTree(nodes);
//                newNode.right = buildTree(nodes);
//                return newNode;
//            }
//            public static void preorder(Node root) {
//                if(root == null) {
//                    System.out.print(-1+" ");
//                    return;
//                }
//                System.out.print(root.data+" ");
//                preorder(root.left);
//                preorder(root.right);
//            }
//
//        }
//    public static void main(String[] args){
//            int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
//            BinaryTree tree = new BinaryTree();
//
//            Node root = tree.buildTree(nodes);
//            System.out.println(root.data);
//    }
//}

// Question 02:- Build a BST
// values[] = 5,1,3,4,2,7

class L_BinaryTree_12{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    // Insert
    public static Node insert(Node root, int val){
        // compare
        if(root == null){
            root  = new Node(val);
            return root;
        }
        if(root.data > val){
            // left subtree
           root.left =  insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // inorder
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }
    // ---------------------------------------------
    // Search Key in binary tree
    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        // search in left key
        if(root.data > key){
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return search(root.right,key);
        }
    }
    // ---------------------------------------------
    // Delete row
    public static Node delete(Node root, int val){
        // search number which is delete
        if(root.data>val){
            root.left = delete(root.left, val);
        } else if(root.data < val){
            root.right = delete(root.right, val);
        // search complete now delete condition
        } else {
                if (root.left == null && root.right == null){
                    return null;
                }
                if (root.left == null){
                    return root.right;
                }
                else if(root.right == null){
                    return root.left;
                }
                Node IS = inorderSuccessor(root.right);
                root.data = IS.data;
                root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    // ---------------------------------------------
    public static void main(String[] args){
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        // traverse value
        for(int i = 0; i<values.length;i++){
            root = insert(root,values[i]);
        }

        // inorder
        inorder(root);
        System.out.println();

        // find key
        if(search(root,2)){
            System.out.println("found");
        } else {
            System.out.println("not found");
        }

        // delete
        delete(root,4);
        inorder(root);
    }
}