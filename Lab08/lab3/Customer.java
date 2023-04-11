
public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList acct;
    private int numOfAccount;

    public Customer() {
        acct = new Account[5];
    }
    public Customer(String firstName, String lastName) {
        acct = new Account[5];
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public String toString() {
       return firstName + " " + lastName + " " + numOfAccount;
    }
    public boolean equals(Customer c) {
        return c.getFirstName().equals(firstName) && c.getLastName().equals(lastName);
    }
    public void addAccount(Account acct) {
        this.acct[numOfAccount] = acct;
        numOfAccount += 1;
    }
    public Account getAccount(int index) {
        return acct[index];
    }
    public int getNumOfAccount() {
        return numOfAccount;
    }
}
