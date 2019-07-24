package algorithm.sortAlgo.quickSort;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = ThreadLocalRandom.current().ints(1,100).limit(20).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.toString(integers));
        quickSort(integers,0,integers.length-1);
        System.out.println(Arrays.toString(integers));
    }

    public static void quickSort(Integer[] list , int left , int right){

        if(left >= right) return;

        int key = left;
        int start = left +1;
        int end = right;
        int temp;

        while(start <= end ){

            while(list[start] <= list[key]) start++;
            while(list[end] >= list[key] && end > left) end--;

            if(start > end){
                temp = list[end];
                list[end] = list[key];
                list[key] = temp;
            }
            else{
                temp = list[end];
                list[end] = list[start];
                list[start] = temp;
            }
        }

        quickSort(list,left,end - 1);
        quickSort(list,end + 1,right);
    }
}
