class Account {
    final private String accNo;
    final private String name;
    private String address;
    private String phno;
    final private String dob;
    protected long balance;

    public Account(String acc, String n, String add, String phno, String dob) {
        accNo = acc;
        name = n;
        address = add;
        this.phno = phno;
        this.dob = dob;
        balance = 0;
    }

    public String getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhno() {
        return phno;
    }

    public String getDOB() {
        return dob;
    }

    public long getBalance() {
        return balance;
    }

    public void setAddress(String add) {
        address = add;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }

    public void deposit(long amt) {
        if (amt > 0) {
            balance += amt;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(long amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

class LoanAccount extends Account {
    public LoanAccount(String acc, String n, String add, String phno, String dob, long loanAmount) {
        super(acc, n, add, phno, dob);
        balance = loanAmount; // balance represents loan to be repaid
    }

    public void payEMI(long amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
        } else {
            System.out.println("Invalid EMI payment.");
        }
    }

    public void repay(long amt) {
        if (amt == balance) {
            balance = 0;
            System.out.println("Loan fully repaid.");
        } else {
            System.out.println("Amount does not match remaining balance.");
        }
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", "Alice", "Mumbai", "9876543210", "1995-05-01");
        sa.deposit(10000);
        sa.withdraw(3000);
        System.out.println("Savings Balance: " + sa.getBalance());

        LoanAccount la = new LoanAccount("LA456", "Bob", "Delhi", "9123456780", "1988-03-15", 50000);
        la.payEMI(10000);
        la.repay(40000); // wrong amount
        la.repay(40000); // still wrong
        System.out.println("Loan Balance: " + la.getBalance());
    }
}
