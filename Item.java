package prg1203.assignment;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Item implements Serializable {
	
	private static final long serialVersionUID = -5667307610580268110L;
	private String itemCode;
	private int itemQuantity;
	private BigDecimal itemCost;
	private BigDecimal itemPrice;
	private boolean itemStatus; // False is unavailable
	private int itemDiscount;
	private transient Scanner sc = new Scanner(System.in);
	
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
	private String getItemCode() {
		return this.itemCode;
	}
	
	private void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	
	private int getItemQuantity() {
		return this.itemQuantity;
	}
	
	private void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	
	private BigDecimal getItemCost() {
		return this.itemCost;
	}
	
	private void setItemCost(BigDecimal itemCost) {
		this.itemCost = itemCost;
	}
	
	private BigDecimal getItemPrice() {
		return this.itemPrice;
	}
	
	private void setItemPrice(BigDecimal itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	private boolean getItemStatus() {
		return this.itemStatus;
	}
	
	private void setItemStatus(boolean itemStatus) {
		this.itemStatus = itemStatus;
	}
	
	private int getItemDiscount() {
		return this.itemDiscount;
	}
	
	private void setItemDiscount(int itemDiscount) {
		this.itemDiscount = itemDiscount;
	}
	
	public void addItem() {
		System.out.println("[Item Code] (str)");
		setItemCode(sc.nextLine());
		System.out.println("[Item Quantity] (int)");
		setItemQuantity(sc.nextInt());
		System.out.println("[Item Cost] (dec)");
		setItemCost(sc.nextBigDecimal());
		System.out.println("[Item Price] (dec)");
		setItemPrice(sc.nextBigDecimal());
		System.out.println("[Item Status] (boo)");
		setItemStatus(sc.nextBoolean());
		System.out.println("[Item Discount] % (int)");
		setItemDiscount(sc.nextInt());
	}
	
	public void editItem() {
//		String s;
//		int i;
//		boolean b;
		System.out.println("Editing item...");
		System.out.println(this.toString());
		System.out.println("[Item Quantity] (int)");
		setItemQuantity(sc.nextInt());
		System.out.println("[Item Cost] (dec)");
		setItemCost(sc.nextBigDecimal());
		System.out.println("[Item Price] (dec)");
		setItemPrice(sc.nextBigDecimal());
		System.out.println("[Item Status] (boo)");
		setItemStatus(sc.nextBoolean());
		System.out.println("[Item Discount] % (int)");
		setItemDiscount(sc.nextInt());
	}
	
	public void updateItemQuantity(int i) {
		setItemQuantity(i);
	}
	
//	public void updateItemQuantity(ArrayList<Item> items, int amount) {
//		System.out.println("Search Query [Item Code]:");
//		Item result = Item.searchItem(items, sc.nextLine());
//		if (result != null) {
//			int i = items.indexOf(result);
//		}
//	}
	
	public static Item searchItem(ArrayList<Item> items, String query) {
		if (items == null)
			throw new IllegalArgumentException("Error occured! Database is empty.\n");
		for (Item x: items) {
			if (x.getItemCode().equalsIgnoreCase(query)) {
				return x;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		return "\n[Item Code]:\t" + getItemCode() + 
				"\n[Item Quantity]:\t" + getItemQuantity() + 
				"\n[Item Cost]:\t$" + getItemCost() + 
				"\n[Item Price]:\t$" + getItemPrice() +
				"\n[Item Status]:\t" + getItemStatus() +
				"\n[Item Discount]:\t" + getItemDiscount() + "%";
	}
	
}
