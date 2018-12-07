abstract public class Product {

    private final int price;
    private final DiscountStrategy discountStrategy;

    public Product(int price, DiscountStrategy discountStrategy) {
        this.price = price;
        this.discountStrategy = discountStrategy;
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public int getPrice() {
        return price;
    }

}
