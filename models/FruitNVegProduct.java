
package models;

public class FruitNVegProduct extends Item {

	String name;
	double unitCost;
	double unitPrice;

	public FruitNVegProduct(String name, double unitCost, double unitPrice) {
		this.name = name;
		this.unitCost = unitCost;
		this.unitPrice = unitPrice;
	}

	public String getName() {
		return this.name;
	}

	public double getUnitCost() {
		return this.unitCost;
	}

	public double getUnitPrice() {
		return this.unitPrice;
	}


}