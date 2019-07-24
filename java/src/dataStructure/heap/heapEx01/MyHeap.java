package dataStructure.heap.heapEx01;

public class MyHeap {

    private Integer[] heap;

    public MyHeap(Integer[] list) {
        heap = new Integer[list.length+1];
        for(int i = 1;i < heap.length ; i++){
            int child = i;

            do{
                int root = (child - 1)/2;
                if(heap[root] < heap[child]){
                    int temp = heap[root];
                    heap[root] = heap[child];
                    heap[child] = temp;
                }
                child = root;
            }while(child != 0);
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[");
        for (Integer integer : heap) {
            str.append(integer+" , ");
        }
        str.append("]");
        return str.toString();
    }
}
