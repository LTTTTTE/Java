package dataStructure.linkedList.linkedListEx01;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addLast(15);
        list.addLast(20);
        list.addLast(30);
        list.addLast(70);
        list.addLast(300);
        list.addFirst(500);
        System.out.println(list.toString());
        list.removeLast();
        System.out.println(list.toString());
        list.removeFirst();
        System.out.println(list.toString());
    }
}
