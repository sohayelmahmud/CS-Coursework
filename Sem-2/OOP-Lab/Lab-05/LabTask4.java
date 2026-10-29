class Pizza {
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }

    public double calcCost() {
        int baseCost = 10;
        if (size.equalsIgnoreCase("medium"))
            baseCost = 12;
        else if (size.equalsIgnoreCase("large"))
            baseCost = 14;

        int totalToppings = cheeseToppings + pepperoniToppings + hamToppings;
        return baseCost + (2 * totalToppings);
    }

    public String getDescription() {
        return "Size: " + size + ", Cheese: " + cheeseToppings +
                ", Pepperoni: " + pepperoniToppings + ", Ham: " + hamToppings +
                ", Cost: $" + calcCost();
    }
}

class PizzaOrder {
    private Pizza p1;
    private Pizza p2;
    private Pizza p3;

    public void setPizza1(Pizza p) {
        this.p1 = p;
    }

    public void setPizza2(Pizza p) {
        this.p2 = p;
    }

    public void setPizza3(Pizza p) {
        this.p3 = p;
    }

    public double calcTotal() {
        double total = 0;
        if (p1 != null)
            total += p1.calcCost();
        if (p2 != null)
            total += p2.calcCost();
        if (p3 != null)
            total += p3.calcCost();
        return total;
    }
}

public class LabTask4 {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("large", 1, 1, 2);
        Pizza p2 = new Pizza("medium", 2, 0, 1);

        System.out.println(p1.getDescription());
        System.out.println(p2.getDescription());

        PizzaOrder order = new PizzaOrder();
        order.setPizza1(p1);
        order.setPizza2(p2);

        System.out.println("Total Cost: $" + order.calcTotal());
    }
}