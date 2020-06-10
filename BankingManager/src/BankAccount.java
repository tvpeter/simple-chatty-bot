public class BankAccount {

    private String account;
    private double balance;

    public void setAccount(String account)
    {
        this.account = account;
    }

    public String getAccount()
    {
        return this.account;
    }

    public void setBalance(double amount)
    {
        this.balance += amount;
    }

    public double getBalance()
    {
        return this.balance;
    }

}
