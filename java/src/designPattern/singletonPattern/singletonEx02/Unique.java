package designPattern.singletonPattern.singletonEx02;

public class Unique {

    private volatile static Unique unique;
    //동기화시 각스레드에서의 캐쉬마다 instance 가 저장되므로.. volatile 로 해결

    private Unique(){}

    public static Unique getInstance(){
        if(unique == null){
            synchronized (Unique.class){
    //getInstance 메소드 전체를 동기화블록으로 사용시 웬종일 Lock 중이다.
                if(unique == null){
                    unique = new Unique();
                }
            }
        }
        return unique;
    }
}
