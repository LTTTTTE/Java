package designPattern.strategyPattern.strategyEx03;

public class PaymentAsChild implements Payment {

    @Override
    public void charge(BusCard card) {
        if(card.subCurrency(BusCard.DEFAULT_BILL-1000L)){
            System.out.println("!!어서오세요!!");
            System.out.println("유아요금적용 : "+ (BusCard.DEFAULT_BILL-1000L));
        }
        else
            System.out.println("돈이 부족해요");
    }
}
