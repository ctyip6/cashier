import java.util.List;

public interface DiscountStrategy {

    int discount(List<Product> products);
}
