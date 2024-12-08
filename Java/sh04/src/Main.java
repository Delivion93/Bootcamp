import ex01.Book;
import ex02.PC;
import ex03.Department;
import ex03.Employees;
import exeptions.IncorrectNifFormatExeption;
import exeptions.IncorrectRamException;

public class Main {
    public static void main(String[] args) {

//        ex01

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

//        ex02

//        test of exeption
//        try {
//            pc = new PC("ROG","Zephyrus",17,500);
//        } catch (IncorrectRamException e) {
//            throw new RuntimeException(e);
//        }

        try {
            pc1 = new PC("ROG","Zephyrus",16,500);
            pc2 = new PC("ROG","Zephyrus",32,2000);
            pc3 = new PC("Alienware","Z501",32,2000);
            System.out.println("pc1.equals(pc2) = " + pc1.equals(pc2));
            System.out.println("pc2.equals(pc3) = " + pc2.equals(pc3));

            pc1.transferFiles(1000);
            pc2.transferFiles(1000);

            pc1.turnOn();
            pc2.turnOn();

            pc1.transferFiles(1000);
            pc2.transferFiles(1000);

            System.out.println();
            System.out.println(pc1);
            System.out.println(pc2);
            System.out.println(pc3);
        } catch (IncorrectRamException e) {
            e.printStackTrace();
        }

//        ex03

        try {

            Employees emp1 = new Employees("1-AAAAA-1", "Ivan", 35,  Department.ACCOUNTING, true, "2-BBBBBBB-2");
            Employees emp2 = new Employees("2-CCCCC-2", "Maria", 28, Department.IT, false, "3-CCCCCCC-3");
            Employees emp3 = new Employees("3-DDDDD-3", "Emilio", 45, Department.MANAGEMENT, true, "4-DDDDDDD-4");
            Employees emp4 = new Employees("1-AAAAA-1", "Artem", 31, Department.IT, true, "5-FFFFFFF-5");

            System.out.println();
            System.out.println(emp1);
            emp1.calcSalary();
            System.out.println();

            System.out.println(emp2);
            emp2.calcSalary();
            System.out.println();

            System.out.println(emp3);
            emp3.calcSalary();
            System.out.println();



            System.out.println("emp1 equals emp2: " + emp1.equals(emp2));
                        System.out.println("emp1 equals emp3: " + emp1.equals(emp3));

                        System.out.println("emp2 equals emp3: " + emp2.equals(emp3));
            System.out.println("emp1 equals emp4: " + emp1.equals(emp4));

        } catch (IncorrectNifFormatExeption e) {
            e.printStackTrace();
        }


    }
}

