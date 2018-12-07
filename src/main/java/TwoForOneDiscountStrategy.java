import java.util.List;

public class TwoForOneDiscountStrategy implements DiscountStrategy {

    @Override
    public int discount(List<Product> products) {
        int counter = 0;
        int price = 0;
        for (Product p : products) {
            counter++;
            if (counter % 2 == 1) {
                price += p.getPrice();
            }
        }
        return price;
    }
}
