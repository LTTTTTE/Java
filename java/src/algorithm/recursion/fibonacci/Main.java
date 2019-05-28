package algorithm.recursion.fibonacci;

public class Main {
    public static void main(String[] args) {

        Fibo fibo = new Fibo(43L,new GoodFiboAlgo());
        Long time = System.currentTimeMillis();
        fibo.showResult();
        System.out.println(System.currentTimeMillis()-time+"ms");
    }

}
