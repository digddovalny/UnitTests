package seminar2.task3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

//Используйте параметризованные тесты для проверки работы этих операций
// на различных входных данных и убедитесь, что результаты верны

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @ParameterizedTest
    @CsvSource({"1, 2, 3", "0, 0, 0", "-1, 1, 0", "10, -5, 5"})
    void testAdd(int a, int b, int expected) {
        int result = calculator.add(a, b);
        assertEquals(expected, result);
    }
    @ParameterizedTest
    @CsvSource({"1, 2, -1", "0, 0, 0", "-1, 1, -2", "10, -5, 15"})
    void testSubtract(int a, int b, int expected) {
        int result = calculator.subtract(a, b);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"1, 2, 2", "0, 0, 0", "-1, 1, -1", "10, 5, 50"})
    void testMultiply(int a, int b, int expected) {
        int result = calculator.multiply(a, b);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"1, 2, 0.5", "-1, 1, -1", "10, 5, 2"})
    void testDivide(int a, int b, double expected) {
        double result = calculator.divide(a, b);
        assertEquals(expected, result);
    }

    @Test
    void whatExeptionWillbethrown(){
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }

    @ParameterizedTest
    @CsvSource({"1, 0", "-1, 0", "10, 0"})
    void nameExeptions(int a, int b) {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(a, b));
    }
}