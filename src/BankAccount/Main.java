package BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Amit Singh","ICICI",5000);
        System.out.println(bankAccount1.getBankName());
        System.out.println(bankAccount1.getAccountHolderName());
        System.out.println(bankAccount1.getBalance());
        bankAccount1.withdraw(1000);
        System.out.println(bankAccount1.getBalance());
        bankAccount1.deposit(3000);
        System.out.println(bankAccount1.getBalance());

        BankAccount bankAccount2 = new BankAccount("Akhlish Singh","HDFC",8000);
        System.out.println(bankAccount2.getBankName());
        System.out.println(bankAccount2.getAccountHolderName());
        System.out.println(bankAccount2.getBalance());
        bankAccount2.withdraw(1000);
        System.out.println(bankAccount2.getBalance());
        bankAccount2.deposit(3000);
        System.out.println(bankAccount2.getBalance());

        BankAccount bankAccount3 = new BankAccount("Rahul Kumar","SBI",2000);
        System.out.println(bankAccount3.getBankName());
        System.out.println(bankAccount3.getAccountHolderName());
        System.out.println(bankAccount3.getBalance());
        bankAccount3.withdraw(1000);
        System.out.println(bankAccount3.getBalance());
        bankAccount3.deposit(3000);
        System.out.println(bankAccount3.getBalance());
    }
}
