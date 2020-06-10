public class Main {

    public static void main (String [] args)
    {
        CheckingAccount checkAccount = new CheckingAccount();
        CertificateOfDeposit cod = new CertificateOfDeposit();
        SavingsAccount savingsAccount = new SavingsAccount();

        checkAccount.setAccount("2081769412");
        double checkAccountBalance = checkAccount.getBalance();

        cod.setAccount("09023929348");
        double codBalance = cod.getBalance();

        savingsAccount.setAccount("9032938494");
        double savingsAccountBalance = savingsAccount.getBalance();


    }
}
