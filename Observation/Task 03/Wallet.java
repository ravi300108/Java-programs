package walletsystem;

interface PaymentService {

    void makePayment(String upi, double money)
            throws InvalidUPIException,
                   InvalidAmountException,
                   InsufficientBalanceException;

    void showBalance();
}

// Wallet Account Class
class MyWallet {

    private String userName;
    private String phoneNumber;
    private String paymentId;
    private double amount;

    public MyWallet(String userName, String phoneNumber, String paymentId) {
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.paymentId = paymentId;
        amount = 0.0;
    }

    public void deposit(double money) {
        if (money > 0) {
            amount = amount + money;
            System.out.println("Money Deposited: Rs." + money);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void withdraw(double money) {
        amount = amount - money;
    }

    public void printDetails() {
        System.out.println("\n----- My Wallet -----");
        System.out.println("User Name : " + userName);
        System.out.println("Mobile    : " + phoneNumber);
        System.out.println("UPI ID    : " + paymentId);
        System.out.println("Balance   : Rs." + amount);
    }
}

// Payment Class
class UPITransaction implements PaymentService {

    private MyWallet myWallet;

    public UPITransaction(MyWallet myWallet) {
        this.myWallet = myWallet;
    }

    @Override
    public void makePayment(String upi, double money)
            throws InvalidUPIException,
                   InvalidAmountException,
                   InsufficientBalanceException {

        // Checking UPI format
        if (upi == null || !upi.contains("@")) {
            throw new InvalidUPIException("Please enter a valid UPI ID.");
        }

        // Checking payment amount
        if (money <= 0) {
            throw new InvalidAmountException(
                    "Payment amount should be greater than zero.");
        }

        // Checking wallet balance
        double remainingBalance = myWallet.getAmount() - money;

        if (remainingBalance < 0) {
            throw new InsufficientBalanceException(
                    "Wallet does not have enough balance.");
        }

        myWallet.withdraw(money);

        System.out.println("\nPayment Done Successfully!");
        System.out.println("Amount Paid : Rs." + money);
        System.out.println("Receiver    : " + upi);
        System.out.println("Remaining   : Rs." + myWallet.getAmount());
    }

    @Override
    public void showBalance() {
        System.out.println(
                "Current Wallet Balance: Rs." + myWallet.getAmount());
    }
}

// User Defined Exceptions
class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class InvalidUPIException extends Exception {

    public InvalidUPIException(String msg) {
        super(msg);
    }
}

class InvalidAmountException extends Exception {

    public InvalidAmountException(String msg) {
        super(msg);
    }
}

// Main Class
public class WalletDemo {

    public static void main(String[] args) {

        MyWallet account = new MyWallet(
                "Ravi Teja",
                "9876543210",
                "raviteja@upi");

        account.deposit(5000);

        UPITransaction transaction = new UPITransaction(account);

        try {

            transaction.showBalance();

            transaction.makePayment("friend@upi", 1500);

            transaction.showBalance();

        } catch (InvalidUPIException e) {

            System.out.println("Error: " + e.getMessage());

        } catch (InvalidAmountException e) {

            System.out.println("Error: " + e.getMessage());

        } catch (InsufficientBalanceException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            System.out.println("\nTransaction Process Finished.");
        }

        account.printDetails();
    }
}
