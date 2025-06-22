public class BankAccounts {
    public static void main(String[] args) {
        int accId = 44557687;
        String accName = "John Doe";
        double accBalance = 100000.0;
        double depAmount = 50000;
        double withAmount = 20000;
        int transactions = 45;

        double totalBalance = accBalance + depAmount - withAmount;
        boolean isBlocked = totalBalance < 500000;
        boolean validity = depAmount > 1000 && accBalance > 2000;
        transactions++;

        System.out.println("Account ID: " + accId);
        System.out.println("Account Name: " + accName);
        System.out.println("Account Balance: " + totalBalance);
        System.out.println(" Minimum balance validation: " + isBlocked);
        System.out.println("Deposit validity: " + validity);
        System.out.println("Transactions: " + transactions);

    }

}