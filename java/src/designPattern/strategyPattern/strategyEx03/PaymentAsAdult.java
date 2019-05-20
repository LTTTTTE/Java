package designPattern.strategyPattern.strategyEx03;

public class PaymentAsAdult implements Payment{
    @Override
    public void charge(BusCard card) {
        if(card.subCurrency(BusCard.DEFAULT_BILL)){
            System.out.println("!!어서오세요!!");
            System.out.println("성인요금적용 : "+ BusCard.DEFAULT_BILL);
        }
        else
            System.out.println("짜쓱아 잔액부족하다");
    }
}
