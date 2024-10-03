public class CheckingAccount extends Account {
    private static final double overdraftLimit = 500;

    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    // Allow an overdraft limit of 500;
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            setBalance(getBalance() - amount);
        } else {
            // A checking account has an overdraft limit
            System.out.println("**Alert**: Overdraft limit exceeded, Account ID: " + id);
        }
    }

    // Using the toString method to provide account details
    @Override
    public String toString() {
        return "CheckingAccount ID: " + getId() + ", Balance: $" + getBalance();
    }
}

// Note: @Override doesnt actually do anything, but is good practice.