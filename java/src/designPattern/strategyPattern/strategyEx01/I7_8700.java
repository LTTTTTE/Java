package designPattern.strategyPattern.strategyEx01;

public class I7_8700 implements Cpu {
    @Override
    public void setCpu(Computer computer) {
        computer.setCpuClock(3.5);
    }
}
