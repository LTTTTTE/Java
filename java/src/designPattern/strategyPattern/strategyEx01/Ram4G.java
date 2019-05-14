package designPattern.strategyPattern.strategyEx01;

public class Ram4G implements Ram {
    @Override
    public void setRam(Computer computer) {
        computer.setMainMemory(4096L);
    }
}
