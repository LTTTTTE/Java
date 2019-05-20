package designPattern.strategyPattern.strategyEx02;

public class Hat implements HeadWearable {
    @Override
    public void putOn() {
        System.out.println("모자씀");
    }
}
