package designPattern.strategyPattern.strategyEx01;

import java.util.Optional;

public class hdd250Gb implements Hdd {
    @Override
    public void setStorage(Computer computer) {
        computer.setSubMemory(Optional.of(250L));
    }
}
