package prg1203.assignment;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class CD extends Item {

	private static final long serialVersionUID = -8320086985239770459L;
	private String cdAlbumTitle;
	private String cdDescription;
	private String cdDistributor;
	private String cdDistributorCompany;
	private String cdDistributorAddress;
	private int cdNumberOfTrack;
	private ArrayList<String> cdTrackListing = new ArrayList<String>();
	private transient Scanner sc = new Scanner(System.in);
	
	public CD() {
		addItem();
	}
	
	// Constructor 
	public CD(String itemCode, int itemQuantity, BigDecimal itemCost,
			BigDecimal itemPrice, boolean itemStatus, int itemDiscount,
			String cdAlbumTitle, String cdDescription, String cdDistributor,
			String cdDistributorCompany, String cdDistributorAddress, int cdNumberOfTrack,
			ArrayList<String> cdTrackListing) {
		super(itemCode, itemQuantity, itemCost, itemPrice, itemStatus, itemDiscount);
		setCDAlbumTitle(cdAlbumTitle);
		setCDDescription(cdDescription);
		setCDDistributor(cdDistributor);
		setCDDistributorCompany(cdDistributorCompany);
		setCDDistributorAddress(cdDistributorAddress);
		setCDNumberOfTrack(cdNumberOfTrack);
		setCDTrackListing(cdTrackListing);
	}

	private String getCDAlbumTitle() {
		return this.cdAlbumTitle;
	}
	
	private void setCDAlbumTitle(String cdAlbumTitle) {
		this.cdAlbumTitle = cdAlbumTitle;
	}
	
	private String getCDDescription() {
		return this.cdDescription;
	}
	
	private void setCDDescription(String cdDescription) {
		this.cdDescription = cdDescription;
	}
	
	private String getCDDistributor() {
		return this.cdDistributor;
	}
	
	private void setCDDistributor(String cdDistributor) {
		this.cdDistributor = cdDistributor;
	}
	
	private String getCDDistributorCompany() {
		return this.cdDistributorCompany;
	}
	
	private void setCDDistributorCompany(String cdDistributorCompany) {
		this.cdDistributorCompany = cdDistributorCompany;
	}
	
	private String getCDDistributorAddress() {
		return this.cdDistributorAddress;
	}
	
	private void setCDDistributorAddress(String cdDistributorAddress) {
		this.cdDistributorAddress = cdDistributorAddress;
	}
	
	private int getCDNumberOfTrack() {
		return this.cdNumberOfTrack;
	}
	
	private void setCDNumberOfTrack(int cdNumberOfTrack) {
		this.cdNumberOfTrack = cdNumberOfTrack;
	}
	
	private ArrayList<String> getCDTrackListing() {
		return this.cdTrackListing;
	}
	
	private void setCDTrackListing(ArrayList<String> cdTrackListing) {
		this.cdTrackListing = cdTrackListing;
	}
	
	@Override
	public void addItem() {
		super.addItem();
		System.out.println("[CD Album Title] (str)");
		setCDAlbumTitle(sc.nextLine());
		System.out.println("[CD Description] (str)");
		setCDDescription(sc.nextLine());
		System.out.println("[CD Distributor] (str)");
		setCDDistributor(sc.nextLine());
		System.out.println("[CD Distributor Company] (str)");
		setCDDistributorCompany(sc.nextLine());
		System.out.println("[CD Distributor Address] (str)");
		setCDDistributorAddress(sc.nextLine());
		System.out.println("[CD Number of Tracks] (int)");
		setCDNumberOfTrack(sc.nextInt());
		for (int i=0; i < getCDNumberOfTrack(); i++) {
			System.out.println("[CD Track Name] #" + (i) + " (str)");
			//cdTrackListing.add(sc.nextLine());
			cdTrackListing.set(i, sc.nextLine());
		}
	}

	@Override
	public String toString() {
		return super.toString() +
				"\n[CD Album Title]\t\t" + getCDAlbumTitle() +
				"\n[CD Description]\t\t" + getCDDescription() +
				"\n[CD Distributor]\t\t" + getCDDistributor() +
				"\n[CD Dist. Company]\t\t" + getCDDistributorCompany() +
				"\n[CD Dist. Address]\t\t" + getCDDistributorAddress() +
				"\n[CD No. of Track]\t\t" + getCDNumberOfTrack() +
				"\n[CD Track Listing]\t\t" + getCDTrackListing().toString().replaceAll("\\[|\\]", "");
	}
	
}
