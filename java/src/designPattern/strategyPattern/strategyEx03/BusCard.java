package designPattern.strategyPattern.strategyEx03;

public class BusCard {

    public static final Long DEFAULT_BILL = 1500L;

    private Payment payment;
    private Long currency;

    public BusCard(){
        this.currency = 5000L;
    }

    public BusCard(Payment payment) {
        this.payment = payment;
        this.currency = 5000L;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Long getCurrency() {
        return currency;
    }

    public boolean subCurrency(Long currency) {
        if(currency > this.currency) {
            return false;
        }
        this.currency -= currency;
        return true;
    }

    public void pay(){
        this.payment.charge(this);
        System.out.println("잔액 : "+this.getCurrency());
    }
}
