class HotDogStand {
    private int idNumber;
    private int soldToday;

    public HotDogStand(int idNumber, int soldToday) {
        this.idNumber = idNumber;
        this.soldToday = (soldToday >= 0) ? soldToday : 0;
    }

    public void justSold() {
        soldToday++;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public int getSoldToday() {
        return soldToday;
    }
}

public class LabTask4 {
    public static void main(String[] args) {
        // Stand 1
        HotDogStand stand1 = new HotDogStand(101, 10);
        stand1.justSold();
        stand1.justSold();
        stand1.justSold();
        System.out.println("Stand ID: " + stand1.getIdNumber() + " | Hot Dogs Sold: " + stand1.getSoldToday());

        // Stand 2
        HotDogStand stand2 = new HotDogStand(102, 25);
        stand2.justSold();
        System.out.println("Stand ID: " + stand2.getIdNumber() + " | Hot Dogs Sold: " + stand2.getSoldToday());

        // Stand 3
        HotDogStand stand3 = new HotDogStand(103, 5);
        stand3.justSold();
        stand3.justSold();
        System.out.println("Stand ID: " + stand3.getIdNumber() + " | Hot Dogs Sold: " + stand3.getSoldToday());

    }
}