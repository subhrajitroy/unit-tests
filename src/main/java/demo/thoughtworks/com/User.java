package demo.thoughtworks.com;

public class User {

    private final String name;
    private final Wallet wallet;

    public User(String name, Wallet wallet){

        this.name = name;
        this.wallet = wallet;
    }

    public boolean hasMoney() {
        return ! wallet.isEmpty();
    }
}
