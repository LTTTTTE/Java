package designPattern.strategyPattern.strategyEx01;

import java.util.Optional;
import java.util.OptionalLong;

public class Computer {

    private Optional<Ram> ram;
    private Optional<Cpu> cpu;
    private Optional<Hdd> hdd;
    private Optional<Long> mainMemory;
    private Optional<Double> cpuClock;
    private Optional<Long> subMemory;

    public Computer() {
    }

    public Long getMainMemory() {
        return mainMemory.orElse(0L);
    }

    public Double getCpuClock(){
        return cpuClock.orElse(0D);
    }

    public Long getSubMemory(){
        return subMemory.orElse(0L);
    }

    public void selectRam(Ram ram){
        this.ram = Optional.ofNullable(ram);
        this.ram.orElse(null).setRam(this);
    }

    public void selectCpu(Cpu cpu){
        this.cpu = Optional.ofNullable(cpu);
        this.cpu.orElse(null).setCpu(this);
    }

    public void selectHdd(Hdd hdd){
        this.hdd = Optional.ofNullable(hdd);
        this.hdd.orElse(null).setStorage(this);
    }

    public void setMainMemory(Long mainMemory) {
        this.mainMemory = Optional.ofNullable(mainMemory);
    }
    public void setCpuClock(Double cpuClock){
        this.cpuClock = Optional.ofNullable(cpuClock);
    }
    public void setSubMemory(Long subMemory){
        this.subMemory = Optional.ofNullable(subMemory);
    }

    public void showSpec(){
        System.out.println("메인메모리 : " +getMainMemory()+"Mb");
        System.out.println("CPU 쿨럭 : "+getCpuClock()+"GHz");
        System.out.println("보조기억장치 : " + getSubMemory()+"Gb");
    }
}
