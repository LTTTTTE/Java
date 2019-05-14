package designPattern.strategyPattern.strategyEx01;

public class Computer {

    private Ram ram;
    private Cpu cpu;
    private Long mainMemory;
    private Double cpuClock;

    public Computer() {
    }

    public Long getMainMemory() {
        if(mainMemory.equals(null)){
            return 0L;
        }
        return mainMemory;
    }
    public Double getCpuClock(){
        if(cpuClock.equals(null)){
            return 0D;
        }
        return cpuClock;
    }

    public void selectRam(Ram ram){
        this.ram = ram;
        this.ram.setRam(this);
    }

    public void selectCpu(Cpu cpu){
        this.cpu = cpu;
        this.cpu.setCpu(this);
    }

    public void setMainMemory(Long mainMemory) {
        this.mainMemory = mainMemory;
    }
    public void setCpuClock(Double cpuClock){
        this.cpuClock = cpuClock;
    }

    public void showSpec(){
        System.out.println("메인메모리 : " +getMainMemory()+"Mb");
        System.out.println("CPU 쿨럭 : "+getCpuClock()+"GHz");
    }
}
