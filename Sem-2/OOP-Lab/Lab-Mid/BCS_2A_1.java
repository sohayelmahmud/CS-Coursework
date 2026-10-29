// RentalAgreement.java
class RentalAgreement {
    String customerName;
    int rentalDays;
    double dailyRate;

    RentalAgreement(String customerName, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    double calculateRentalCost() {
        return rentalDays * dailyRate;
    }
}

// Vehicle.java
class Vehicle {
    int vehicleId;
    String vehicleModel;
    RentalAgreement rentalAgreement;

    Vehicle(int vehicleId, String vehicleModel, RentalAgreement rentalAgreement) {
        this.vehicleId = vehicleId;
        this.vehicleModel = vehicleModel;
        this.rentalAgreement = rentalAgreement;
    }

    double calculateTotalCost() {
        return rentalAgreement.calculateRentalCost();
    }

    void displayDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Model: " + vehicleModel);
        System.out.println("Customer: " + rentalAgreement.customerName);
        System.out.println("Days: " + rentalAgreement.rentalDays);
        System.out.println("Daily Rate: " + rentalAgreement.dailyRate);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

// PremiumVehicle.java
class PremiumVehicle extends Vehicle {
    String luxuryCategory;

    PremiumVehicle(int vehicleId, String vehicleModel, RentalAgreement rentalAgreement, String luxuryCategory) {
        super(vehicleId, vehicleModel, rentalAgreement);
        this.luxuryCategory = luxuryCategory;
    }

    @Override
    double calculateTotalCost() {
        return rentalAgreement.calculateRentalCost() * 0.85; // 15% discount
    }

    @Override
    void displayDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Model: " + vehicleModel);
        System.out.println("Customer: " + rentalAgreement.customerName);
        System.out.println("Days: " + rentalAgreement.rentalDays);
        System.out.println("Daily Rate: " + rentalAgreement.dailyRate);
        System.out.println("Luxury Category: " + luxuryCategory);
        System.out.println("Total Cost (after 15% discount): " + calculateTotalCost());
    }
}

// RentalManager.java
class RentalManager {

    void updateDailyRate(RentalAgreement r, double newRate) {
        if (newRate > 0) {
            r.dailyRate = newRate;
        }
    }

    void displayVehicle(Vehicle v) {
        v.displayDetails();
    }

    Vehicle findVehicleWithHighestRentalCost(Vehicle[] vehicles) {
        if (vehicles == null || vehicles.length == 0)
            return null;

        Vehicle highest = null;
        double maxCost = -1;

        for (Vehicle v : vehicles) {
            if (v != null) {
                double cost = v.calculateTotalCost();
                if (cost > maxCost) {
                    maxCost = cost;
                    highest = v;
                }
            }
        }
        return highest;
    }
}

// Main.java
public class BCS_2A_1 {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[5];

        vehicles[0] = new Vehicle(1, "Toyota Corolla", new RentalAgreement("Ali", 5, 3000));
        vehicles[1] = new Vehicle(2, "Honda Civic", new RentalAgreement("Sara", 3, 4000));
        vehicles[2] = new Vehicle(3, "Suzuki Alto", new RentalAgreement("Rahim", 7, 2000));
        vehicles[3] = new PremiumVehicle(4, "BMW X5", new RentalAgreement("Karim", 4, 10000), "Luxury SUV");
        vehicles[4] = new PremiumVehicle(5, "Mercedes E-Class", new RentalAgreement("Nadia", 2, 15000), "Luxury Sedan");

        RentalManager manager = new RentalManager();
        System.out.println("=== All Vehicles ===");
        for (Vehicle v : vehicles) {
            manager.displayVehicle(v);
            System.out.println("-------------------");
        }

        // Update one vehicle's daily rate
        System.out.println("=== Updating Vehicle 1 Daily Rate ===");
        manager.updateDailyRate(vehicles[0].rentalAgreement, 3500);
        manager.displayVehicle(vehicles[0]);

        // Find highest cost vehicle
        System.out.println("=== Vehicle with Highest Rental Cost ===");
        Vehicle highest = manager.findVehicleWithHighestRentalCost(vehicles);
        if (highest != null) {
            System.out.println("Model: " + highest.vehicleModel);
            System.out.println("Final Cost: " + highest.calculateTotalCost());
        }
    }
}
