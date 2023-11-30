// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package budget;

// Import the necessary packages for testing
import org.junit.Test;
import static org.junit.Assert.*;

// Declare the BudgetItem class as abstract
abstract class BudgetItem {
    // Declare the fields for name, amount and category
    private final String name;
    private final double amount;
    private final String category;

    // Provide a constructor that initializes the fields
    public BudgetItem(String name, double amount, String category) {
        this.name = name;
        this.amount = amount;
        this.category = category;
    }

    // Provide getter methods for the fields
    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }
}


// A test class that extends the BudgetItem class
class BudgetItemTest extends BudgetItem {
    // A constructor that calls the super constructor
    public BudgetItemTest(String name, double amount, String category) {
        super(name, amount, category);
    }

    // A method that overrides the abstract method and returns a dummy description
    public String getDescription() {
        return "This is a test item";
    }
}

// A test suite that tests the BudgetItem class
public class BudgetItemTestSuite {
    // A test method that tests the constructor and the getter methods
    @Test
    public void testConstructorAndGetters() {
        // Create a test object with some sample values
        BudgetItemTest testItem = new BudgetItemTest("Test", 100.0, "Misc");

        // Assert that the name, amount and category are equal to the expected values
        assertEquals("Test", testItem.getName());
        assertEquals(100.0, testItem.getAmount(), 0.001);
        assertEquals("Misc", testItem.getCategory());
    }

    // A test method that tests the abstract method
    @Test
    public void testGetDescription() {
        // Create a test object with some sample values
        BudgetItemTest testItem = new BudgetItemTest("Test", 100.0, "Misc");

        // Assert that the description is equal to the expected value
        assertEquals("This is a test item", testItem.getDescription());
    }

    // A main method to run the tests
    public static void main(String[] args) {
        // Create a test runner object
        org.junit.runner.JUnitCore runner = new org.junit.runner.JUnitCore();

        // Run the test suite and print the results
        org.junit.runner.Result result = runner.run(BudgetItemTestSuite.class);
        System.out.println("Number of tests run: " + result.getRunCount());
        System.out.println("Number of tests failed: " + result.getFailureCount());
        for (org.junit.runner.notification.Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }
}
