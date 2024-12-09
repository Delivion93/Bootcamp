package ex09;

public interface Listable <T>{
    public int position(T value);
    public boolean add(T value);
    public int size();
    public boolean delete(T value);
    public void list();
    public void toEmpty();
}
