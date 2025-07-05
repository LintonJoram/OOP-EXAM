public class Vehicle {
    private boolean available = true;

    public boolean isAvailable() {
        return available;
    }

    public void assign() {
        available = false;
    }

    public void release() {
        available = true;
    }
}
