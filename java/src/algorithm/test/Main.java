package algorithm.test;

public class Main {
    public static void main(String[] args) {

        int[] list = new int[5];
        list[0] =1;
        list[1] =2;
        list[2] =3;
        list[3] =4;
        list[4] =5;
        System.out.println(rsum(list,5));
    }

    public static int rsum(int[]list , int n){
        if(n>0){
            System.out.println(list[n-1]);
            return rsum(list,n-1) + list[n-1];
        }

        return 0;
    }
}
