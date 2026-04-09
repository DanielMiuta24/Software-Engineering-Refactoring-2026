import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RentalTest {
    private Movie testMovie;
    private int daysRented;
    private Rental testRental;

    @BeforeEach
    void setUp() {
        testMovie = new Movie("Testmovie", 0);
        daysRented = 3;
        testRental = new Rental(testMovie, daysRented);
    }

    @Test
    void getDaysRented() {
        assertEquals(3, testRental.getDaysRented());
    }

    @Test
    void getMovie() {
        assertTrue(testMovie.getTitle() == testRental.getMovie().getTitle());
        assertTrue(testMovie.getPriceCode() == testRental.getMovie().getPriceCode());
    }
}