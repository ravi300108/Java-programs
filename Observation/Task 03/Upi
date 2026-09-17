package walletsystem;

interface PaymentService {

    void pay(String receiverUPI, double amount)
            throws InvalidUPIException,
                   InvalidAmountException,
                   InsufficientBalanceException;

    void checkBalance();
}

// Wallet Class
class Wallet {

    private String name;
    private String mobile;
    private String upiId;
    private double balance;

    public Wallet(String name, String mobile, String upiId) {
        this.name = name;
        this.mobile = mobile;
        this.upiId = upiId;
        this.balance = 0;
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Money Added: Rs." + amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getUpiId() {
        return upiId;
    }

    public void deductMoney(double amount) {
        balance -= amount;
    }

    public void displayWalletDetails() {
        System.out.println("\n----- Wallet Details -----");
        System.out.println("Name    : " + name);
        System.out.println("Mobile  : " + mobile);
        System.out.println("UPI ID  : " + upiId);
        System.out.println("Balance : Rs." + balance);
    }
}

// UPIPayment Class
class UPIPayment implements PaymentService {

    private Wallet wallet;

    public UPIPayment(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public void pay(String receiverUPI, double amount)
            throws InvalidUPIException,
                   InvalidAmountException,
                   InsufficientBalanceException {

        if (!receiverUPI.contains("@")) {
            throw new InvalidUPIException("Invalid UPI ID.");
        }

        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than zero.");
        }

        if (wallet.getBalance() < amount) {
            throw new InsufficientBalanceException("Insufficient Balance.");
        }

        wallet.deductMoney(amount);

        System.out.println("\nPayment Successful!");
        System.out.println("Paid Rs." + amount + " to " + receiverUPI);
    }

    @Override
    public void checkBalance() {
        System.out.println("Available Balance: Rs." + wallet.getBalance());
    }
}

// Custom Exception Classes
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidUPIException extends Exception {
    public InvalidUPIException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

// Main Class
public class WalletDemo {

    public static void main(String[] args) {

        Wallet wallet = new Wallet(
                "Sai Krishna",
                "9876543210",
                "saikrishna@upi");

        wallet.addMoney(5000);

        UPIPayment payment = new UPIPayment(wallet);

        try {

            payment.checkBalance();

            payment.pay("friend@upi", 1200);

            payment.checkBalance();

        } catch (InvalidUPIException e) {

            System.out.println("Error: " + e.getMessage());

        } catch (InvalidAmountException e) {

            System.out.println("Error: " + e.getMessage());

        } catch (InsufficientBalanceException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            System.out.println("\nTransaction Completed.");
        }

        wallet.displayWalletDetails();
    }
}
