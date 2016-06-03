package prg1203.assignment;

import java.math.BigDecimal;

public class Item {
	
	private String itemCode;
	private int itemQuantity;
	private BigDecimal itemCost;
	private BigDecimal itemPrice;
	private boolean itemStatus; // False is unavailable
	private int itemDiscount;
	
	// No-args constructor
	public Item() {
	}

	// Constructor
	public Item(String itemCode, int itemQuantity, BigDecimal itemCost, BigDecimal itemPrice, boolean itemStatus, int itemDiscount) {
		setItemCode(itemCode);
		setItemQuantity(itemQuantity);
		setItemCost(itemCost);
		setItemPrice(itemPrice);
		setItemStatus(itemStatus);
		setItemDiscount(itemDiscount);
	}
	
	// Getter & Setter
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
	
	public BigDecimal getItemCost() {
		return this.itemCost;
	}
	
	public void setItemCost(BigDecimal itemCost) {
		this.itemCost = itemCost;
	}
	
	public BigDecimal getItemPrice() {
		return this.itemPrice;
	}
	
	public void setItemPrice(BigDecimal itemPrice) {
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

	// Java method() overrides
	@Override
	public String toString() {
		return "Item Code:\t" + itemCode + 
				"\nItem Quantity:\t" + itemQuantity + 
				"\nItem Cost:\t$" + itemCost + 
				"\nItem Price:\t$" + itemPrice +
				"\nItem Status:\t" + itemStatus +
				"\nItem Discount:\t" + itemDiscount + "%";
	}
	
}
