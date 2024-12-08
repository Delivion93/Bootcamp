package ex06;

public class PublicAirport extends Airport{
    private int financing;
    private int numberOfDisabledWorkers;

    public int getFinancing() {
        return financing;
    }

    public int getNumberOfDisabledWorkers() {
        return numberOfDisabledWorkers;
    }

    public PublicAirport() {
    }

    public PublicAirport(String name, int yearOpening, int capacity, int financing, int numberOfDisabledWorkers) {
        super(name, yearOpening, capacity);
        this.financing = financing;
        this.numberOfDisabledWorkers = numberOfDisabledWorkers;
    }

    @Override
    public void totalEarnings(int count) {

    }
}
