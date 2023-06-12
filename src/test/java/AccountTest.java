import org.example.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getAccountNumber() {
        //Skapar ett konto för testning
        Account account = new Account(100, 123456789);

        //Testar getAccountNumber-metoden
        int accountNumber = account.getAccountNumber();

        // Jämför det förväntade resultatet med det faktiska resultatet
        int expectedAccountNumber = 123456789;
        Assertions.assertEquals(expectedAccountNumber, accountNumber);
    }

    @Test
    void getBalance() {
        //Skapar ett konto för testning
        Account account = new Account(100, 123456789);

        //Testar getBalance-metoden
        double balance = account.getBalance();

        // Jämför det förväntade resultatet med det faktiska resultatet
        double expectedBalance = 100;
        Assertions.assertEquals(expectedBalance, balance);
    }

    @Test
    void depositMoreThanZero() {
        //Skapar ett konto för testning
        Account account = new Account(100, 123456789);
    }
}
