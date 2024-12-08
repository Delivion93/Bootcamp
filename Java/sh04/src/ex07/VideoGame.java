package ex07;

public class VideoGame implements Lendable{
    private String name;
    private int price;
    private boolean borrowed;
    private int timesBorrowed;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public int getTimesBorrowed() {
        return timesBorrowed;
    }

    public VideoGame(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void lend() {
        if(!borrowed){
            borrowed=true;
            timesBorrowed++;
        }
    }

    @Override
    public void giveBack() {
        if(borrowed){
            borrowed=false;
        }
    }
}
