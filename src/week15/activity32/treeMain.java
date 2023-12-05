package week15.activity32;

public class treeMain {
    public static void main(String[] args) {
        BinarySearchTreeDemo tree = new BinarySearchTreeDemo();
        tree.addNode('a');
        tree.addNode('b');
        tree.addNode('c');
        tree.addNode('d');
        tree.addNode('e');
        tree.addNode('f');
        tree.addNode('g');
        System.out.println("Preorder");
        tree.preOrderTraverse(tree.getRoot());
        System.out.println();
        System.out.println("in order");
        tree.inOrderTraverse(tree.getRoot());
        System.out.println();
        System.out.println("post order");
        tree.postOrderTraverse(tree.getRoot());

    }
}
