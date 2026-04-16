import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class FatorialTest {
    
    @Test
    public void testZero() {
        assertEquals(1, Fatorial.fat(0));
    }

    @Test
    public void testNegative() {
        assertEquals(-1, Fatorial.fat(-1));
    }

    @Test
    public void testBiggest() {
        assertEquals(479001600, Fatorial.fat(12));
    }

    @Test
    public void testOne() {
        assertEquals(1, Fatorial.fat(1));
    }

    @Test
    public void testTwo() {
        assertEquals(2, Fatorial.fat(2));
    }

    @Test
    public void testThree() {
        assertEquals(6, Fatorial.fat(3));
    }

    @Test
    public void testFour() {
        assertEquals(24, Fatorial.fat(4));
    }

    @Test
    public void testFive() {
        assertEquals(120, Fatorial.fat(5));
    }

}
