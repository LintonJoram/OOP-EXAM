import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Vehicle> vehicles = new ArrayList<>();
    private int lostRequests = 0;

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public boolean scheduleVehicle(Passenger p, Location pickup, Location destination) {
        for (Vehicle v : vehicles) {
            if (v.isAvailable()) {
                v.assign();
                System.out.println("Scheduled from " + pickup + " to " + destination);
                return true;
            }
        }
        lostRequests++;
        System.out.println("No vehicle available for request from " + pickup);
        return false;
    }

    public int getLostRequests() {
        return lostRequests;
    }
}
