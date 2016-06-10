package prg1203.assignment;

import java.math.BigDecimal;
import java.util.Scanner;

public class Stationery extends Item {
	
	private static final long serialVersionUID = 1559479991529913571L;
	private String stationeryBrandName;
	private String stationeryType;
	private String stationeryManufacturer;
	private String stationeryManufacturerCompany;
	private String stationeryManufacturerAddress;
	private String stationeryBarcode13;
	private transient Scanner sc = new Scanner(System.in);

	public Stationery() {
		addItem();
	}

	public Stationery(String itemCode, int itemQuantity, BigDecimal itemCost,
			BigDecimal itemPrice, boolean itemStatus, int itemDiscount,
			String stationeryBrandName, String stationeryType, String stationeryManufacturer,
			String stationeryManufacturerCompany, String stationeryManufacturerAddress,
			String stationeryBarcode13) {
		super(itemCode, itemQuantity, itemCost, itemPrice, itemStatus, itemDiscount);
		setStationeryBrandName(stationeryBrandName);
		setStationeryType(stationeryType);
		setStationeryManufacturer(stationeryManufacturer);
		setStationeryBarcode13(stationeryBarcode13);
	}
	
	private String getStationeryBrandName() {
		return this.stationeryBrandName;
	}
	
	private void setStationeryBrandName(String stationeryBrandName) {
		this.stationeryBrandName = stationeryBrandName;
	}
	
	private String getStationeryType() {	
		return this.stationeryType;
	}
	
	private void setStationeryType(String stationeryType) {
		this.stationeryType = stationeryType;
	}
	
	private String getStationeryManufacturer() {
		return this.stationeryManufacturer;
	}
	
	private void setStationeryManufacturer(String stationeryManufacturer) {
		this.stationeryManufacturer = stationeryManufacturer;
	}
	
	private String getStationeryManufacturerCompany() {
		return this.stationeryManufacturerCompany;
	}
	
	private void setStationeryManufacturerCompany(String stationeryManufacturerCompany) {
		this.stationeryManufacturerCompany = stationeryManufacturerCompany;
	}
	
	private String getStationeryManufacturerAddress() {
		return this.stationeryManufacturerAddress;
	}
	
	private void setStationeryManufacturerAddress(String stationeryManufacturerAddress) {
		this.stationeryManufacturerAddress = stationeryManufacturerAddress;
	}
	
	private String getStationeryBarcode13() {
		return this.stationeryBarcode13;
	}
	
	private void setStationeryBarcode13(String stationeryBarcode13) {
		this.stationeryBarcode13 = stationeryBarcode13;
	}
	
	@Override
	public void addItem() {
		super.addItem();
		System.out.println("[Brand Name]");
		setStationeryBrandName(sc.nextLine());
		System.out.println("[Type]");
		setStationeryType(sc.nextLine());
		System.out.println("[Manufacturer]");
		setStationeryManufacturer(sc.nextLine());
		System.out.println("[Manufacturer Company]");
		setStationeryManufacturerCompany(sc.nextLine());
		System.out.println("[Manufacturer Address]");
		setStationeryManufacturerAddress(sc.nextLine());
		System.out.println("[Barcode-13]");
		setStationeryBarcode13(sc.nextLine());
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\n[Stationery Brand Name]\t" + getStationeryBrandName() +
				"\n[Stationery Type]\t" + getStationeryType() +
				"\n[Stationery Manufacturer]\t" + getStationeryManufacturer() +
				"\n[Stationery Manufacturer Company]\t" + getStationeryManufacturerCompany() +
				"\n[Stationery Manufacturer Address]\t" + getStationeryManufacturerAddress() +
				"\n[Stationery Barcode-13]\t" + getStationeryBarcode13();
	}
}
