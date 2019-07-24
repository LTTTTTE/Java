package designPattern.builderPattern.first;

public class Main {

    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone.Builder()
                .body(true)
                .battery(true)
                .camera(true)
                .screen(true)
                .speaker(false)
                .build();

        smartPhone.showSpec();
    }
}
