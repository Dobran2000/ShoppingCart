package DiagrameClase;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testareShoppingCart {

	@Test
	void testRemoveProduct() {
		ShoppingCart cart=new ShoppingCart();
		String productName="oil";
	//   assertTrue(cart.RemoveProduct(productName));
	}

	@Test
	void testAddProductToCatalog() {
		ShoppingCart cart=new ShoppingCart();
		String productName="oil";
	//	assertTrue(cart.AddProduct(productName));
	}
}
