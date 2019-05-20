package designPattern.strategyPattern.strategyEx02;

public class Person {

    private HeadWearable headWearable;

    public Person(HeadWearable headWearable) {
        this.headWearable = headWearable;
    }

    public void showWhatYouGot(){
        headWearable.putOn();
    }

    public void change(HeadWearable headWearable){
        System.out.println("기존것 벗음");
        this.headWearable = headWearable;
    }
}
