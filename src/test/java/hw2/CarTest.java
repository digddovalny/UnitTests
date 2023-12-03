package hw2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CarTest {

    public String _comp = "TestCompany";
    public String _model  = "TestModel";

    public int _year = 2017;

    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car(_comp, _model, _year);
    }

    @AfterEach
    void tearDown() {
        car = null;
    }

    @Test
    void isVehicle(){
        assertTrue(car instanceof Vehicle);
    }

    @Test
    void CarIsHaveFourWheels(){
        assertTrue(car.getNumWheels() == 4);
    }

    @Test
    void testDrive(){
        car.testDrive();
        assertTrue(car.getSpeed() == 60);
    }

    @Test
    void testParking(){
        car.testDrive();
        car.park();
        assertTrue(car.getSpeed() == 0);
    }
}