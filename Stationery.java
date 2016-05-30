package prg1203.assignment;

public class Stationery extends Item {
	
	private String stationeryBrandName;
	private String stationeryType;
	private String stationeryManufacturer;
	private String stationeryBarcode13;

	public Stationery() {
	}

	public Stationery(String itemCode, int itemQuantity, double itemCost,
			double itemPrice, boolean itemStatus, int itemDiscount,
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
	
	@Override
	public String toString() {
		return super.toString() + "\nBrand Name:\t" + stationeryBrandName + "\nType:\t\t" + stationeryType + "\nManufacturer:\t"
				+ stationeryManufacturer + "\nBarcode-13:\t" + stationeryBarcode13;
	}
}
