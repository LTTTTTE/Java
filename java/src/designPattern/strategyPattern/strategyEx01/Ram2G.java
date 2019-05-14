package designPattern.strategyPattern.strategyEx01;

public class Ram2G implements Ram {
    @Override
    public void setRam(Computer computer) {
        computer.setMainMemory(2048L);
    }
}
