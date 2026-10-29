// LendingRecord
class LendingRecord {
    String borrowerName;
    int borrowingDays;
    double dailyCharge;

    LendingRecord(String borrowerName, int borrowingDays, double dailyCharge) {
        this.borrowerName = borrowerName;
        this.borrowingDays = borrowingDays;
        this.dailyCharge = dailyCharge;
    }

    double calculateCharge() {
        return borrowingDays * dailyCharge;
    }
}

// Equipment
class Equipment {
    int equipmentId;
    String equipmentName;
    LendingRecord lendingRecord;

    Equipment(int equipmentId, String equipmentName, LendingRecord lendingRecord) {
        this.equipmentId = equipmentId;
        this.equipmentName = equipmentName;
        this.lendingRecord = lendingRecord;
    }

    double calculateTotalCharge() {
        return lendingRecord.calculateCharge();
    }

    void displayDetails() {
        System.out.println("Equipment ID: " + equipmentId);
        System.out.println("Name: " + equipmentName);
        System.out.println("Borrower: " + lendingRecord.borrowerName);
        System.out.println("Days: " + lendingRecord.borrowingDays);
        System.out.println("Daily Charge: " + lendingRecord.dailyCharge);
        System.out.println("Total Charge: " + calculateTotalCharge());
    }
}

// SpecializedEquipment
class SpecializedEquipment extends Equipment {
    String equipmentCategory;

    SpecializedEquipment(int equipmentId, String equipmentName, LendingRecord lendingRecord, String equipmentCategory) {
        super(equipmentId, equipmentName, lendingRecord);
        this.equipmentCategory = equipmentCategory;
    }

    @Override
    double calculateTotalCharge() {
        return lendingRecord.calculateCharge() * 0.80; // 20% discount
    }

    @Override
    void displayDetails() {
        System.out.println("Equipment ID: " + equipmentId);
        System.out.println("Name: " + equipmentName);
        System.out.println("Borrower: " + lendingRecord.borrowerName);
        System.out.println("Days: " + lendingRecord.borrowingDays);
        System.out.println("Daily Charge: " + lendingRecord.dailyCharge);
        System.out.println("Category: " + equipmentCategory);
        System.out.println("Total Charge (after 20% discount): " + calculateTotalCharge());
    }
}

// EquipmentManager
class EquipmentManager {

    void updateDailyCharge(LendingRecord r, double newCharge) {
        if (newCharge > 0) {
            r.dailyCharge = newCharge;
        }
    }

    void displayEquipment(Equipment e) {
        e.displayDetails();
    }

    Equipment findMostExpensiveEquipment(Equipment[] items) {
        if (items == null || items.length == 0)
            return null;

        Equipment highest = null;
        double maxCharge = -1;

        for (Equipment e : items) {
            if (e != null) {
                double charge = e.calculateTotalCharge();
                if (charge > maxCharge) {
                    maxCharge = charge;
                    highest = e;
                }
            }
        }
        return highest;
    }
}

// Main
public class BCS_2A_2 {
    public static void main(String[] args) {
        EquipmentManager manager = new EquipmentManager();
        Equipment[] items = new Equipment[5];

        items[0] = new Equipment(1, "Projector", new LendingRecord("Sajida", 5, 500));
        items[1] = new Equipment(2, "Laptop", new LendingRecord("Ifrit", 3, 800));
        items[2] = new Equipment(3, "Camera", new LendingRecord("Hajjaj", 7, 600));
        items[3] = new SpecializedEquipment(4, "3D Printer", new LendingRecord("Jim", 4, 2000), "Lab Equipment");
        items[4] = new SpecializedEquipment(5, "Microscope", new LendingRecord("Prince", 2, 1500),
                "Research Equipment");

        System.out.println("=== All Equipment ===");
        for (Equipment e : items) {
            manager.displayEquipment(e);
            System.out.println("-------------------");
        }

        // update one item's daily charge
        System.out.println("=== Updating Equipment 1 Daily Charge ===");
        manager.updateDailyCharge(items[0].lendingRecord, 550);
        manager.displayEquipment(items[0]);

        // find most expensive equipment
        System.out.println("=== Most Expensive Equipment ===");
        Equipment highest = manager.findMostExpensiveEquipment(items);
        if (highest != null) {
            System.out.println("Name: " + highest.equipmentName);
            System.out.println("Final Charge: " + highest.calculateTotalCharge());
        }
    }
}
