package ex04;

public class RefrigeratedProduct extends Product{
    private int drawerNumber;

    public RefrigeratedProduct() {
    }

    public RefrigeratedProduct(String name, float price, int drawerNumber) {
        super(name, price);
        this.drawerNumber = drawerNumber;
    }

    @Override
    public String toString() {
        return "RefrigeratedProduct { " +
                "ID = " + getId() +
                ", Name = '" + getName() + '\'' +
                ", Price = " + getPrice() +
                ", Drawer Number = " + drawerNumber +
                " }";
    }

}
