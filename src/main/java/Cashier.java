import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Cashier {

    public int checkout(Product... products) {
        Map<Class<? extends Product>, List<Product>> map = Arrays.stream(products).collect(Collectors.groupingBy(Product::getClass));
        return map.entrySet().stream().mapToInt(entry -> ProductDiscountStrategyMapping.MAPPING.get(entry.getKey()).discount(entry.getValue())).sum();
    }
}
