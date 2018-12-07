import org.junit.Test;

public class CashierTest {

    Cashier cashier = new Cashier();

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
    public void canGetBuyOneGetOneFreeForApples() {
        assert 10 == cashier.checkout(new Apple(), new Apple());
    }

    @Test
    public void payFor2ApplesWhenGetting3() {
        assert 20 == cashier.checkout(new Apple(), new Apple(), new Apple());
    }
}
