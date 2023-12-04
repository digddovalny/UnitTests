package seminar3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    private Cart cart;
    private Product product;
    private Product secondProduct;

    @BeforeEach
    void setUp() {
        cart = new Cart();
        product = new Product("Apple", 999, 3);
        secondProduct = new Product("Banana", 101, 96);
    }

    @AfterEach
    void tearDown() {
        cart = null;
        product = null;
        secondProduct = null;
    }

    @Test
    void addProduct() {
        cart.addProduct(product);
        cart.addProduct(secondProduct);
        assertEquals(2, cart.getProducts().size());
    }

    @Test
    void removeProduct() {
        cart.addProduct(product);
        cart.addProduct(secondProduct);
        cart.removeProduct(product);
        assertEquals(1, cart.getProducts().size());
    }

    @Test
    void calculateTotalPrice() {
        cart.addProduct(product);
        cart.addProduct(secondProduct);
        double summ = cart.calculateTotalPrice();
        assertEquals(12693, summ, 0.01);
    }
}