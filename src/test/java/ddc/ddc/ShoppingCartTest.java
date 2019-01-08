package ddc.ddc;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class ShoppingCartTest {
	
	ShoppingCart cart;

	public void setUp(){
	    cart = new ShoppingCart();
	}

	@Test
	public void addOneItemToCart() {
	    cart.addItem("Apple");
	    assertTrue(cart.doesContain("Apple"));
	}

}
