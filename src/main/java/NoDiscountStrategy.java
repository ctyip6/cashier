import java.util.List;

public class NoDiscountStrategy implements DiscountStrategy {

    @Override
    public int discount(List<Product> products) {
        return products.stream()
                .mapToInt(Product::getPrice)
                .sum();
    }


}
