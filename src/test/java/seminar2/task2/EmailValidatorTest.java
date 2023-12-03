package seminar2.task2;
import org.junit.jupiter.api.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


//Напишите тесты с использованием аннотаций @Test, @Before, @After, @BeforeClass, @AfterClass
// для проверки различных сценариев, включая правильные и неправильные адреса.
public class EmailValidatorTest {

    private static EmailValidator emailValidator;

    @BeforeAll
    static void setUp() {
        emailValidator = new EmailValidator();
    }

    @AfterAll
    static void tearDown() {
        emailValidator = null;
    }

    @Test
    void isValidEmail() {
        assertTrue(emailValidator.isValidEmail("asd@mail.ru"));
    }

    @Test
    void isNotValidEmail() {
        assertFalse(emailValidator.isValidEmail("asdmai-laas"));
    }
}
