package MiniTest.MiniTest2;

public class Drinks extends Product {
    private double volume;
    private String bottleType;


    public Drinks(int id, String name, int price, int quantity, Category category) {
        super(name, price, quantity, category);
    }
}
