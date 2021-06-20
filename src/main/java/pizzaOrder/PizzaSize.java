package pizzaOrder;

public class PizzaSize {

    int flavorsQuantity;
    double sizePrice;
    double borderedPrice;
    String size;
    int validator = 0;
    EdgeFlavors edgeFlavor = new EdgeFlavors();

    public int selectSize(int et) {

        switch (et) {
            case 1:
                size = "Extra Large"; 
                sizePrice = 80;
                borderedPrice = 85;
                flavorsQuantity = 4;
                break;
            case 2:
                size = "Large";
                sizePrice = 70;
                borderedPrice = 75;
                flavorsQuantity = 4;
                break;
            case 3:
                size = "Medium";
                sizePrice = 55;
                borderedPrice = 60;
                flavorsQuantity = 3;
                break;
            case 4:
                size = "Small"; 
                sizePrice = 40;
                borderedPrice = 45;
                flavorsQuantity = 2;
                break;
            case 5:
                size = "Personal";                
                sizePrice = 30;
                flavorsQuantity = 2;
                validator = 1;
                break;
        }
        return flavorsQuantity;
    }
}
