package pizzaOrder;

import java.util.Scanner;

public class EdgeFlavors {
    int et;
    String border = "";
    double edgePrice;
    int validator = 0;
    Order order = new Order();

    public int validateEdge(int et) {
        switch (et) {
            case 1:
                selectBorder();
                validator = 1;
                break;
            case 2:
                break;
        }
        return 0;
    }

    public String selectBorder() {
        Scanner entrance = new Scanner(System.in);
        System.out.println("Choose an edge flavor");
        System.out.println("[1] - Sesame");
        System.out.println("[2] - Cream Cheese");
        System.out.println("[3] - Cheddar ");
        System.out.println("[4] - Pepperoni");
        System.out.println("Insert a edge flavor:");
        et = entrance.nextInt();
        switch (et) {
            case 1:
                border = "Sesame";
                edgePrice = 3;
                break;
            case 2:
                border = "Cream Cheese";
                edgePrice = 3;
                break;
            case 3:
                border = "Cheddar";
                edgePrice = 3;
                break;
            case 4:
                border = "Pepperoni";
                edgePrice = 3;
                break;
        }
        return border;
    }
}
