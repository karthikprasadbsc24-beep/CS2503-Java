package edu.bank;

public class HomeLoan implements Loan {
    @Override
    public void interestRate() {
        System.out.println("Home loan interest rate is 6%");
    }
}
