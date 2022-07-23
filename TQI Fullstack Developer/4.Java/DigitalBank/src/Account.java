public abstract class Account {

    private static int STANDARD_BRANCH = 1;
    private static int SEQUENCE = 1;

    protected int bankBranch;
    protected int account;
    protected double balance;

    //CONSTRUCTOR
    //----------------------------------------------------------------
    public Account(Client client){
        this.bankBranch = Account.STANDARD_BRANCH;
        this.account = SEQUENCE++;
    }

    //GETTERS
    //----------------------------------------------------------------

    public int getBankBranch() {
        return bankBranch;
    }

    public int getAccount() {
        return account;
    }

    public double getBalance() {
        return balance;
    }

    //METHODS
   //----------------------------------------------------------------

    public void withdraw(double amount){
        if (this.balance >= amount) this.balance -= amount;
        else System.out.println("Cannot withdraw: insufficient funds");
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void transfer(double amount, Account account){
        this.withdraw(amount);
        account.deposit(amount);
    }

    protected void printAccountBalance(){
        System.out.println("Name : " + Client.getClientName());
        System.out.println(String.format("Bank Branch: %d", this.getBankBranch()));
        System.out.println(String.format("Bank Account: %d", this.getAccount()));
        System.out.println(String.format("Balance: %.2f", this.getBalance()));
    }
}
