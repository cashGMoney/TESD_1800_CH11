public class SavingsAccount extends Account {

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    // If Balance - amount is >= 0, then allow withdraw method, otherwise print error message
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 0) {
            setBalance(getBalance() - amount);
        } else {
            // A savings account cannot be overdrawn
            System.out.println("**Alert**: Savings account cannot be overdrawn, Account ID: " + id);
        }
    }

    // Using the toString method to provide account details
    @Override
    public String toString() {
        return "SavingsAccount ID: " + getId() + ", Balance: $" + getBalance();
    }
}
