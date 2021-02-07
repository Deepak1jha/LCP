public class Tree {

    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;
        public Node (int value){
            this.value = value;
        }
    } 
    private Node root;
    public void insert (int value ){
        Node node = new Node(value);
        if(root == null){
            root = node;
            return;
        }
        Node currentNode = root;
        while(true){
            if(value < currentNode.value){
                if(currentNode.leftChild == null){
                 currentNode.leftChild=node;
                 break;
                }
            currentNode=currentNode.leftChild;
            }else {
                if(currentNode.rightChild==null){
                    currentNode.rightChild=node;
                     break;
                }
            currentNode=currentNode.rightChild;
            }
        }
    } 

    public Boolean find(int value){
        Node current = root;
        while(current != null){
            if(value < current.value){
                current = current.leftChild;
            }else if(value > current.value){
                current = current.rightChild;
            }else {
                return true;
            }
        }
        return false;
    }
    public void traversalPreOrder() {
        traversalPreOrder(root);
    }
    private void traversalPreOrder(Node node) {
        if (node==null) return;
        System.out.println(node.value);
        traversalPreOrder(node.leftChild);
        traversalPreOrder(node.rightChild);
    }

    public int getHeightOfTree(){
       return getHeightOfTree(root);
    }

    private int getHeightOfTree(Node node){
        if(node==null) return -1;
        if (node.leftChild==null && node.rightChild==null ) return 0;
        return 1 + Math.max(getHeightOfTree(node.leftChild),getHeightOfTree(node.rightChild));
    }

public static void main(String[] args) {
    Tree tree=new Tree();
    tree.insert(7);
    tree.insert(4);
    tree.insert(1);
    tree.insert(6);
    tree.insert(9);
    tree.insert(8);
    tree.insert(10);
    System.out.println(tree.find(3));
    tree.traversalPreOrder();
    System.out.println("Height of tree is ==>" + tree.getHeightOfTree());

    }
}