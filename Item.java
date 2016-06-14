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
	
	public void editItem(Scanner sc) {
		System.out.println("Editing item...");
		System.out.println(this.toString());
		System.out.println("[Item Quantity] (int)");
		setItemQuantity(sc.nextInt());
		sc.nextLine(); // To consume new line token on last input
		System.out.println("[Item Cost] (dec)");
		setItemCost(sc.nextBigDecimal());
		System.out.println("[Item Price] (dec)");
		setItemPrice(sc.nextBigDecimal());
		System.out.println("[Item Status] (boo)");
		setItemStatus(sc.nextBoolean());
		System.out.println("[Item Discount] % (int)");
		setItemDiscount(sc.nextInt());
		sc.nextLine();
	}
	
	public void updateItemQuantity(int i) {
		System.out.println("Item amount changed from " + getItemQuantity() + " to " + i);
		setItemQuantity(i);
	}
	
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
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Item) {
			return this.itemCode == ((Item) obj).itemCode;
		}
		return false;
	}
	
	// Hash from itemCode to have consistent result between object
	@Override
	public int hashCode() {
		return itemCode.hashCode();
	}
	
	@Override
	public String toString() {
		return "[Item Code]\t\t\t" + getItemCode() + 
				"\n[Item Quantity]\t\t\t" + getItemQuantity() + 
				"\n[Item Cost]\t\t\t$" + getItemCost() + 
				"\n[Item Price]\t\t\t$" + getItemPrice() +
				"\n[Item Status]\t\t\t" + getItemStatus() +
				"\n[Item Discount]\t\t\t" + getItemDiscount() + "%";
	}
	
}
