package budget;

public record BudgetTracker(Income[] incomes, Expense[] expenses, double totalIncome, double totalExpense, int numIncomes, int numExpenses, String lastMessage) {
    // A constant for the maximum number of items
    public static final int MAX_ITEMS = 100;

    // A compact constructor to initialize the fields
    public BudgetTracker {
        // You can add some validation or initialization logic here if needed
    }

    // A method to get the total income
    public double getTotalIncome() {
        return totalIncome;
    }

    // A method to get the total expense
    public double getTotalExpense() {
        return totalExpense;
    }

    // A method to get the balance
    public double getBalance() {
        return totalIncome - totalExpense;
    }

    // A method to get the number of items
    public int getNumItems() {
        return numIncomes + numExpenses;
    }

    // A method to get the capacity
    public int getCapacity() {
        return MAX_ITEMS;
    }

    // A method to get the last message
    public String getLastMessage() {
        return lastMessage;
    }
}
