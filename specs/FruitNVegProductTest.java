
package specs;

import static org.junit.Assert.*;
import org.junit.*;
import models.*;

public class FruitNVegProductTest {

	FruitNVegProduct grapes = new FruitNVegProduct("grapes", 2.03, 4.50);

	@Test
	public void hasName() {
		assertEquals("grapes", grapes.getName());
	}

	@Test
	public void hasUnitCost() {
		assertEquals(2.03, grapes.getUnitCost(), 0.001);
	}

	@Test
	public void hasUnitPrice() {
		assertEquals(4.50, grapes.getUnitPrice(), 0.001);
	}

	
}