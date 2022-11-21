package Classes.BankAcc;

public class BankAcc {
    
    // Class to create a Bank account object with an account number, ID, and balance and interest rate.
    
    // create the class
    class BankAccount {
        // create the variables
        private int accountNumber;
        private int ID;
        private double balance;
        private double interestRate;
        
        // create the constructor
        public BankAccount(int accountNumber, int ID, double balance, double interestRate) {
            this.accountNumber = accountNumber;
            this.ID = ID;
            this.balance = balance;
            this.interestRate = interestRate;
        }
        
        // create the getters and setters
        public int getAccountNumber() {
            return accountNumber;
        }
        
        public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
        }
        
        public int getID() {
            return ID;
        }
        
        public void setID(int ID) {
            this.ID = ID;
        }
        
        public double getBalance() {
            return balance;
        }
        
        public void setBalance(double balance) {
            this.balance = balance;
        }
        
        public double getInterestRate() {
            return interestRate;
        }
        
        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }
        
        // create the methods
        public void deposit(double amount) {
            balance += amount;
        }
        
        public void withdraw(double amount) {
            balance -= amount;
        }
        
        public void addInterest() {
            balance += balance * interestRate;
        }
        
        public String toString() {
            return "Account Number: " + accountNumber + " ID: " + ID + " Balance: " + balance + " Interest Rate: " + interestRate;
        }
    }


    public static void main(String[] args) {
        
    }
}
