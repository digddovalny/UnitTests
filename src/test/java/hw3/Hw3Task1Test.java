package hw3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Hw3Task1Test {

    private Hw3Task1 hw;

    @BeforeEach
    void setUp() {
        hw = new Hw3Task1();
    }

    @AfterEach
    void tearDown() {
        hw = null;
    }

    @Test
    void evenOddNumber() {
        assertTrue(hw.evenOddNumber(2));
        assertFalse(hw.evenOddNumber(3));
    }
}