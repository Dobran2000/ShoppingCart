package DiagrameClase;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddToCart {

	@Test
	void testShoppingCart() {
		fail("Not yet implemented");
	}

	@Test
	void testShoppingCartInt() {
		fail("Not yet implemented");
	}

	@Test
	void testShoppingCartCustomer() {
		fail("Not yet implemented");
	}

	@Test
	void testShoppingCartAdmin() {
		fail("Not yet implemented");
	}

	@Test
	void testAddProduct() {
		
		ShoppingCart cart=new ShoppingCart();
		String productName="oil";
		cart.AddProduct(productName);
		 for(Product product: cart.products)
			 if(product.getProductName().equals(productName))
			 {
			//	 assertTrue(cart.AddProduct(productName));
				 
			 }
		
	}

	@Test
	void testRemoveProduct() {
		fail("Not yet implemented");
	}

	@Test
	void testAddProductToCatalog() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoveProductToCatalog() {
		fail("Not yet implemented");
	}

	@Test
	void testCalculateTotalPrice() {
		fail("Not yet implemented");
	}

	@Test
	void testGetCostOfCart() {
		fail("Not yet implemented");
	}

	@Test
	void testShowCart() {
		fail("Not yet implemented");
	}

	@Test
	void testPrintTotal() {
		fail("Not yet implemented");
	}

	@Test
	void testShowAllProducts() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateStock() {
		fail("Not yet implemented");
	}

	@Test
	void testBuildProductCatalog() {
		fail("Not yet implemented");
	}

	@Test
	void testGetCatalogDescription() {
		fail("Not yet implemented");
	}

}
