package designPattern.singletonPattern.singletonEx02;

public class Unique03 {

    private Unique03() {
    }

    private static Unique03 getInstance(){
        return LazyInit.UNIQUE_03;
    }

    private static class LazyInit {
        static final Unique03 UNIQUE_03 = new Unique03();
    }// 클래스를 초기화하는 시점은 동기화문제가 없다.
}
