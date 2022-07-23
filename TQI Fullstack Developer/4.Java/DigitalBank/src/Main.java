public class Main {
    public static void main(String[] args) throws Exception {
        Client c1 = new Client("Name1", "Street1", 18);
        Client c2 = new Client("Name2", "Street2", 20);

        CheckingAccount cc = new CheckingAccount(c1);
        SavingsAccount cp = new SavingsAccount(c2);

        c1.printClientInfo();
        System.out.println();
        c2.printClientInfo();
        System.out.println("\n============================================================\n");

        cc.deposit(100);
        cc.withdraw(25);
        cc.transfer(10, cp);

        cc.printCheckingAccountBalance();
        System.out.println();
        cp.printSavingsAccountBalance();
        System.out.println("\n============================================================\n");

        cp.deposit(1000);
        cp.withdraw(130);
        cp.transfer(100, cc);

        cc.printCheckingAccountBalance();
        System.out.println();
        cp.printSavingsAccountBalance();
    }
}
