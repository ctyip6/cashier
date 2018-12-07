public class Apple extends Product {

    public static DiscountStrategy discountStrategy = new TwoForOneDiscountStrategy();

    public Apple() {
        super(10, new TwoForOneDiscountStrategy());

    }

}
