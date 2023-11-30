package budget;

public record Income(String name, double amount, String category, String source) {
    public void display() {
        // some code to display the income details
    }
}
