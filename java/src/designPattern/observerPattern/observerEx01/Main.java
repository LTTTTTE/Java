package designPattern.observerPattern.observerEx01;

public class Main {
    public static void main(String[] args) {

        BroadCastStation station01 = new BroadCastStation();

        Radio radio01 = new Radio(station01);
        radio01.setRadioName("라디오1");
        Radio radio02 = new Radio(station01);
        radio02.setRadioName("라디오2");
        Radio radio03 = new Radio(station01);
        radio03.setRadioName("라디오3");
    }
}
