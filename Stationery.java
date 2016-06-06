package prg1203.assignment;

import java.math.BigDecimal;
import java.util.Scanner;

public class Stationery extends Item {
	
	private static final long serialVersionUID = 1559479991529913571L;
	private String stationeryBrandName;
	private String stationeryType;
	private String stationeryManufacturer;
	private String stationeryBarcode13;
	private Scanner sc = new Scanner(System.in);

	public Stationery() {
		addItem();
	}

	public Stationery(String itemCode, int itemQuantity, BigDecimal itemCost,
			BigDecimal itemPrice, boolean itemStatus, int itemDiscount,
			String stationeryBrandName, String stationeryType, String stationeryManufacturer,
			String stationeryBarcode13) {
		super(itemCode, itemQuantity, itemCost, itemPrice, itemStatus, itemDiscount);
		setStationeryBrandName(stationeryBrandName);
		setStationeryType(stationeryType);
		setStationeryManufacturer(stationeryManufacturer);
		setStationeryBarcode13(stationeryBarcode13);
	}
	
	public String getStationeryBrandName() {
		return this.stationeryBrandName;
	}
	
	public void setStationeryBrandName(String stationeryBrandName) {
		this.stationeryBrandName = stationeryBrandName;
	}
	
	public String getStationeryType() {	
		return this.stationeryType;
	}
	
	public void setStationeryType(String stationeryType) {
		this.stationeryType = stationeryType;
	}
	
	public String getStationeryManufacturer() {
		return this.stationeryManufacturer;
	}
	
	public void setStationeryManufacturer(String stationeryManufacturer) {
		this.stationeryManufacturer = stationeryManufacturer;
	}
	
	public String getStationeryBarcode13() {
		return this.stationeryBarcode13;
	}
	
	public void setStationeryBarcode13(String stationeryBarcode13) {
		this.stationeryBarcode13 = stationeryBarcode13;
	}
	
	public void addItem() {
		super.addItem();
		System.out.println(" Brand Name:");
		this.stationeryBrandName = sc.nextLine();
		System.out.println(" Type:");
		this.stationeryType = sc.nextLine();
		System.out.println(" Manufacturer:");
		this.stationeryManufacturer = sc.nextLine();
		System.out.println(" Barcode-13:");
		this.stationeryBarcode13 = sc.nextLine();
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\n\tBrand Name:\t" + stationeryBrandName +
				"\n\tType:\t\t" + stationeryType +
				"\n\tManufacturer:\t" + stationeryManufacturer +
				"\n\tBarcode-13:\t" + stationeryBarcode13;
	}
}
