package lab12;

public class UsedCar extends Car {

	private double mileage;

	public UsedCar() {
		super(); // calls the empty constructor for Car
		// super calls whatever is one level higher than itself
	}

	// UsedCar full constructor
	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price); // calls super again, for make, model, year, price
		this.mileage = mileage; // sets mileage (this is what makes UsedCar different)
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return super.toString() + " (Used) mileage: " + mileage + "";
	}


}
