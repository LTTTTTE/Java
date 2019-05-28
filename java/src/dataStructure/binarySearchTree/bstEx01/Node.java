package dataStructure.binarySearchTree.bstEx01;

public class Node {

    private int data;
    public Node leftChild;
    public Node rightChild;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }

    public void print(){
        System.out.println(toString());
    }
}
