package prg1203.assignment;

public class Item {
	
	private String itemCode;
	private int itemQuantity;
	private double itemCost;
	private double itemPrice;
	private boolean itemStatus; // False is unavailable
	private int itemDiscount;
	
	// No-args constructor
	public Item() {
		setItemCode("");
		setItemQuantity(0);
		setItemCost(0);
		setItemPrice(0);
		setItemStatus(false);
		setItemDiscount(0);
	}

	// Constructor
	public Item(String itemCode, int itemQuantity, double itemCost, double itemPrice, boolean itemStatus, int itemDiscount) {
		setItemCode(itemCode);
		setItemQuantity(itemQuantity);
		setItemCost(itemCost);
		setItemPrice(itemPrice);
		setItemStatus(itemStatus);
		setItemDiscount(itemDiscount);
	}
	
	public String getItemCode() {
		return this.itemCode;
	}
	
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	
	public int getItemQuantity() {
		return this.itemQuantity;
	}
	
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	
	public double getItemCost() {
		return this.itemCost;
	}
	
	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}
	
	public double getItemPrice() {
		return this.itemPrice;
	}
	
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public boolean getItemStatus() {
		return this.itemStatus;
	}
	
	public void setItemStatus(boolean itemStatus) {
		this.itemStatus = itemStatus;
	}
	
	public int getItemDiscount() {
		return this.itemDiscount;
	}
	
	public void setItemDiscount(int itemDiscount) {
		this.itemDiscount = itemDiscount;
	}

	@Override
	public String toString() {
		return "Item [itemCode=" + itemCode + ", itemQuantity=" + itemQuantity + ", itemCost=" + itemCost
				+ ", itemPrice=" + itemPrice + ", itemStatus=" + itemStatus + ", itemDiscount=" + itemDiscount + "]";
	}
	
}
