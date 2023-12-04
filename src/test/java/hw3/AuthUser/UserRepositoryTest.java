package hw3.AuthUser;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    UserRepository userRepository;
    User user1;
    User user2;
    User user3;

    @BeforeEach
    void setUp() {
        userRepository = new UserRepository();
        user1 = new User("User1", "password1", false);
        user2 = new User("User2", "password2", true);
        user3 = new User("User3", "password3", false);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addUser() {
        userRepository.addUser(user1);
        userRepository.addUser(user2);
        assertEquals(2, userRepository.getData().size());
    }

    @Test
    void unlogingUsers() {
        userRepository.addUser(user1);
        userRepository.addUser(user2);
        userRepository.addUser(user3);

        userRepository.unlogingUsers();

        assertEquals(1, userRepository.getData().size());
    }
}