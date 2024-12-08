package ex05;

public class SportCar extends Car{
    private boolean convertible;

    public SportCar(String brand, String model, int numberOfDoors, boolean convertible) {
        super(brand, model, numberOfDoors);
        this.convertible = convertible;
    }

    public boolean isConvertible() {
        return convertible;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "convertible=" + convertible +
                ", numberOfDoors=" + getNumberOfDoors() +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                '}';
    }
}
