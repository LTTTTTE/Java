package dataStructure.heap.heapEx01;

import java.util.concurrent.ThreadLocalRandom;

public class heapEx01{
    public static void main(String[] args) {
    Integer[] list = ThreadLocalRandom.current().ints(1,100).limit(20).boxed().toArray(Integer[]::new);
    MyHeap heap = new MyHeap(list);
    heap.toString();
    }
}
