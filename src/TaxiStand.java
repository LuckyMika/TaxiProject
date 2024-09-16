import java.util.Collection;
import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

public class TaxiStand {
	byte maxTaxis = 0;
	Queue<Taxi> taxiQueue = new LinkedList<>();

	public TaxiStand() {}

	public TaxiStand(byte maxTaxis, Collection<? extends Taxi> taxis) {
		this.maxTaxis = maxTaxis;
		this.taxiQueue = new LinkedList<>(taxis);
	}

	public Optional<Taxi> update() {
		Taxi first = taxiQueue.peek();
		if (first == null || !first.hasGoal) return Optional.empty();

		return Optional.of(taxiQueue.remove());
	}

	public void addTaxi(Taxi taxi) {
		if (taxiQueue.size() == maxTaxis && maxTaxis != 0) {
			return;
		}

		taxiQueue.offer(taxi);
	}

	public void debug() {
		final byte[] i = {0}; // Java async lambda hack
		this.taxiQueue.iterator().forEachRemaining((taxi) -> {
			i[0]++;
			System.out.println(i[0] + ". " + taxi.passengers.getFirst() + " driving " + taxi.licensePlate + " with " + (taxi.passengers.size() - 1) + " passengers.");
		});
	}
}
