package dataStructure.linkedList.linkedListEx01;

public class MyLinkedList<T> {

    private Node head;
    private Node tail;

    public void addFirst(T data){
        if(head == null){
           tail = head = new Node(data);
        }
        else{
            Node newNode = new Node(data);
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(T data){
        if(head == null){
            tail = head = new Node(data);
        }
        else{
            Node newNode = new Node(data);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void removeFirst(){
        if(head == null) return;
        head = head.next;
        head.next.prev = head;
    }

    public void removeLast(){
        if(head == null) return;
        tail = tail.prev;
        tail = tail.prev.next;
        tail.next = null;
    }

    @Override
    public String toString() {
        String str = "[";
        for(Node idx = head ; idx != null ; idx = idx.next){
            str += idx.data;
            if(idx.next!=null) str+=",";
        }

        return str+"]";
    }
}
