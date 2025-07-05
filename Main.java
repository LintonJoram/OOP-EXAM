public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.addVehicle(new Vehicle()); // Add 1 vehicle

        PassengerSource source = new PassengerSource(company);

        // Make 3 pickup requests
        for (int i = 0; i < 3; i++) {
            boolean success = source.requestPickup();
            System.out.println("Request " + (i + 1) + ": " + (success ? "Success" : "Failed"));
        }

        System.out.println("Lost requests: " + company.getLostRequests());
    }
}
