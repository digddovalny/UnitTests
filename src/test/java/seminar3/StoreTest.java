package seminar3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    private Store store;
    private Product product;
    private Product secondProduct;
    @BeforeEach
    void setUp() {
        store = new Store();
        product = new Product("Apple", 999, 3);
        secondProduct = new Product("Banana", 101, 999);
    }

    @AfterEach
    void tearDown() {
        store = null;
        product = null;
        secondProduct = null;
    }

    @Test
    void addProductToInventory() {
        store.addProductToInventory(product);
        store.addProductToInventory(secondProduct);
        assertEquals(2, store.getInventory().size());
    }

    @Test
    void removeProductFromInventory() {
        store.addProductToInventory(product);
        store.addProductToInventory(secondProduct);
        store.removeProductFromInventory(product);
        assertEquals(1, store.getInventory().size());
    }

    @Test
    void findProductByName() {
        store.addProductToInventory(product);
        store.addProductToInventory(secondProduct);
        assertEquals("Banana", store.findProductByName("Banana").getName());
    }

    @Test
    void createCart() {
        Cart cart = store.createCart();
        assertNotNull(cart);
    }
}