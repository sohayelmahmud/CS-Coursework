
// ElectronicsStore
import java.util.ArrayList;

abstract class Product {
    private String name;
    private String brand;
    private double price;
    private String category;

    Product(String name, String brand, double price, String category) {
        this.name = name;
        this.brand = brand;
        setPrice(price);
        this.category = category;
    }

    // controlled access -- encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price! Must be greater than zero.");
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // abstract display
    public abstract void displayDetails();

    // compare 2 products
    public boolean equals(Product other) {
        if (other == null)
            return false;
        return this.name.equals(other.name)
                && this.brand.equals(other.brand)
                && this.category.equals(other.category);
    }
}

class Laptop extends Product {
    private String processorType;
    private int ramSize;

    Laptop(String name, String brand, double price, String category,
            String processorType, int ramSize) {
        super(name, brand, price, category);
        this.processorType = processorType;
        this.ramSize = ramSize;
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Laptop ---");
        System.out.println("Name: " + getName());
        System.out.println("Brand: " + getBrand());
        System.out.println("Price: Rs. " + getPrice());
        System.out.println("Category: " + getCategory());
        System.out.println("Processor: " + processorType);
        System.out.println("RAM: " + ramSize + " GB");
    }
}

class Smartphone extends Product {
    private String cameraResolution;
    private int batteryCapacity;

    Smartphone(String name, String brand, double price, String category,
            String cameraResolution, int batteryCapacity) {
        super(name, brand, price, category);
        this.cameraResolution = cameraResolution;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Smartphone ---");
        System.out.println("Name: " + getName());
        System.out.println("Brand: " + getBrand());
        System.out.println("Price: Rs. " + getPrice());
        System.out.println("Category: " + getCategory());
        System.out.println("Camera: " + cameraResolution);
        System.out.println("Battery: " + batteryCapacity + " mAh");
    }
}

// order class -- single or multiple products using same operation
class Order {
    private ArrayList<Product> products = new ArrayList<>();

    // single
    public void placeOrder(Product p) {
        if (p != null)
            products.add(p);
    }

    // multiple -- same operation name, overloaded
    public void placeOrder(Product[] items) {
        if (items != null) {
            for (Product p : items) {
                if (p != null)
                    products.add(p);
            }
        }
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : products)
            total += p.getPrice();
        return total;
    }
}

// billing system receives complete order object
class BillingSystem {
    public void processOrder(Order order) {
        System.out.println("\n======= RECEIPT =======");
        for (Product p : order.getProducts()) {
            System.out.println(p.getName() + " (" + p.getBrand() + ") - Rs. " + p.getPrice());
        }
        System.out.println("-----------------------");
        System.out.println("Total Bill: Rs. " + order.calculateTotal());
        System.out.println("=======================");
    }
}

public class BCS_SP26_1 {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("ThinkPad X1", "Lenovo", 150000, "Laptop", "Intel i7", 16);
        Laptop laptop2 = new Laptop("ThinkPad X1", "Lenovo", 150000, "Laptop", "Intel i7", 16);
        Smartphone phone1 = new Smartphone("Galaxy S24", "Samsung", 90000, "Smartphone", "200MP", 5000);
        Smartphone phone2 = new Smartphone("iPhone 15", "Apple", 180000, "Smartphone", "48MP", 4500);

        System.out.println("=== Product Details ===");
        laptop1.displayDetails();
        phone1.displayDetails();
        phone2.displayDetails();

        System.out.println("\n=== Comparison ===");
        System.out.println("laptop1 equals laptop2? " + laptop1.equals(laptop2));
        System.out.println("phone1 equals phone2? " + phone1.equals(phone2));

        // invalid price test -- encapsulation
        System.out.println("\n=== Invalid Price Attempt ===");
        phone1.setPrice(-500);

        // single product order
        BillingSystem billing = new BillingSystem();
        Order order1 = new Order();
        order1.placeOrder(laptop1);
        billing.processOrder(order1);

        // bundle order: work from Home kit -- laptop + smartphones
        Order order2 = new Order();
        order2.placeOrder(new Product[] { laptop2, phone1, phone2 });
        billing.processOrder(order2);
    }
}