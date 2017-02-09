
package specs;

import static org.junit.Assert.*;
import org.junit.*;
import models.*;
import constants.*;

public class CustomerTest {

	Customer lidl = new Customer(CustomerType.SUPERMARKET, "Lidl");
	Customer ruth = new Customer(CustomerType.SHOPPER, "Ruth");

	@Test
	public void hasCustomerType() {
		assertEquals(CustomerType.SUPERMARKET, lidl.getCustomerType());
	}

	@Test
	public void hasName() {
		assertEquals("Ruth", ruth.getName());
	}



}