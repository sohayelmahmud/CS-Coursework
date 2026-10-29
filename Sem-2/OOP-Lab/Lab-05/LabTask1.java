class Address {
    private String streetNo;
    private String houseNo;
    private String city;

    public Address() {
        this.streetNo = "12";
        this.houseNo = "612";
        this.city = "Islamabad";
    }

    public Address(String streetNo, String houseNo, String city) {
        this.streetNo = streetNo;
        this.houseNo = houseNo;
        this.city = city;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void displayAddress() {
        System.out.println("House #: " + houseNo + ", Street #: " + streetNo + ", City: " + city);
    }
}

class Person {
    private String name;
    private Address address;

    public Person() {
        this.name = "Jim";
        this.address = new Address();
    }

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.print("Address: ");
        address.displayAddress();

    }
}

public class LabTask1 {
    public static void main(String[] args) {
        Address addr1 = new Address("12", "45-B", "Islamabad");

        Person person1 = new Person("Sohayel Mahmud", addr1);

        System.out.println("--- Person 1 Details ---");
        person1.displayPersonInfo();

        Person person2 = new Person();
        person2.setName("Hajjaj Mahmud");

        person2.getAddress().setHouseNo("101");
        person2.getAddress().setStreetNo("5");
        person2.getAddress().setCity("Tabuk");

        System.out.println("\n--- Person 2 Details ---");
        person2.displayPersonInfo();
    }
}