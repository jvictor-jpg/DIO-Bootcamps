public class CheckingAccount extends Account{

    public CheckingAccount(Client client) {
        super(client);
    }

    public void printCheckingAccountBalance() {
        System.out.println("=== Checking Account ===");
        this.printAccountBalance();
    }
}
