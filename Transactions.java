public class Transactions {
    public static void showHistory(Account account) {
        System.out.println("\n--- Transaction History ---");
        if (account.getTransactions().isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String t : account.getTransactions()) {
                System.out.println(t);
            }
        }
    }
}
