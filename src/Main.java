public class Main {
	public static void main(String[] args) {
		TaxiStand taxiStand = new TaxiStand();
		Taxi taxi = new Taxi("A HA 4321", "Volkswagen Golf", (byte) 5, "Peter");
		taxi.addPassenger("Carla");

		taxiStand.addTaxi(taxi);
		taxiStand.addTaxi(new Taxi());
		taxiStand.addTaxi(new Taxi());
		taxiStand.addTaxi(new Taxi());

		System.out.println("Taxi stand:");
		taxiStand.debug();

		System.out.println("Taxi stand updated:");
		taxiStand.update();
		taxiStand.debug();

		taxi.setHasGoal(true);

		System.out.println("Taxi stand updated again:");
		taxiStand.update();
		taxiStand.debug();
	}
}

