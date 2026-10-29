public class person {
    protected String name;
    protected String id;
    protected int phone;

    public person() {
        name = "Sohayel Mahmud";
        id = "SP26-BCS-114";
        phone = 12345;
    }

    public person(String a, String b, int c) {
        name = a;
        id = b;
        phone = c;
    }

    public void setName(String a) {
        name = a;
    }

    public void setId(String j) {
        id = j;
    }

    public void setPhone(int a) {
        phone = a;
    }

    public String getName() {
        return name;
    }

    public String getid() {
        return id;
    }

    public int getPhone() {
        return phone;
    }

    public void display() {
        System.out.println("Name : " + name + "\nID : " + id + "\nPhone : " +
                phone);
    }
}
