class Account {
    int no;
    double bal;
    String type;

    Account(int no,double bal,String type) {
        this.no=no; this.bal=bal; this.type=type;
    }

    void deposit(double amt) {
        bal+=amt;
        System.out.println("Deposited: "+amt);
    }

    void withdraw(double amt) {
        if(amt<=bal) {
            bal-=amt;
            System.out.println("Withdrawn: "+amt);
        } else
            System.out.println("Insufficient Balance");
    }

    void interest() {
        System.out.println("Interest: "+bal*0.04);
    }

    void display() {
        System.out.println("No: "+no);
        System.out.println("Type: "+type);
        System.out.println("Balance: "+bal);
    }
}

public class AccountDemo {
    public static void main(String[] args) {
        Account a=new Account(1001,10000,"Savings");

        a.display();
        a.deposit(2000);
        a.withdraw(3000);
        a.interest();
        a.display();
    }
}
