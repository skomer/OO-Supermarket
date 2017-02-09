
package specs;

import static org.junit.Assert.*;
import org.junit.*;
import models.*;

public class CleaningProductTest {

	CleaningProduct bleach = new CleaningProduct("bleach", 3.14, 5.11);
	CleaningProduct rubberGloves = new CleaningProduct("rubber gloves", 0.89, 3.50);

	@Test
	public void hasName() {
		assertEquals("bleach", bleach.getName());
	}

	@Test
	public void hasUnitCost() {
		assertEquals(3.14, bleach.getUnitCost(), 0.001);
	}



}