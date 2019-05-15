package designPattern.strategyPattern.strategyEx01;

public class StrategyEx01 {
    public static void main(String[] args) {

        Computer com01 = new Computer();
        com01.selectRam(new Ram2G());
        com01.selectCpu(new I7_8700());
        com01.selectHdd(new hdd250Gb());
        com01.showSpec();
        //Optional 로 특정 부품 미선택시 나오는 NPE 를 없ㅇ고 싶으나 실패
    }
}
