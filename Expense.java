package budget;

public record Expense(String name, double amount, String category, String date, String paymentMethod) {
    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public String getDate() {
        return date;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getDescription() {
        return name + " (" + category + ") - " + amount + " paid by " + paymentMethod + " on " + date;
    }
}
