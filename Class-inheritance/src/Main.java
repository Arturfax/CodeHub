public class Main {
    public static void main(String[] args) {
        // Creating engine for object Car
        Engine carEngine = new Engine(150, 120, 20, "Car");

        // Car object Creating
        Car car = new Car(
                "Peugeot", "207", "Blue", 3.75, 2, 1.60,
                carEngine,
                700,
                5
        );
        // Creating Engine for Truck object
        Engine truckEngine = new Engine(900, 700, 40, "Truck");

        // Truck object Creating
        Truck truck = new Truck(
                "Volvo", "super-fast", "White", 9, 3, 4,
                truckEngine,
                50000
        );

    }
}