package prg1203.assignment;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Scanner;

public class Item implements Serializable {
	
	private static final long serialVersionUID = -5667307610580268110L;
	private String itemCode;
	private int itemQuantity;
	private BigDecimal itemCost;
	private BigDecimal itemPrice;
	private boolean itemStatus; // False is unavailable
	private int itemDiscount;
	private Scanner sc = new Scanner(System.in);
	
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
	
	// General get and set
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
	
	public void addItem() {
		System.out.println(" Item Code (STRING)");
		this.itemCode = sc.nextLine();
		System.out.println(" Item Quantity (INTEGER)");
		this.itemQuantity = sc.nextInt();
		System.out.println(" Item Cost (DECIMAL)");
		this.itemCost = sc.nextBigDecimal();
		System.out.println(" Item Price (DECIMAL)");
		this.itemPrice = sc.nextBigDecimal();
		System.out.println(" Item Status (TRUE OR FALSE)");
		this.itemStatus = sc.nextBoolean();
		System.out.println(" Item Discount % (INTEGER)");
		this.itemDiscount = sc.nextInt();
	}
	
	@Override
	public String toString() {
		return "\tItem Code:\t" + itemCode + 
				"\n\tItem Quantity:\t" + itemQuantity + 
				"\n\tItem Cost:\t$" + itemCost + 
				"\n\tItem Price:\t$" + itemPrice +
				"\n\tItem Status:\t" + itemStatus +
				"\n\tItem Discount:\t" + itemDiscount + "%";
	}
	
}
