public class SavingsAccount extends Account{
    
    public SavingsAccount(Client client) {
        super(client);
    }

    public void printSavingsAccountBalance() {
        System.out.println("=== Savings Account ===");
        this.printAccountBalance();
    }
}
