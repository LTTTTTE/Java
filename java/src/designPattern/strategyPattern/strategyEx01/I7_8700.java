package designPattern.strategyPattern.strategyEx01;

import java.util.Optional;

public class I7_8700 implements Cpu {
    @Override
    public void setCpu(Computer computer) {
        computer.setCpuClock(Optional.of(3.5D));
    }
}
