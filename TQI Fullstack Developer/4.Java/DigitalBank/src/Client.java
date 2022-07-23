public class Client {

    private static String clientName;
    private String clientAddress;
    private int clientAge;

    //CONSTRUCTOR
    //----------------------------------------------------------------
    public Client(String clientName, String clientAddress, int clientAge) {
        Client.clientName = clientName;
        this.clientAddress = clientAddress;
        this.clientAge = clientAge;
    }

    //GETTERS AND SETTERS
    //----------------------------------------------------------------
    
    public static String getClientName() {
        return clientName;
    }
    public String getClientAddress() {
        return clientAddress;
    }
    public int getClientAge() {
        return clientAge;
    }

    public void setClientName(String clientName) {
        Client.clientName = clientName;
    }
    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }
    public void setClientAge(int clientAge) {
        this.clientAge = clientAge;
    }

    //METHODS
    //----------------------------------------------------------------

    public void printClientInfo(){
        System.out.println("Name: " + Client.clientName);
        System.out.println("Address: " + this.clientAddress);
        System.out.println("Age: " + this.clientAge);
    }
}
