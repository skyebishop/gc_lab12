//Add a class named Dealership with name and city. 
//Car HAS-A Dealership. When printing out the list of cars, include the 
//dealership name & city.

package lab12;

public class Dealership extends Car {

	private String city;
	private String name;
	
	public Dealership() {
		super(); // calls the empty constructor for Car
		// super calls whatever is one level higher than itself
	}
	
	// Dealership full constructor
		public Dealership(String make, String model, int year, double price, String name, String city) {
			super(make, model, year, price); // calls super again, for make, model, year, price
			this.city = city; 
			this.name = name;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return super.toString() + name + ", " + city;
		}
		
}
