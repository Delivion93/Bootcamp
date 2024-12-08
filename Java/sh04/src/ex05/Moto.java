package ex05;

public class Moto extends Vehicle{
    private boolean sidecar;

    public Moto(String brand, String model, boolean sidecar) {
        super(brand, model);
        this.sidecar = sidecar;
    }

    public boolean isSidecar() {
        return sidecar;
    }


    @Override
    public String toString() {
        return "Moto{" +
                "sidecar=" + isSidecar() +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                '}';
    }
}
