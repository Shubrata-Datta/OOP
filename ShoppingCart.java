class Cart {
    private double total = 0;

    void addItem(double price) {
        total += price;
    }

    void removeItem(double price) {
        total -= price;
    }

    double getTotal() {
        return total;
    }
}

public class ShoppingCart{
    public static void main(String[] args) {
        Cart cart = new Cart();

        cart.addItem(100);
        cart.addItem(200);
        cart.addItem(300);

        cart.removeItem(200);

        System.out.println("Total price: " + cart.getTotal());
    }
}
