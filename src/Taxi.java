import java.util.ArrayList;
import java.util.Collection;

public class Taxi {
	String licensePlate = "A TX 1234";
	String model = "Mercedes-Benz W123";
	boolean hasGoal = false;
	byte seats = 5;
	ArrayList<String> passengers = new ArrayList<>(seats);


	public Taxi() {
		this.passengers.add("Driver");
	}

	public Taxi(String licensePlate, String model, byte seats) {
		this.licensePlate = licensePlate;
		this.model = model;
		this.seats = seats;

		this.passengers.add("Driver");

	}

	public Taxi(String licensePlate, String model, byte seats, String driverName) {
		this.licensePlate = licensePlate;
		this.model = model;
		this.seats = seats;

		this.passengers.add(driverName);
	}

	public Taxi(String licensePlate, String model, byte seats, String driverName, Collection<? extends String> passengers) {
		this.licensePlate = licensePlate;
		this.model = model;
		this.seats = seats;

		this.passengers.add(driverName);
		this.passengers.addAll(passengers);
	}

	public void addPassenger(String name) {
		if (this.passengers.size() == this.seats) return;

		this.passengers.add(name);
	}

	public void setHasGoal(boolean hasGoal) {
		this.hasGoal = hasGoal;
	}

	public void start() {
		System.out.println("Vroom Vroom!");
	}
}
