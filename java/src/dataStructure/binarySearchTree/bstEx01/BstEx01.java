package dataStructure.binarySearchTree.bstEx01;

public class BstEx01 {
    public static void main(String[] args) {

        BinarySearchTree tree01 = new BinarySearchTree(new Node(20));

        tree01.add(10);tree01.add(30);
        tree01.add(5);tree01.add(25);
        tree01.add(7);tree01.add(27);
        tree01.add(1);tree01.add(29);
        tree01.add(3);tree01.add(40);

        tree01.add(6);tree01.add(35);
        tree01.add(9);tree01.add(31);
        tree01.add(13);tree01.add(37);
        tree01.add(16);tree01.add(41);
        tree01.add(19);tree01.add(22);

        tree01.print();
        tree01.removeRecursive(30);
    }
}
