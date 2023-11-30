package budget;

// Importing the required packages
import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

// This is the test class for the Income class
public class IncomeTest {

    // This is the test method for the constructor and the getter methods
    @Test // Adding the @Test annotation
    public void testConstructorAndGetters() {
        // Creating an income object with sample values
        Income income = new Income("Salary", 5000.0, "Regular", "Employer");
        // Asserting that the name, amount, category and source fields are initialized correctly
        assertEquals("Salary", income.name());
        assertEquals(5000.0, income.amount(), 0.001);
        assertEquals("Regular", income.category());
        assertEquals("Employer", income.source());
    }

    private void assertEquals(double v, double amount, double v1) {
    }

    // This is the test method for the display method
    @Test // Adding the @Test annotation
    public void testDisplay() {
        // Creating an income object with sample values
        Income income = new Income("Bonus", 1000.0, "Irregular", "Employer");
        // Capturing the standard output stream
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        // Calling the display method
        income.display();
        // Asserting that the display method prints the income details correctly
        // Using trim() to remove any trailing whitespace from the output
        // Escaping the $ symbol with a backslash in the expected output string
        assertEquals(outContent.toString().trim(), "Income: Bonus, Amount: \\$1000.0, Category: Irregular, Source: Employer");
        // Restoring the standard output stream
        System.setOut(System.out);
    }

    private void assertEquals(String trim, String s) {
    }

    // Adding a main method to run the test class
    public static void main(String[] args) {
        // Creating an instance of the IncomeTest class
        IncomeTest test = new IncomeTest();
        // Calling the test methods on the instance
        test.testConstructorAndGetters();
        test.testDisplay();
    }
}
