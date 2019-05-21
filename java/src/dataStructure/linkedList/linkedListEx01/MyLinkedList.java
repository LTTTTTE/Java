package dataStructure.linkedList.linkedListEx01;

public class MyLinkedList<T> {

    private Node head;
    private Node tail;
    private Integer length;

    public MyLinkedList() {
        this.length = 0;
    }

    public void addFirst(T data){
        if(head != null){
            Node newNode = new Node(data);
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        else{
            tail = head = new Node(data);
        }
        length++;
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
        length++;
    }

    public void addIndex(T data , Integer idx){
        if(length == 0 || idx >= length) addLast(data);
        if(idx == 0) addFirst(data);
        int i = 0;

        Node target = head;

        while(i++ != idx - 1){
            target = target.next;
        }
        Node after = target.next;
        Node newNode = new Node(data);
        target.next = newNode;
        newNode.prev = target;
        newNode.next = after;
        after.prev = newNode;

        length++;
    }

    public void removeFirst(){
        if(head == null) return;
        head = head.next;
        head.next.prev = head;
        length--;
    }

    public void removeLast(){
        if(head == null) return;
        tail = tail.prev;
        tail = tail.prev.next;
        tail.next = null;
        length--;
    }
    public void removeIndex(Integer idx){
        if(head == null) return;
        if(idx == 0) removeFirst();
        if(idx == length-1) removeLast();
        int i = 0;
        Node target = head;

        while(i++ != idx){
            target = target.next;
        }
        Node before = target.prev;
        before.next = target.next;
        before.next.prev = before;
        length--;

    }

    public Integer getLength(){
        return length;
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
