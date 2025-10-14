package edu.bank;

public class CarLoan implements Loan {
    @Override
    public void interestRate() {
        System.out.println("Car loan interest rate is 8%");
    }
}
