package designPattern.builderPattern.test;

public class Main {
    public static void main(String[] args) {

        Person person = new Person.Builder()
                .height(100)
                .hungry(true)
                .money(10)
                .name("나")
                .build();

        person.showSpec();
    }
}
