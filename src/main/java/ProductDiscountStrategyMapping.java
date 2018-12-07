import java.util.HashMap;
import java.util.Map;

public class ProductDiscountStrategyMapping {

    public static final Map<Class<? extends Product>, DiscountStrategy> MAPPING;

    static {
        Map<Class<? extends Product>, DiscountStrategy> mapping = new HashMap<>();
        mapping.put(Apple.class, new TwoForOneDiscountStrategy());
        mapping.put(Banana.class, new NoDiscountStrategy());
        MAPPING = mapping;
    }
}
