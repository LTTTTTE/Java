package designPattern.strategyPattern.strategyEx01;

public class StrategyEx01 {
    public static void main(String[] args) {

        Computer com01 = new Computer();
        com01.selectRam(new Ram2G());
        com01.selectCpu(new I7_8700());
        com01.showSpec();
    }
}
