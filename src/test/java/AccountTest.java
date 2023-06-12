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

        //Testar deposit-metoden
        account.deposit(100);

        // Jämför det förväntade resultatet med det faktiska resultatet
        double expectedBalance = 200;
        Assertions.assertEquals(expectedBalance, account.getBalance());
    }

    @Test
    void depositLessThanZero() {
        //Skapar ett konto för testning
        Account account = new Account(100, 123456789);

        //Testar deposit-metoden
        account.deposit(-10);

        // Jämför det förväntade resultatet med det faktiska resultatet
        double expectedBalance = 100;
        Assertions.assertEquals(expectedBalance, account.getBalance());
    }
    @Test
    void depositZero() {
        //Skapar ett konto för testning
        Account account = new Account(100, 123456789);

        //Testar deposit-metoden
        account.deposit(0);

        // Jämför det förväntade resultatet med det faktiska resultatet
        double expectedBalance = 100;
        Assertions.assertEquals(expectedBalance, account.getBalance());
    }

    @Test
    void withdrawMoreThanZero() {
        //Skapar ett konto för testning
        Account account = new Account(100, 123456789);

        //Testar withdraw-metoden
        account.withdraw(100);

        // Jämför det förväntade resultatet med det faktiska resultatet
        double expectedBalance = 0;
        Assertions.assertEquals(expectedBalance, account.getBalance());
    }

    @Test
    void withdrawLessThanZero() {
        //Skapar ett konto för testning
        Account account = new Account(100, 123456789);

        //Testar withdraw-metoden
        account.withdraw(-10);

        // Jämför det förväntade resultatet med det faktiska resultatet
        double expectedBalance = 100;
        Assertions.assertEquals(expectedBalance, account.getBalance());
    }
    @Test
    void withdrawZero() {
        //Skapar ett konto för testning
        Account account = new Account(100, 123456789);

        //Testar withdraw-metoden
        account.withdraw(0);

        // Jämför det förväntade resultatet med det faktiska resultatet
        double expectedBalance = 100;
        Assertions.assertEquals(expectedBalance, account.getBalance());
    }
    @Test
    void withdrawMoreThanYouHave() {
        //Skapar ett konto för testning
        Account account = new Account(100, 123456789);

        //Testar withdraw-metoden
        account.withdraw(200);

        // Jämför det förväntade resultatet med det faktiska resultatet
        double expectedBalance = 100;
        Assertions.assertEquals(expectedBalance, account.getBalance());
    }
}