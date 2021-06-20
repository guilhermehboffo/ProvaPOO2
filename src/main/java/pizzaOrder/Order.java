package pizzaOrder;

import java.util.Scanner;

public class Order {

    int x = 0;
    double totalPrice;

    public void order() {
        PizzaSize pizzaSize = new PizzaSize();
        PizzaFlavors pizzaFlavor = new PizzaFlavors();
        EdgeFlavors edgeFlavor = new EdgeFlavors();
        Drinks drink = new Drinks();

        Scanner entrance = new Scanner(System.in);
        System.out.println("Choose a pizza size");
        System.out.println("[1] - Extra Large");
        System.out.println("[2] - Large ");
        System.out.println("[3] - Medium ");
        System.out.println("[4] - Small");
        System.out.println("[5] - Personal");
        System.out.println("Insert a pizza size:");
        pizzaSize.selectSize(entrance.nextInt());

        while (x < pizzaSize.flavorsQuantity) {
            Scanner entrance2 = new Scanner(System.in);
            System.out.println("Choose a piza flavor");
            System.out.println("[1] - Beef Stroganoff");
            System.out.println("[2] - Pepperoni");
            System.out.println("[3] - Marguerita ");
            System.out.println("[4] - Mozzarella");
            System.out.println("[5] - Shrimp");
            System.out.println("[6] - Chocolat Ball");
            System.out.println("[7] - Strawberry with chocolate");
            System.out.println("[8] - Coconut with Chocolate");
            System.out.println("[9] - Nutella");
            System.out.println("Insert a piza flavor:");
            pizzaFlavor.selectPizzaFlavors(entrance2.nextInt());
            x++;
        }
        if (pizzaSize.validator == 0){
        Scanner entrance3 = new Scanner(System.in);
        System.out.println("Do you want to add an edge to your pizza?");
        System.out.println("[1] - Yes");
        System.out.println("[2] - No");
        edgeFlavor.validateEdge(entrance3.nextInt());
        }else{}
        double valor;
        if (edgeFlavor.validator == 1) {
            valor = pizzaSize.borderedPrice;
        } else {
            valor = pizzaSize.sizePrice;
        }
        while (drink.validator == 1) {
            Scanner entrance4 = new Scanner(System.in);
            System.out.println("do you want to add a drink?");
            System.out.println("[1] - Yes");
            System.out.println("[2] - No");
            drink.validateDrink(entrance4.nextInt());
        }
        
        totalPrice = valor + pizzaFlavor.flavorPrice + edgeFlavor.edgePrice + drink.drinkPrice;
        System.out.println("The size of the pizza is: " + pizzaSize.size);
        System.out.println("The chosen flavors were: " + pizzaFlavor.flavorList);
        System.out.println("The chosen edge was: " + edgeFlavor.border);
        System.out.println("The drink chosen was: " + drink.drinkList);
        System.out.println("The total price is: " + totalPrice + " R$!");

    }
}
