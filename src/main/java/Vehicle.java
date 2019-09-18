
public class Vehicle {
	
	String rego;
	String model;
	String color;
	Double purchasePrice;
	//String sellingPrice;
	
	public String getRego() {
		return rego;
	}
	public void setRego(String rego) {
		this.rego = rego;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public Vehicle(String rego, String model, String color, Double purchasePrice) {
		super();
		this.rego = rego;
		this.model = model;
		this.color = color;
		this.purchasePrice = purchasePrice;
	}
	

	
	
	
	

}
