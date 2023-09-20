 import java.util.Scanner;

interface Bank{
    double getBalance();
    boolean deposit(double amount);
    boolean withdraw(double amount);
}


class UserAccount implements Bank{
    private double balance;
    UserAccount(double initialBalance){
        this.balance = initialBalance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public boolean deposit(double amount) {
        if (amount>0){
            balance += amount;
            return  true;
        }
        else{
            return  false;
        }
     }

    @Override
    public boolean withdraw(double amount) {
        if (amount>0 && amount<=balance){
            balance -= amount;
            return true;
        }
        else{
            return false;
        }
     }
}


class ATM implements Bank {
    private final UserAccount account;
    private final Scanner scanner;

    public ATM(UserAccount account) {
        this.account = account;
        scanner = new Scanner(System.in);
    }

    public void atmMenu() {
        System.out.println("\n:::ATM Menu:::");
        System.out.println("(1)Deposit");
        System.out.println("(2)Withdraw");
        System.out.println("(3)Check Balance");
        System.out.println("(4)Exit");
    }

    @Override
    public double getBalance() {
        return account.getBalance();
    }

    @Override

    public boolean deposit(double amount) {
        return account.deposit(amount);
    }

    @Override

    public boolean withdraw(double amount) {
        return account.withdraw(amount);
    }


    public void finalRun() {
        while (true) {
            atmMenu();
            System.out.println("Enter your choice (1/2/3/4) : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank You for using the ATM <*^.^*>");
                    return;
                default:
                    System.out.println("Please, Enter a Valid Choice!");
            }
        }
    }

    public void checkBalance() {
        double balance = getBalance();
        System.out.println("Your account balance is(in INR) : ⟨₹⟩ " + balance);
    }

    public void deposit() {
        System.out.print("Enter the amount to deposit(in INR) : ⟨₹⟩ ");
        double amount = scanner.nextDouble();
        if (deposit(amount)) {
            System.out.println("\n**Your Amount Successfully Deposited!**");
        } else {
            System.out.println("\n**Deposit Failed!!** \nPlease enter a valid amount.");
        }
    }


    public void withdraw() {
        System.out.println("Enter your withdrawal amount: ⟨₹⟩ ");
        double amount = scanner.nextDouble();
        if (withdraw(amount)) {
            System.out.println("\n**Successful Withdrawal!**");
        } else {
            System.out.println("\n**Cannot Withdraw Money** \nYour account left with Insufficient Balance!!");
        }
    }
}


    class ATMInterface {
        public static void main(String[] args) {
            double initialBalance = 2000;
            UserAccount useraccount = new UserAccount(initialBalance);
            ATM atm = new ATM(useraccount);
            atm.finalRun();
        }
    }
    
