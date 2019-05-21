package algorithm.sortAlgo.mergeSort;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static Integer[]temp = new Integer[20];

    public static void main(String[] args) {
        Integer[] integers = ThreadLocalRandom.current().ints(1,100).limit(20).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.toString(integers));
        mergeSort(integers,0,integers.length-1);
        System.out.println(Arrays.toString(integers));
    }

    public static void mergeSort(Integer list[] , int left , int right){

        int mid;
        if(left < right){
            mid = (left + right)/2;
            mergeSort(list,left,mid);
            mergeSort(list,mid+1,right);
            merge(list,left,mid,right);
        }
    }

    public static void merge(Integer list[] , int left , int mid , int right) {

        final int startIndex = left;
        final int leftMax = mid;
        final int rightMax = right;

        for (int i = startIndex; i <= rightMax; i++) {

            if (left > leftMax) {
                temp[i] = list[mid++ + 1];
                continue;
            }
            if (mid + 1 > rightMax) {
                temp[i] = list[left++];
                continue;
            }

            temp[i] = (list[left] <= list[mid + 1]) ? list[left++] : list[mid++ + 1];
        }

        for (int i = startIndex; i <= rightMax; i++)
            list[i] = temp[i];
    }
}