package ex06;

public class PrivateAirport  extends Airport{
    private int numberOfPartners;

    public PrivateAirport() {
    }

    public PrivateAirport(String name, int yearOpening, int capacity, int numberOfPartners) {
        super(name, yearOpening, capacity);
        this.numberOfPartners = numberOfPartners;
    }

    public int getNumberOfPartners() {
        return numberOfPartners;
    }

    @Override
    public void totalEarnings(int count) {
        int total = count/numberOfPartners;
        System.out.println("total earning is :"+total);
    }
}
