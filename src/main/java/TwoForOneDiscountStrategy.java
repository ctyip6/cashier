import java.util.List;

public class TwoForOneDiscountStrategy implements DiscountStrategy {

    @Override
    public int discount(List<Product> products) {
        int counter = 1;
        int price = 0;
        for (Product p : products) {
            if (counter % 2 == 0) {
                counter++;
                continue;
            }
            price += p.getPrice();
            counter++;
        }
        return price;
    }
}
