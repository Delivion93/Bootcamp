import ex01.Book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("978-3-16-148410-0","1984",328,"George Orwell");
        book.borrow();
        book.borrow();
        book.returnBook();
        book.returnBook();
        book.print();
    }
}
