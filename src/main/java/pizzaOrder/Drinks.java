package pizzaOrder;

import java.util.ArrayList;
import java.util.Scanner;

public class Drinks {
    int et;
    String drink = "";
    double drinkPrice;
    int validator = 1;
    
    ArrayList<String> drinkList = new ArrayList();

    public int validateDrink(int et) {
        switch (et) {
            case 1:
                selectDrink();
                break;
            case 2:
                validator = validator - 1;
                break;
        }
        return 0;
    }
    public ArrayList selectDrink() {
        Scanner entrance = new Scanner(System.in);
        System.out.println("Choose a drink");
        System.out.println("[1] - Soda (500 ML)");
        System.out.println("[2] - Beer (600 ML)");
        System.out.println("[3] - Orange Juice (500 ML)");
        System.out.println("[4] - Water Bottle (500 ML)");
        System.out.println("Insert a drink:");
        et = entrance.nextInt();

        switch (et) {
            case 1:
                drinkList.add("Soda (500 ML)");
                drinkPrice = drinkPrice + 5;
                break;
            case 2:
                drinkList.add("Beer (600 ML)");
                drinkPrice = drinkPrice + 8;
                break;
            case 3:
                drinkList.add("Orange Juice (500 ML)");
                drinkPrice = drinkPrice + 7;
                break;
            case 4:
                drinkList.add("Water Bottle (500 ML)");
                drinkPrice = drinkPrice + 4;
                break;
        }
        return drinkList;
    }
}
