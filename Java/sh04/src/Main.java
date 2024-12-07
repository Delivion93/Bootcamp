import ex01.Book;
import ex02.PC;
import exeptions.IncorrectRamException;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("978-3-16-148410-0","1984",328,"George Orwell");
        book.borrow();
        book.borrow();
        book.returnBook();
        book.returnBook();
        book.print();
        System.out.println(book);

        PC pc1;
        PC pc2;
        PC pc3;

//        test of exeption
//        try {
//            pc = new PC("ROG","Zephyrus",17,500);
//        } catch (IncorrectRamException e) {
//            throw new RuntimeException(e);
//        }

        try {
            pc1 = new PC("ROG","Zephyrus",16,500);
        } catch (IncorrectRamException e) {
            throw new RuntimeException(e);
        }

        try {
            pc2 = new PC("ROG","Zephyrus",32,2000);
        } catch (IncorrectRamException e) {
            throw new RuntimeException(e);
        }try {
            pc3 = new PC("Alienware","Z501",32,2000);
        } catch (IncorrectRamException e) {
            throw new RuntimeException(e);
        }

        System.out.println("pc1.equals(pc2) = " + pc1.equals(pc2));
        System.out.println("pc2.equals(pc3) = " + pc2.equals(pc3));

        pc1.transferFiles(1000);
        pc2.transferFiles(1000);

        pc1.turnOn();
        pc2.turnOn();

        pc1.transferFiles(1000);
        pc2.transferFiles(1000);

        System.out.println(pc1);
        System.out.println(pc2);
        System.out.println(pc3);

    }
}
