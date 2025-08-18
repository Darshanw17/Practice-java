import java.util.*;

public class BankAccount {

    static class Transaction {
        String type;
        int amount;

        Transaction(String type, int amount) {
            this.type = type;
            this.amount = amount;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int initialBalance = sc.nextInt();
        int numOperations = sc.nextInt();
        sc.nextLine();

        List<Transaction> transactions = new ArrayList<>();
        List<Integer> commitPoints = new ArrayList<>();
        int currentBalance = initialBalance;
        int lastCommitIndex = -1;

        for (int i = 0; i < numOperations; i++) {
            String[] operation = sc.nextLine().split(" ");
            String op = operation[0];

            switch (op) {
                case "read":
                    System.out.println(currentBalance);
                    break;
                case "credit":
                    int creditAmount = Integer.parseInt(operation[1]);
                    transactions.add(new Transaction("credit", creditAmount));
                    currentBalance += creditAmount;
                    break;
                case "debit":
                    int debitAmount = Integer.parseInt(operation[1]);
                    transactions.add(new Transaction("debit", debitAmount));
                    currentBalance -= debitAmount;
                    break;
                case "abort":
                    int abortIndex = Integer.parseInt(operation[1]) - 1;
                    if (abortIndex < transactions.size() && (commitPoints.isEmpty() || abortIndex >= lastCommitIndex)) {
                        Transaction t = transactions.get(abortIndex);
                        if (t.type.equals("credit")) {
                            currentBalance -= t.amount;
                        } else if (t.type.equals("debit")) {
                            currentBalance += t.amount;
                        }
                        transactions.remove(abortIndex);
                    }
                    break;
                case "rollback":
                    int rollbackCommitIndex = Integer.parseInt(operation[1]) - 1;
                    if (rollbackCommitIndex < commitPoints.size()) {
                        int rollbackToIndex = commitPoints.get(rollbackCommitIndex);
                        currentBalance = initialBalance;
                        for (int j = 0; j < rollbackToIndex; j++) {
                            Transaction t = transactions.get(j);
                            if (t.type.equals("credit")) {
                                currentBalance += t.amount;
                            } else if (t.type.equals("debit")) {
                                currentBalance -= t.amount;
                            }
                        }
                        transactions = new ArrayList<>(transactions.subList(0, rollbackToIndex));
                        commitPoints = commitPoints.subList(0, rollbackCommitIndex + 1);
                        lastCommitIndex = commitPoints.get(commitPoints.size() - 1);
                    }
                    break;
                case "commit":
                    commitPoints.add(transactions.size());
                    lastCommitIndex = transactions.size();
                    break;
            }
        }

        sc.close();
    }
}

