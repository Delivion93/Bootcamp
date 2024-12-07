package ex01;

import java.text.DecimalFormat;

public class Book {
    private static final float PRINT_PAGE_PRICE = 0.05f;
    private  String isbn;
    private  String title;
    private  int numberOfPages;
    private  String author;
    private boolean borrowed;

    public Book(){

    }

    public Book(String isbn, String title, int numberOfPages, String author) {
        this.isbn = isbn;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
    }

    public void borrow(){
        if (!borrowed){
            borrowed=true;
        }else{
            System.out.println("This book isn't available");
        }
    }

    public void returnBook(){
        if(borrowed){
            borrowed=false;
        }else{
            System.out.println("this book is in the library");
        }
    }

    public void print(){
        double price = (double)PRINT_PAGE_PRICE*numberOfPages;
        DecimalFormat df = new DecimalFormat("#.00");
        String formatedPrice = df.format(price);
        System.out.printf("total price for printing \"%s\" is %s euro",title,formatedPrice);
    }

    @Override
    public String toString() {
        String state;
        if(this.borrowed){
            state="borrowed";
        }else{
            state="in the library";
        }
            return "Book "+isbn+" with title "+title+" and author "+author+" has "+numberOfPages+" pages and is "+state;
    }
}
