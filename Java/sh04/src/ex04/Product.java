package ex04;

public class Product {

    private static int idCounter=1;
    private int id;
    private String name;
    private float price;

    public Product() {

    }

    public static int getIdCounter() {
        return idCounter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public Product(String name, float price) {
        this.id=idCounter;
        this.name = name;
        this.price = price;
        idCounter++;
    }

    public void byu(int quantity){
        float toPay = price*quantity;
        System.out.println("total cost is "+toPay);
    }

    @Override
    public String toString() {
        return "Product { " +
                "ID = " + id +
                ", Name = '" + name + '\'' +
                ", Price = " + price +
                " }";
    }

}
