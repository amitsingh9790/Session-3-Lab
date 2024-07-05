package HarderProblem;

public enum BankName {
    ICICI(6.3),
    HDFC(5.8),
    SBI(6.0);

    private final double interestRate;
    BankName(double interestRate){
        this.interestRate = interestRate;
    }
    public double getInterestRate(){
        return interestRate;
    }
}
