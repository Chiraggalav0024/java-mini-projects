import java.util.Scanner;

public class ATMMACHINE {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int balance = 10000;

        System.out.println("Welcome to the Bank Of India");
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your account number:");
        long acct_no = sc.nextLong();
        System.out.println("Enter your password:");
        long passwd = sc.nextLong();

        System.out.println("Welcome back Chirag Galav");
        System.out.println("Choose the service you want:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Show my details");
        System.out.println("5. Exit");

        int choice = sc.nextInt();

        switch (choice) {
        case 1:
            System.out.println("Hello " + name);
            System.out.println("Your current balance is " + balance);
            break;

        case 2:
            System.out.println("Enter the amount you want to deposit:");
            int dep_amt = sc.nextInt();
            balance += dep_amt;
            System.out.println("Your account is credited by " + dep_amt);
            System.out.println("Your current balance is " + balance);
            break;

        case 3:
            System.out.println("Enter the amount you want to withdraw:");
            int wdw_amt = sc.nextInt();
            balance -= wdw_amt;
            System.out.println("Your account is debited by " + wdw_amt);
            System.out.println("Your current balance is " + balance);
            break;

        case 4:
            System.out.println("Enter your password:");
            long p = sc.nextLong();
            if (p == passwd) {
                System.out.println("Your account details are given below:");
                System.out.println("Name:" + name);
                System.out.println("Acct_No:" + acct_no);
                System.out.println("Your current balance is " + balance);
                break;
            }

            else {
                System.out.println("Enter a valid password");
                break;
            }

        case 5:
            System.out.println("Thank you");
            break;
        }
    }
}
