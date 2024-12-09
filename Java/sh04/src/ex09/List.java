package ex09;

import java.util.Arrays;

public class List<T> implements Listable<T>{

    public static final int DEFAULT_CAPACITY = 10;

    private T [] elements;
    private int numbersOfElements=0;

    public List() {
        elements=(T[]) new Object[DEFAULT_CAPACITY];
    }
    public List(int size) {
        size=Math.abs(size);
        elements=(T[]) new Object[size];
    }

    @Override
    public int position(T value) {
        if(numbersOfElements==0){
            return -1;
        }
        for (int i = 0; i < numbersOfElements-1; i++) {
            if(elements[i].equals(value)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean add(T value) {
        if(numbersOfElements==elements.length){
            return false;
        }
        if(position(value)!=-1){
            return false;
        }
        elements[numbersOfElements++]=value;
        return true;
    }

    @Override
    public int size() {
        return numbersOfElements;
    }

    @Override
    public boolean delete(T value) {
        int index = position(value);
        if(index==-1){
            return false;
        }
        for (int i = index;i<numbersOfElements-1;i++){
            elements[i]=elements[i+1];
        }
        elements[--numbersOfElements]=null;
        return true;
    }

    @Override
    public void list() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < numbersOfElements; i++) {
            sb.append(elements[i]);
            if(i==numbersOfElements-1){
                sb.append("]");
            }else{
                sb.append(",");
            }
        }
        System.out.println(sb);
    }

    @Override
    public void toEmpty() {
        Arrays.fill(elements, null);
        numbersOfElements=0;
    }
}
