public class InternationalParcel extends Parcel {

	public InternationalParcel(String trackingId, int weight) {
		super (trackingId, weight);
	}

	@Override
	double calculateCost() {
		return getWeight() * 500; // Rate of Rs. 500 per kg
	}

}