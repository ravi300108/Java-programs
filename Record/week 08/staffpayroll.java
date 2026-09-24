// Parent class
class Staff {

    String staffId;

    // Constructor
    Staff(String staffId) {
        this.staffId = staffId;
    }

    // Salary method
    void calculateSalary() {
        System.out.println("Employee Salary Information:");
    }
}


// Permanent Employee class
class PermanentStaff extends Staff {

    // Constructor
    PermanentStaff(String staffId) {
        super(staffId);
    }

    // Overriding calculateSalary()
    @Override
    void calculateSalary() {

        int basic = 28000;
        int allowance = 12000;
        int travel = 4000;

        int grossSalary = basic + allowance + travel;

        System.out.println("Salary Information:");
        System.out.println("Basic Salary : " + basic);
        System.out.println("Allowance    : " + allowance);
        System.out.println("Travel Allow.: " + travel);
        System.out.println("Gross Salary : " + grossSalary);
    }
}


// Temporary Employee class
class TemporaryStaff extends Staff {

    // Constructor
    TemporaryStaff(String staffId) {
        super(staffId);
    }

    // Overriding calculateSalary()
    @Override
    void calculateSalary() {

        int basic = 15000;
        int allowance = 2000;
        int travel = 2500;

        int grossSalary = basic + allowance + travel;

        System.out.println("Salary Information:");
        System.out.println("Basic Salary : " + basic);
        System.out.println("Allowance    : " + allowance);
        System.out.println("Travel Allow.: " + travel);
        System.out.println("Gross Salary : " + grossSalary);
    }
}


// Main class
public class StaffPayroll {

    public static void main(String args[]) {

        String staffId = "P101";

        // Identify employee type using ID
        if (staffId.startsWith("P")) {

            Staff worker = new PermanentStaff(staffId);

            worker.calculateSalary();

        } 
        else if (staffId.startsWith("T")) {

            Staff worker = new TemporaryStaff(staffId);

            worker.calculateSalary();

        } 
        else {

            System.out.println("Invalid Staff ID");
        }
    }
}
