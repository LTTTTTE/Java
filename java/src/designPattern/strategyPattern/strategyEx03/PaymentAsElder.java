package designPattern.strategyPattern.strategyEx03;

public class PaymentAsElder implements Payment{

    @Override
    public void charge(BusCard card) {
        if(card.subCurrency(BusCard.DEFAULT_BILL-800L)){
            System.out.println("!!어서오세요!!");
            System.out.println("노인요금적용 : "+ (BusCard.DEFAULT_BILL-800L));
        }
        else
            System.out.println("잔액이 부족합니다.");
    }
}
