import java.util.Random;

public class PassengerSource {
    private Company company;
    private Random random = new Random();

    public PassengerSource(Company company) {
        this.company = company;
    }

    public boolean requestPickup() {
        Passenger p = new Passenger();
        Location pickup = new Location(random.nextInt(101), random.nextInt(101));
        Location destination = new Location(random.nextInt(101), random.nextInt(101));
        return company.scheduleVehicle(p, pickup, destination);
    }
}
