import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTest {

    private Customer customer;
    private String customerName;

    @BeforeEach
    void setUp() {
        customerName = "John";
        customer = new Customer(customerName);
    }

    @Test
    void addRental() {
        Rental rental = new Rental(new Movie("Test movie", 0), 3);
        customer.addRental(rental);
    }

    @Test
    void getName() {
        Assertions.assertEquals("John", customer.getName());

    }

    @Test
    void statement() {
        Assertions.assertTrue(customer.statement().startsWith("Rental Record for John"));
        Assertions.assertTrue(customer.statement().endsWith(" frequent renter points"));
    }
}