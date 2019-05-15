package designPattern.singletonPattern.singletonEx02;

public class Unique02 {

    private static Unique02 unique02 = new Unique02();
    // 프로그램 실행시 바로할당되며 동기화문제는없다?
    private Unique02(){}

    public static Unique02 getInstance(){
        return unique02;
    }
}
