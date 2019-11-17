package demo.thoughtworks.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class WalletTest {
    @Test
    void shouldTestThatWalletIsEmpty(){
        Wallet wallet = Wallet.withNoMoney();
        assertTrue(wallet.isEmpty());
    }
}
