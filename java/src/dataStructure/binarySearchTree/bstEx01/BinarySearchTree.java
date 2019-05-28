package dataStructure.binarySearchTree.bstEx01;

public class BinarySearchTree {

    public Node root;

    public BinarySearchTree(Node root) {
        this.root = root;
    }

    public Node search(int data){

        Node now = root;

        while(true) {
            if(now.getData() == data) return now;

            if (now.getData() > data) {
                if(now.leftChild == null) {

                    return now;
                }

                now = now.leftChild;
            }
            else if(now.getData() < data) {
                if(now.rightChild == null){

                    return now;
                }

                now = now.rightChild;
            }
        }
    }

    public void add(int data){
        Node target = search(data);
        if(target.getData() == data) {
            System.out.println("이미존재 하므로 ... "+data+" add 실패");
            return;
        }
        if(target.getData() > data) {

            target.leftChild = new Node(data);
        }
        else {

            target.rightChild = new Node(data);
        }
        System.out.println(data +" 추가완료");
    }

    public void print(){
        System.out.print("[");
        printLogic(root);
        System.out.println("]");
    }

    public void printLogic(Node node){

        if(node != null){
            System.out.print(node.getData()+ " ");
            printLogic(node.leftChild);
            printLogic(node.rightChild);
        }

    }
    public Node searchRecursive(int data){
        return searchRecursiveLogic(root,data);
    }

    public Node searchRecursiveLogic(Node node,int data){
        if(node != null){
            if(node.getData() == data) return node;
            return (node.getData() > data) ? searchRecursiveLogic(node.leftChild,data) :
                    searchRecursiveLogic(node.rightChild,data);
        }
        return null;
    }

    public void addRecursive(int data){
        addRecursiveLogic(root,data);
    }

    public void addRecursiveLogic(Node node, int data){

        if(node.getData() == data){ System.out.println("이미존재");return;}
        if(node.getData() > data){
            if(node.leftChild == null) {
                node.leftChild = new Node(data);
                System.out.println(data +" 추가완료");
                return;
            }
            addRecursiveLogic(node.leftChild,data);
        }
        else{
            if(node.rightChild == null) {
                node.rightChild = new Node(data);
                System.out.println(data +" 추가완료");
                return;
            }
            addRecursiveLogic(node.rightChild,data);
        }
    }

    public void removeRecursive(int data){
        removeRecursiveLogic(searchRecursive(data));
    }

    public void removeRecursiveLogic(Node node){

        if(node.leftChild == null && node.rightChild == null){
            node = null;
            System.out.println("자식없어 바로죽임");
        }
        else if(node.leftChild != null && node.rightChild != null){

            if(node.leftChild.rightChild != null){
                node.setData(node.leftChild.rightChild.getData());
                removeRecursiveLogic(node.leftChild.rightChild);
                System.out.println("결국 ! 두명의 자식이 있었으나 죽임");
                return;
            }
            if(node.rightChild.leftChild != null){
                node.setData(node.rightChild.leftChild.getData());
                removeRecursiveLogic(node.rightChild.leftChild);
                System.out.println("결국 ! 두명의 자식이 있었으나 죽임");
                return;
            }
            

            System.out.println("오류");
        }
        else if(node.leftChild == null){
            node.setData(node.rightChild.getData());
            node.rightChild = null;
            System.out.println("오른쪽 자식이 있었으나 죽임.");
        }
        else{
            node.setData(node.leftChild.getData());
            node.leftChild = null;
            System.out.println("왼쪽 자식이 있었으나 죽임.");
        }

    }
}
