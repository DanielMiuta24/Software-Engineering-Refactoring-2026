import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieTest {
    private String title;
    private int priceCode;
    Movie testmovie;

    @BeforeEach
    void setUp() {
        title = "Testmovie";
        priceCode = 0;
        testmovie = new Movie(title, priceCode);
    }

    @Test
    void getPriceCode() {
        assertEquals(0, testmovie.getPriceCode());
    }

    @Test
    void setPriceCode() {
        testmovie.setPriceCode(0);
        assertEquals(0, testmovie.getPriceCode());
    }

    @Test
    void getTitle() {
        assertEquals("Testmovie", testmovie.getTitle());
    }
}