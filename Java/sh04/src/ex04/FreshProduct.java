package ex04;

public class FreshProduct extends Product{
    private int daysOfExpiration;

    public FreshProduct() {
    }

    public FreshProduct(String name, float price, int daysOfExpiration) {
        super(name, price);
        this.daysOfExpiration = daysOfExpiration;
    }

    @Override
    public float byu(int quantity) {
        float toPay = this.getPrice()*quantity;
        if(daysOfExpiration>=3&&daysOfExpiration<=5){
            toPay*=0.6f;
        }else if(daysOfExpiration<3){
            toPay*= 0.3f;
        }
        return toPay;
    }

    @Override public String toString() {
        return "FreshProduct { " +
                "ID = " + getId() +
                ", Name = '" + getName() +
                '\'' + ", Price = " + getPrice() +
                ", Days of Expiration = " + daysOfExpiration +
                " }";
    }
}
