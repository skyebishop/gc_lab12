package lab12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DealershipApp {
	
	public static Scanner scnr = new Scanner(System.in);
	public static List<Car> cars = new ArrayList<>();
	static {
		cars.add(new Car("Subaru", "Impreza", 2018, 24000.00));
		cars.add(new Car("Ford", "Focus", 2019, 45000.00));
		cars.add(new Car("Mitsubishi", "Lancer", 2020, 23000.00));
		cars.add(new Dealership("Toyota", "Rav4", 2009, 5000.00, "Fairlane","Dearborn"));
		cars.add(new Dealership("Nissan", "Cube", 2002, 500.00, "LaFontaine","Saline"));
		cars.add(new Dealership("Subaru", "Crossover", 2004, 6000.00,"Star Lincoln","Southfield"));

	}
	
	public static void main(String[] args) {

		listCars();
		String prompt = "\nSelect which car you would like to buy (enter car ID number):";
		int userCarChoice = Validator.getInt(scnr, prompt);

		showCarById(userCarChoice);
		System.out.println("Is this the car you would like to purchase?");
		String userFinal = scnr.nextLine();

		//while (Validator.getYesNo(scnr, userFinal)) {
			if (userFinal.equalsIgnoreCase("yes")) {
			System.out.println("Thanks for your purchase!\n");
			System.out.println("Remaining inventory: ");
			buyCar(userCarChoice);
			listCars();
			} else System.out.println("Thanks for stopping by!");
		}

//	}

	public static void listCars() {
		// print out each car
		for (int i = 0; i < cars.size(); i++) {
			System.out.println("Car " + (i + 1) + ": " + cars.get(i));
		}
	}

	public static void showCarById(int id) {
		System.out.println(cars.get(id - 1));
	}

	public static void buyCar(int id) {
		cars.remove(id - 1);
	}

}
