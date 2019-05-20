package designPattern.strategyPattern.strategyEx03;

public class Main {
    public static void main(String[] args) {

        BusCard card01 = new BusCard(new PaymentAsAdult());
        BusCard card02 = new BusCard(new PaymentAsAdult());
        //성인한명요
        card01.pay();
        //성인하나 학생 하나요
        card02.pay();
        card02.setPayment(new PaymentAsStudent());
        card02.pay();
        card02.pay();



    }
}
