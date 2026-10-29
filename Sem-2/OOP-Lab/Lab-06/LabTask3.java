class Computer {
    protected int wordSize;
    protected int memorySize;
    protected int storageSize;
    protected double speed;

    public Computer() {
        this.wordSize = 0;
        this.memorySize = 0;
        this.storageSize = 0;
        this.speed = 0.0;
    }

    public Computer(int wordSize, int memorySize, int storageSize, double speed) {
        this.wordSize = wordSize;
        this.memorySize = memorySize;
        this.storageSize = storageSize;
        this.speed = speed;
    }

    public void display() {
        System.out.println("Word Size: " + wordSize + " bits, Memory: " + memorySize +
                " MB, Storage: " + storageSize + " MB, Speed: " + speed + " MHz");
    }
}

class Laptop extends Computer {
    private double length;
    private double width;
    private double height;
    private double weight;

    public Laptop() {
        super();
        this.length = 0.0;
        this.width = 0.0;
        this.height = 0.0;
        this.weight = 0.0;
    }

    public Laptop(int wordSize, int memorySize, int storageSize, double speed,
            double length, double width, double height, double weight) {
        super(wordSize, memorySize, storageSize, speed);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public void display() {
        super.display();
        System.out.println("Dimensions: " + length + "x" + width + "x" + height +
                " inches, Weight: " + weight + " kg");
    }
}

public class LabTask3 {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop(64, 16384, 512000, 3200.0, 14.0, 9.5, 0.7, 1.4);

        laptop1.display();
        laptop2.display();
    }
}