
package models;

public class CleaningProduct extends Item {

	String name;
	double unitCost;
	double unitPrice;

	public CleaningProduct(String name, double unitCost, double unitPrice) {
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



}