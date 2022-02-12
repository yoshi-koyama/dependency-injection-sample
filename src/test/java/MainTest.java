import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        System.out.println("TestAccountに請求書を発行する");
        Account testAccount = new Account("TestAccount", new TestInvoiceProcessor());
        String result = testAccount.closing(300000);
        System.out.println("Testの結果を出力：" + result);
    }
}
