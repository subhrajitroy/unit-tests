package demo.thoughtworks.com;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void shouldNotHaveAnyMoneyWhenCreatedWithEmptyWallet(){
        User joe = new User("Joe",Wallet.withNoMoney());
        assertFalse(joe.hasMoney());
    }

    @Test
    void shouldHaveMoneyWhenCreatedWithNonEmptyWallet(){
        Wallet walletWithMoney = WalletBuilder.withValue(20.0).build();
        User joe = new User("Joe",walletWithMoney);
        assertTrue(joe.hasMoney());
    }
}
