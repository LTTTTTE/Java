package designPattern.strategyPattern.strategyEx01;

import java.util.Optional;

public class Ram2G implements Ram {
    @Override
    public void setRam(Computer computer) {
        computer.setMainMemory(Optional.of(2048L));
    }
}
