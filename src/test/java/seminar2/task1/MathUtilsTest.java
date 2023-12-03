package seminar2.task1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

//Напишите тесты с использованием ассертов assertEquals, assertTrue, assertFalse, assertNull,
// assertNotNull и проверьте работу методов на различных наборах данных.
public class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeEach
    void setUp() {
        mathUtils = new MathUtils();
    }

    @AfterEach
    void tearDown() {
        mathUtils = null;
    }

    @Test
    void add() {
        assertEquals(5, mathUtils.add(2, 3));
    }

    @Test
    void subtract() {
        assertTrue(mathUtils.subtract(12,7) == 5);
    }

    @Test
    void multiply() {
        assertFalse(mathUtils.multiply(3, 5) != 15);
    }

    @Test
    void divide() {
        mathUtils = null;
        assertNull(mathUtils);
    }
}
