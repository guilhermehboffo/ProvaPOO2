package pizzaOrder;

public class Main {

    public static void main(String[] args) {
        Order order = new Order();
        PizzaSize pizzaSize = new PizzaSize();
        PizzaFlavors pizzaFlavor = new PizzaFlavors();
        EdgeFlavors edgeFlavor = new EdgeFlavors();
        Drinks drink = new Drinks();
        order.order();
    }
}
