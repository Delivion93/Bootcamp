package ex06;

public abstract class Airport {
    private static int idCounter=1;
    private int id;
    private String name;
    private int yearOpening;
    private int capacity;

    public Airport() {
    }


    public Airport(String name, int yearOpening, int capacity) {
        this.id=idCounter;
        idCounter++;
        this.name = name;
        this.yearOpening = yearOpening;
        this.capacity = capacity;
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

    public int getYearOpening() {
        return yearOpening;
    }

    public int getCapacity() {
        return capacity;
    }

    public abstract void totalEarnings(int count);
}
