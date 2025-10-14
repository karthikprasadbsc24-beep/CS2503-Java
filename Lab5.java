import edu.bank.Loan;
import edu.bank.HomeLoan;
import edu.bank.CarLoan;

public class Lab5 {
    public static void main(String[] args) {
        Loan home = new HomeLoan();
        Loan car = new CarLoan();

        home.interestRate();
        car.interestRate();
    }
}
