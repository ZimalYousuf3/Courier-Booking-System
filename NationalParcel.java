public class NationalParcel extends Parcel {

	public NationalParcel(String trackingId, int weight) {
		super (trackingId, weight);
	}

	@Override
	double calculateCost() {
		return getWeight() * 100; // Rate of Rs. 100 per kg
	}

}