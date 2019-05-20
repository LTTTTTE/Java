package designPattern.strategyPattern.strategyEx01;

import java.util.Optional;

public class I5_4590 implements Cpu{
    @Override
    public void setCpu(Computer computer) {
        computer.setCpuClock(Optional.of(2.9D));
    }
}
