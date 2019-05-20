package designPattern.strategyPattern.strategyEx02;

public class strategyEx02 {
    public static void main(String[] args) {

        Person person = new Person(new Hat());
        person.showWhatYouGot();

        person.change(new Sunglass());
        person.showWhatYouGot();
    }
}
