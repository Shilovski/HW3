package chapter3;

public class Battery {
    private double capacity;
    private double maxCapacity;

    public Battery(double capacity) {
        if ((capacity < 3000) && (capacity > 2000)) {
            maxCapacity = capacity;
            this.capacity = capacity;
        }
    }

    public void drain(double amount) {
        capacity = (capacity - amount < 0) ? 0 : capacity - amount;
    }

    public void charge() {
        capacity = maxCapacity;
    }

    public double getRemainingCapacity() {
        return capacity;
    }

    public static void main(String[] args) {
        Battery battery = new Battery(2500);
        System.out.println(battery.getRemainingCapacity());
        battery.drain(500);
        System.out.println(battery.getRemainingCapacity());
        battery.charge();
        System.out.println(battery.getRemainingCapacity());
        battery.drain(3000);
        System.out.println(battery.getRemainingCapacity());
    }
}
