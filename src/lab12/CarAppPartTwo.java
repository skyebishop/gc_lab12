package lab12;

import java.util.*;

public class CarAppPartTwo {
	
	public static Scanner scnr = new Scanner(System.in);
	public static List<Car> cars = new ArrayList<>();
	static {
		cars.add(new Car("Subaru","Impreza",2018,24000.00));
		cars.add(new Car("Ford","Focus",2019,45000.00));
		cars.add(new Car("Mitsubishi","Lancer",2020,23000.00));
		cars.add(new UsedCar("Toyota","Rav4",2009,5000.00,19000.00));
		cars.add(new UsedCar("Nissan","Cube",2002,2.00,500.00));
		cars.add(new UsedCar("Subaru","Crossover",2004,6000.00,12000.00));
		
	}
	
	public static void main(String[] args) {
		
		listCars();
		System.out.println("\nSelect which car you would like to buy (enter car ID number):");
		int userCarChoice = scnr.nextInt();
		
		showCarById(userCarChoice); 
		System.out.println("Is this the car you would like to purchase?");
		String userFinal = scnr.next();
		
		if (userFinal.equalsIgnoreCase("yes")) {
			System.out.println("Thanks for your purchase!\n");
			System.out.println("Remaining inventory: ");
			buyCar(userCarChoice);
			listCars();
		}		
		
	}
	
	public static void listCars() {
		//print out each car
		for (int i=0; i<cars.size(); i++) {
		System.out.println("Car " + (i+1) + ": " + cars.get(i));
		}
	}
	
	public static void showCarById(int id) {
		System.out.println(cars.get(id - 1));
	}
	
	public static void buyCar(int id) {
		cars.remove(id -1);
	}

}

