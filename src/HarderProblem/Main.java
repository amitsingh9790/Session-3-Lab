package HarderProblem;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Harry", BankName.HDFC,10000);
        BankAccount account2 = new BankAccount("Jaklin", BankName.SBI, 20000);
        BankAccount account3 = new BankAccount("Thomson", BankName.ICICI, 30000);

        account1.printAccountDetails();
        account2.printAccountDetails();
        account3.printAccountDetails();
    }
}

