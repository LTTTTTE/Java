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

    }
}
