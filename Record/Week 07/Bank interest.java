package core_java;

import java.util.Scanner;

class Bank {

    double interestRate() {
        return 4.0;
    }
}

class StateBank extends Bank {

    @Override
    double interestRate() {
        return 7.0;
    }
}

class ICICIBank extends Bank {

    @Override
    double interestRate() {
        return 6.5;
    }
}

class PunjabBank extends Bank {

    @Override
    double interestRate() {
        return 6.0;
    }
}

public class InterestDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter bank name: ");
        String name = input.nextLine();

        Bank bankObj;

        if (name.equalsIgnoreCase("RBI")) {

            bankObj = new Bank();

        } else if (name.equalsIgnoreCase("SBI")) {

            bankObj = new StateBank();

        } else if (name.equalsIgnoreCase("ICICI")) {

            bankObj = new ICICIBank();

        } else if (name.equalsIgnoreCase("PNB")) {

            bankObj = new PunjabBank();

        } else {

            System.out.println("Bank name is not available.");
            input.close();
            return;
        }

        double rate = bankObj.interestRate();

        System.out.println("Rate of Interest: " + rate + "%");

        input.close();
    }
}
