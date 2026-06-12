// Base Class

public abstract class Parcel {
	private String trackingId;
	private int weight;

	// Constructor
	public Parcel(String trackingId, int weight) {
		this.trackingId = trackingId;
		this.weight = weight;
	}

	// Getters
	public String getTrackingId() {
		return trackingId;
	}

	public int getWeight() {
		return weight;
	}
	
	// Abstract method that will be overridden in derived classes
	abstract double calculateCost();

}
