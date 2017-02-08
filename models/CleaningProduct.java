
package supermarket.models;

public class CleaningProduct extends Item {

	String name;
	double unitCost;
	double unitPrice;

	public CleaningProduct(String name, double unitCost, double unitPrice) {
		this.name = name;
		this.unitCost = unitCost;
		this.unitPrice = unitPrice;
	}



}