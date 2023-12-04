package hw3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Hw3Task2Test {

    private Hw3Task2 hw;

    @BeforeEach
    void setUp() {
        hw = new Hw3Task2();
    }

    @AfterEach
    void tearDown() {
        hw = null;
    }

    @Test
    void numberInInterval() {
        assertTrue(hw.numberInInterval(26));
        assertFalse(hw.numberInInterval(14));
    }

//    @ParameterizedTest
//    @ValueSource(ints = {25, 35, 56, 66})
//    @DisplayName("Параметризованный тест для провенрки нахождения числа в интервале")
//    void numberInInterval(int arg) {
//        assertTrue(hw.numberInInterval(arg));
//    }
}