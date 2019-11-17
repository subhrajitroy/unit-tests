package demo.thoughtworks.com;

public class Wallet {

    private static final String DEFAULT_CURRENCY = "INR";
    private Money money;

    static Wallet withNoMoney(){
        return new Wallet();
    }

    private Wallet(){
        this(new Money(DEFAULT_CURRENCY,0.0));
    }

    public Wallet(Money money){
        this.money = money;
    }

    boolean isEmpty() {
        return money == null || money.getValue() == 0;
    }
}
