package HarderProblem;

public class BankAccount {
    private String accountHolderName;
    private BankName bankName;
    private double accountBalance;

    public BankAccount( String accountHolderName, BankName bankName, double initialBalance){
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        accountBalance = initialBalance;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }
    public BankName getBankName(){
        return bankName;
    }
    public double getBalance() {
        return accountBalance;
    }
    public void deposit(double money) {
        if(money>0)
            accountBalance +=money;
        else
            System.out.println("Rupees should be positive");
    }
    public void withdraw(double money){
        if(money< accountBalance)
            accountBalance -=money;
        else
            System.out.println("Withdrawl amount should be less then your current amount");
    }
    public double calculateInterest(int numberOfYears){
        double totalInterest = bankName.getInterestRate()*numberOfYears*accountBalance/100;
        return totalInterest;
    }
    public void printAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Balance: " + accountBalance);
        System.out.println("Total Interest for 5 years: " + calculateInterest(5));
    }
}
