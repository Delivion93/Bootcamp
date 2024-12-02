package Employee;

import Interfaces.Printable;
import Person.Person;

public class Employee extends Person  implements Printable {
    int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public void print() {
        System.out.println("name: "+getName()+" age: "+getAge()+" salary: "+this.salary);
    }


}
