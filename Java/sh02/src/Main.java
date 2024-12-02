import Animal.*;
import Employee.Employee;
import Person.Person;
import Student.Student;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person("Artem", 31);
//        person.printDetails();
//        person.setName("Carlos");
//        person.setAge(30);
//        person.printDetails();
//
//        Student student = new Student("Ana",20,"Engineering");
//        student.printDetails();

//        Person[] persons = {
//                new Student("Ana", 20, "Ingeniería"),
//                new Employee("Luis", 30, 50000),
//                new Person("Marta", 40)
//        };
//
//        for (Person person1 : persons) {
//            person1.printDetails();
//        }

         Animal dog = new Dog();
         Animal cat = new Cat();

         dog.makeSound();
         cat.makeSound();
    }
}
