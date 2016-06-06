package prg1203.assignment;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class CD extends Item {

	private static final long serialVersionUID = -8320086985239770459L;
	private String cdAlbumTitle;
	private String cdDescription;
	private String cdDistributor;
	private int cdNumberOfTrack;
	private String[] cdTrackListing;
	private Scanner sc = new Scanner(System.in);
	
	public CD() {
		addItem();
	}
	
	// Constructor 
	public CD(String itemCode, int itemQuantity, BigDecimal itemCost,
			BigDecimal itemPrice, boolean itemStatus, int itemDiscount,
			String cdAlbumTitle, String cdDescription,
			String cdDistributor, int cdNumberOfTrack, String[] cdTrackListing) {
		super(itemCode, itemQuantity, itemCost, itemPrice, itemStatus, itemDiscount);
		setCDAlbumTitle(cdAlbumTitle);
		setCDDescription(cdDescription);
		setCDDistributor(cdDistributor);
		setCDNumberOfTrack(cdNumberOfTrack);
		setCDTrackListing(cdTrackListing);
	}

	public String getCDAlbumTitle() {
		return this.cdAlbumTitle;
	}
	
	public void setCDAlbumTitle(String cdAlbumTitle) {
		this.cdAlbumTitle = cdAlbumTitle;
	}
	
	public String getCDDescription() {
		return this.cdDescription;
	}
	
	public void setCDDescription(String cdDescription) {
		this.cdDescription = cdDescription;
	}
	
	public String getCDDistributor() {
		return this.cdDistributor;
	}
	
	public void setCDDistributor(String cdDistributor) {
		this.cdDistributor = cdDistributor;
	}
	
	public int getCDNumberOfTrack() {
		return this.cdNumberOfTrack;
	}
	
	public void setCDNumberOfTrack(int cdNumberOfTrack) {
		this.cdNumberOfTrack = cdNumberOfTrack;
	}
	
	public String[] getCDTrackListing() {
		return this.cdTrackListing;
	}
	
	public void setCDTrackListing(String[] cdTrackListing) {
		this.cdTrackListing = cdTrackListing;
	}
	
	public void addItem() {
	super.addItem();
	System.out.println(" CD Album Title (STRING)");
	this.cdAlbumTitle = sc.nextLine();
	System.out.println(" CD Description (STRING)");
	this.cdDescription = sc.nextLine();
	System.out.println(" CD Distributor (STRING)");
	this.cdDistributor = sc.nextLine();
	System.out.println(" CD Number of Tracks (INTERGER)");
	this.cdNumberOfTrack = sc.nextInt();
	//String cdTrackListing[] = {};
	for (int i=0; i < cdNumberOfTrack; i++) {
		System.out.println(" CD Track Name #" + (i+1) + " (STRING)");
		this.cdTrackListing[i] = sc.nextLine();
	}
	}

	@Override
	public String toString() {
		return super.toString() +
				"\n\tAlbum Title:\t" + cdAlbumTitle +
				"\n\tDescription:\t" + cdDescription +
				"\n\tDistributor:\t" + cdDistributor +
				"\n\tNo. of Track:\t" + cdNumberOfTrack +
				"\n\tTrack Listing:\t" + Arrays.toString(cdTrackListing);
	}
	
}
