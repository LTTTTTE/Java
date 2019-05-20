package designPattern.strategyPattern.strategyEx03;

public class PaymentAsStudent implements Payment{

    @Override
    public void charge(BusCard card) {
        if(card.subCurrency(BusCard.DEFAULT_BILL-500L)){
            System.out.println("!!어서오세요!!");
            System.out.println("학생요금적용 : "+ (BusCard.DEFAULT_BILL-500L));
        }
        else
            System.out.println("학생, 잔액이 부족해");
    }
}
