
public class Exercise11_3 {
  public static void main(String[] args) {
    // Write a test program that creates an Account object with an account ID of 1122, a balance of $20,000,
    Account account1112 = new Account(1112, 20000);
    Account account1113 = new CheckingAccount(1113, 10000);
    Account account1114 = new SavingsAccount(1114, 5000);
    Account account1115 = new CheckingAccount(1115, 10000);

    // An annual interest rate of 4.5%. 
    account1112.setAnnualInterestRate(4.5);

    // Break for Display
    System.out.println();

    // Use the withdraw method to withdraw $2,500, 10400, & 6000
    account1112.withdraw(2500);
    account1113.withdraw(10400);
    account1114.withdraw(6000);
    account1115.withdraw(10600);

    // Break for Display
    System.out.println();

    // Use the deposit method to deposit $3,000,
    account1112.deposit(3000); 

    // Invokes their toString() methods. (Account) (Checking) (Savings)
    // toString methods are located in the class files
    System.out.println(account1112);
    System.out.println(account1113);
    System.out.println(account1115);
    System.out.println(account1114);

    // Break for visual
    System.out.println();
  }
}

// -------Removed from code -------
    // System.out.printf("Account Monthly Interest: $%.2f%n", account1112.getMonthlyInterest());
    // System.out.println("Account Date Created: " + account1112.getDateCreated());