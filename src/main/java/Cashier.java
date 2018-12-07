import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Cashier {

    private final Map<Class<? extends Product>, DiscountStrategy> productDiscountStrategyMap;

    public Cashier(Map<Class<? extends Product>, DiscountStrategy> productDiscountStrategyMap) {
        this.productDiscountStrategyMap = productDiscountStrategyMap;
    }

    public int checkout(Product... products) {
        Map<Class<? extends Product>, List<Product>> map = Arrays.stream(products)
                .collect(Collectors.groupingBy(Product::getClass));
        return map.entrySet().stream()
                .mapToInt(entry -> productDiscountStrategyMap.get(entry.getKey()).discount(entry.getValue()))
                .sum();
    }
}
