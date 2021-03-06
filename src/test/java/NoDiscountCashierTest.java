import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class NoDiscountCashierTest {

    Cashier cashier;

    @Before
    public void setUp() {
        Map<Class<? extends Product>, DiscountStrategy> productDiscountMapping = new HashMap<>();
        productDiscountMapping.put(Apple.class, new NoDiscountStrategy());
        productDiscountMapping.put(Banana.class, new NoDiscountStrategy());

        cashier = new Cashier(productDiscountMapping);
    }

    @Test
    public void canGetThePriceOfAnAppleAsTenDollars() {
        assert 10 == cashier.checkout(new Apple());
    }

    @Test
    public void canGetThePriceOfABananaAs12Dollars() {
        assert 12 == cashier.checkout(new Banana());
    }

    @Test
    public void canGetThePriceOfABananaAndAppleAs22Dollars() {
        assert 22 == cashier.checkout(new Banana(), new Apple());
    }

    @Test
    public void canGetThePriceOf2ApplesAs20Dollars() {
        assert 20 == cashier.checkout(new Apple(), new Apple());
    }

    @Test
    public void canGetThePriceOf3ApplesAs30Dollars() {
        assert 30 == cashier.checkout(new Apple(), new Apple(), new Apple());
    }
}
