package hw2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {
    private Motorcycle motorcycle;
    public String _comp = "TestCompany";
    public String _model  = "TestModel";

    public int _year = 2017;
    @BeforeEach
    void setUp() {
        motorcycle = new Motorcycle(_comp, _model, _year);
    }

    @AfterEach
    void tearDown() {
        motorcycle = null;
    }

    @Test
    void isVehicle(){
        assertTrue(motorcycle instanceof Vehicle);
    }

    @Test
    void CarIsHaveFourWheels(){
        assertTrue(motorcycle.getNumWheels() == 2);
    }

    @Test
    void testDrive(){
        motorcycle.testDrive();
        assertTrue(motorcycle.getSpeed() == 75);
    }

    @Test
    void testParking(){
        motorcycle.testDrive();
        motorcycle.park();
        assertTrue(motorcycle.getSpeed() == 0);
    }
}