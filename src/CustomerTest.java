import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

class CustomerTest {

    private Customer customer;
    private String customerName;

    @BeforeEach
    void setUp() {
        customerName = "John";
        customer = new Customer(customerName);
    }

    @org.junit.jupiter.api.Test
    void addRental() {
        Rental rental = new Rental(new Movie("Test movie", 0), 3);
        customer.addRental(rental);
    }

    @Test
    void getName() {
        Assertions.assertEquals("John", customer.getName());

    }

    @org.junit.jupiter.api.Test
    void statement() {
        Assertions.assertTrue(customer.statement().startsWith("Rental Record for John"));
        Assertions.assertTrue(customer.statement().endsWith(" frequent renter points"));
    }
}