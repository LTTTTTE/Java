package designPattern.strategyPattern.strategyEx01;

public class hdd250Gb implements Hdd {
    @Override
    public void setStorage(Computer computer) {
        computer.setSubMemory(250L);
    }
}
