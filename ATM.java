import java.util.Scanner;

public class ATM {
    private User user;
    private Account account;
    private Scanner sc;

    public ATM() {
        user = new User("1234", "0000");
        account = new Account();
        sc = new Scanner(System.in);
    }

    public void start() {
        System.out.print("Enter User ID: ");
        String id = sc.nextLine();

        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();

        if (user.validate(id, pin)) {
            menu();
        } else {
            System.out.println("Invalid credentials!");
        }
    }

    private void menu() {
        int choice;
        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.print("Choose option: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Transactions.showHistory(account);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double w = sc.nextDouble();
                    System.out.println(account.withdraw(w)
                            ? "Withdraw successful."
                            : "Insufficient balance.");
                    break;

                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double d = sc.nextDouble();
                    account.deposit(d);
                    System.out.println("Deposit successful.");
                    break;

                case 4:
                    System.out.print("Enter amount to transfer: ");
                    double t = sc.nextDouble();
                    System.out.println(account.transfer(t)
                            ? "Transfer successful."
                            : "Insufficient balance.");
                    break;

                case 5:
                    System.out.println("Thank you for using ATM!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }
}
