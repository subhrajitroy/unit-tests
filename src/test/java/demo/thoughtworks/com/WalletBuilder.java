package demo.thoughtworks.com;

public class WalletBuilder {

    private String currency = "INR";
    private Double value = 100.0;


    private WalletBuilder(String currency,Double value){
        this.currency = currency;
        this.value = value;
    }

    public static WalletBuilder withValue(Double value){
        return new WalletBuilder("INR",value);
    }

    Wallet build(){
        return new Wallet(new Money(currency,value));
    }
}
