package pizzaOrder;

import java.util.ArrayList;

public class PizzaFlavors {

    double flavorPrice;
    PizzaSize size = new PizzaSize();
    ArrayList<String> flavorList = new ArrayList();

    Order order = new Order();

    public ArrayList selectPizzaFlavors(int et) {
        switch (et) {
            case 1:
                flavorList.add("Beef Stroganoff");
                break;
            case 2:
                flavorList.add("Pepperoni");
                break;
            case 3:
                flavorList.add("Marguerita");
                break;
            case 4:
                flavorList.add("Mozzarella");
                break;
            case 5:
                flavorList.add("Shrimp");
                flavorPrice += 5;
                break;
            case 6:
                flavorList.add("Chocolat Ball");
                break;
            case 7:
                flavorList.add("Strawberry with chocolate");
                break;
            case 8:
                flavorList.add("Coconut with Chocolate");
                break;
            case 9:
                flavorList.add("Nutella");
                flavorPrice += 5;
                break;
        }
        return flavorList;
    }
}
