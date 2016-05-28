package prg1203.assignment;

public class CD extends Item {

	private String cdAlbumTitle;
	private String cdDescription;
	private String cdDistributor;
	private int cdNumberOfTrack; // Use array.length - 1
	private String[] cdTrackListing; // Array of tracks name
	
	// No-args constructor
	public CD() {
		super();
		setCDAlbumTitle("");
		setCDDescription("");
		setCDDistributor("");
		setCDNumberOfTrack(0);
		// TODO Initialise an empty String array
		//setCDTrackListing();
	}
	
	// Constructor 
	public CD(String itemCode, int itemQuantity, double itemCost,
			double itemPrice, boolean itemStatus, int itemDiscount,
			String cdAlbumTitle, String cdDescription, int cdNumberOfTrack,
			String[] cdTrackListing) {
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
}
