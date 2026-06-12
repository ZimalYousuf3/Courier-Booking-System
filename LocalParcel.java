public class LocalParcel extends Parcel {

	public LocalParcel(String trackingId, int weight) {
		super (trackingId, weight);
	}

	@Override
	double calculateCost() {
		return getWeight() * 40; // Rate of Rs. 40 per kg
	}

}