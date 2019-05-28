package algorithm.searchAlgo.binarySearch;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Integer[] list = ThreadLocalRandom.current()
                .ints(1,10000)
                .limit(20000).boxed().sorted().toArray(Integer[]::new);

        System.out.println("답 : " + findIndex(list , 3355));
        System.out.println("재귀답 : " + findIndexRecursive(list,0,list.length-1,3355));
    }

    public static int findIndex(Integer[] list , Integer target) throws InterruptedException {

        int leftIndex = 0;
        int rightIndex = list.length-1;
        int index;

        while(leftIndex <= rightIndex){

            index = (leftIndex+rightIndex)/2;

            if(list[index] < target)
                leftIndex = index-1;
            else if(list[index] > target)
                rightIndex = index+1;
            else
                return index;
        }
        return -1;
    }

    public static int findIndexRecursive(Integer[] list , int leftIndex , int rightIndex , Integer target){
        int index = (leftIndex + rightIndex) / 2 ;
        if(leftIndex > rightIndex) return -1;
        if(list[index].equals(target))return index;
        return (list[index] < target) ?
                findIndexRecursive(list,index -1,rightIndex,target) :
                findIndexRecursive(list,leftIndex,index +1,target);
    }
}
