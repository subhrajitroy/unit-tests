package demo.thoughtworks.com;

public class Money {
    private final String currency;
    private final Double value;


    public Money(Double value){
        this("INR",value);
    }

    Money(String currency, Double value){

        this.currency = currency;
        this.value = value;
    }

    Double getValue() {
        return value;
    }
}
