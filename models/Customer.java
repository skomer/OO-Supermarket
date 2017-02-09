
package models;
import constants.*;

public class Customer {

	CustomerType customerType;
	String name;

	public Customer(CustomerType customerType, String name) {
		this.customerType = customerType;
		this.name = name;
	}

	public CustomerType getCustomerType() {
		return this.customerType;
	}

	public String getName() {
		return this.name;
	}




}