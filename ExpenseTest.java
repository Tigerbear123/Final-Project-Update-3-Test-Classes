package budget;

// Importing the JUnit library
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExpenseTest {

    // A test method that checks the constructor of the Expense class
    @Test
    public void testConstructor() {
        // Creating an Expense object with some sample values
        Expense e = new Expense("Groceries", 50.0, "Food", "2023-11-28", "Credit Card");

        // Asserting that the name, amount, category, date and payment method are initialized correctly
        assertEquals("Groceries", e.getName());
        assertEquals(50.0, e.getAmount(), 0.001);
        assertEquals("Food", e.getCategory());
        assertEquals("2023-11-28", e.getDate());
        assertEquals("Credit Card", e.getPaymentMethod());
    }

    // A test method that checks the getDescription method of the Expense class
    @Test
    public void testGetDescription() {
        // Creating an Expense object with some sample values
        Expense e = new Expense("Gas", 20.0, "Transportation", "2023-11-27", "Debit Card");
        // Asserting that the getDescription method returns the expected string
        // The expected string should have a comma after the category name
        assertEquals(e.getDescription(), "Gas (Transportation) - 20.0 paid by Debit Card on 2023-11-27");
    }
}
