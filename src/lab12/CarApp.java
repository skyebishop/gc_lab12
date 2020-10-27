package lab12;

import java.util.*;
import lab12.Validator;

public class CarApp {

	public static Scanner scnr = new Scanner(System.in);
	public static List<Car> cars = new ArrayList<>();

	public static void main(String[] args) {

		System.out.println("Welcome to the Grand Circus Motors admin console!\n");

		String prompt = "How many cars would you like to enter?";
		int userChoice = Validator.getInt(scnr, prompt);

		for (int i = 0; i < userChoice; i++)
			addCar();

		listCars();

	}

	public static void addCar() {

		Car car = new Car(); // create new empty car

		// user sets car details below
		System.out.println("Make: ");
		car.setMake(scnr.next());

		System.out.println("Model: ");
		car.setModel(scnr.next());

		System.out.println("Year: ");
		car.setYear(scnr.nextInt());

		System.out.println("Price: ");
		car.setPrice(scnr.nextDouble());

		scnr.nextLine(); // "nextDouble" does not clear the scanner, so this is garbage colection

		// add above instance of car to static ArrayList
		cars.add(car);

	}

	public static void listCars() {
		// print out each car
		for (int i = 0; i < cars.size(); i++) {
			System.out.println("Car " + (i + 1) + ": " + cars.get(i));
		}

	}

}
